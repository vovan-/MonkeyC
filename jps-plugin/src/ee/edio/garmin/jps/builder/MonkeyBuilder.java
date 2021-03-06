package ee.edio.garmin.jps.builder;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.BaseOSProcessHandler;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.projectRoots.JdkUtil;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.util.SystemProperties;
import com.intellij.util.containers.ContainerUtil;
import ee.edio.garmin.jps.model.JpsMonkeyModuleProperties;
import ee.edio.garmin.jps.model.JpsMonkeyModuleType;
import ee.edio.garmin.jps.model.JpsMonkeySdkType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.builders.BuildOutputConsumer;
import org.jetbrains.jps.builders.DirtyFilesHolder;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.incremental.ProjectBuildException;
import org.jetbrains.jps.incremental.TargetBuilder;
import org.jetbrains.jps.incremental.messages.BuildMessage;
import org.jetbrains.jps.incremental.messages.CompilerMessage;
import org.jetbrains.jps.incremental.resources.ResourcesBuilder;
import org.jetbrains.jps.incremental.resources.StandardResourceBuilderEnabler;
import org.jetbrains.jps.model.JpsDummyElement;
import org.jetbrains.jps.model.JpsElement;
import org.jetbrains.jps.model.JpsSimpleElement;
import org.jetbrains.jps.model.java.JpsJavaExtensionService;
import org.jetbrains.jps.model.library.sdk.JpsSdk;
import org.jetbrains.jps.model.module.JpsModule;
import org.jetbrains.jps.model.module.JpsTypedModule;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class MonkeyBuilder extends TargetBuilder<MonkeySourceRootDescriptor, MonkeyBuildTarget> {
  public static final String NAME = "Monkey C";

  private final static Logger LOG = Logger.getInstance(MonkeyBuilder.class);
  public static final String MONKEYBRAINS_FQN = "com.garmin.monkeybrains.Monkeybrains";
  public static final String MONKEYBRAINS_JAR_FILENAME = "monkeybrains.jar";

  public MonkeyBuilder() {
    super(Arrays.asList(MonkeyBuildTargetType.PRODUCTION, MonkeyBuildTargetType.TESTS));
    ResourcesBuilder.registerEnabler(new StandardResourceBuilderEnabler() {
      @Override
      public boolean isResourceProcessingEnabled(@NotNull JpsModule module) {
        return module.getModuleType() != JpsMonkeyModuleType.INSTANCE;
      }
    });
  }

  @Override
  public void build(@NotNull MonkeyBuildTarget target, @NotNull DirtyFilesHolder<MonkeySourceRootDescriptor, MonkeyBuildTarget> holder,
                    @NotNull BuildOutputConsumer outputConsumer, @NotNull CompileContext context) throws ProjectBuildException, IOException {
    LOG.debug(target.getPresentableName());
    if (!holder.hasDirtyFiles() && !holder.hasRemovedFiles()) return;

    JpsModule jpsModule = target.getModule();
    if (jpsModule.getModuleType() != JpsMonkeyModuleType.INSTANCE) return;

    //JpsTypedModule<JpsSimpleElement<JpsGoModuleProperties>> module =
    JpsTypedModule<JpsSimpleElement<JpsMonkeyModuleProperties>> module = jpsModule.asTyped(JpsMonkeyModuleType.INSTANCE);
    assert module != null;


    final JpsElement propertiesUntyped = target.getModule().getProperties();
    if (!(propertiesUntyped instanceof JpsSimpleElement)) {
      throw new ProjectBuildException("module properties has wrong type");
    }
    @SuppressWarnings("unchecked")
    JpsSimpleElement<JpsMonkeyModuleProperties> properties = (JpsSimpleElement<JpsMonkeyModuleProperties>) propertiesUntyped;
    JpsMonkeyModuleProperties moduleProperties = properties.getData();
    final String targetDeviceId = moduleProperties.TARGET_DEVICE_ID;

    JpsSdk<JpsDummyElement> sdk = getSdk(context, module);

    File outputDirectory = getBuildOutputDirectory(jpsModule, target.isTests(), context);

    for (String contentRootUrl : jpsModule.getContentRootsList().getUrls()) {
      String contentRootPath = new URL(contentRootUrl).getPath();
      final String projectName = context.getProjectDescriptor().getProject().getName();
      final GeneralCommandLine buildCmd = createBuildCmd(projectName, contentRootPath, outputDirectory, sdk.getHomePath(), targetDeviceId);
      runBuildProcess(context, buildCmd, contentRootPath);
    }
  }

  private static void runBuildProcess(@NotNull CompileContext context, @NotNull GeneralCommandLine commandLine, @NotNull String path)
      throws ProjectBuildException {
    try {
      final Process process = commandLine.createProcess();
      BaseOSProcessHandler handler = new BaseOSProcessHandler(process, commandLine.getCommandLineString(), Charset.defaultCharset());
      handler.startNotify();
      handler.waitFor();
    } catch (ExecutionException e) {
      throw new ProjectBuildException(e.getMessage());
    }
  }

  // TODO: paths that contain spaces should be quoted?
  public GeneralCommandLine createBuildCmd(String projectName, String projectRootPath, File outputDirectory, String sdkHomePath, String targetDeviceId) {
    final File projectRoot = new File(FileUtil.toSystemIndependentName(projectRootPath));

    // TODO: Use module sources functionality instead
    Pattern sourcePattern = Pattern.compile(".*\\.mc");
    final List<File> mcFiles = FileUtil.findFilesByMask(sourcePattern, projectRoot);
    final ImmutableList<String> sourceFilePaths = FluentIterable.from(mcFiles)
        .transform(new Function<File, String>() {
          @Override
          public String apply(File file) {
            return file.getAbsolutePath();
          }
        }).toList();

    // TODO: Use module resources functionality instead
    Pattern resourcePattern = Pattern.compile(".*\\.xml");
    final List<File> xmlFiles = FileUtil.findFilesByMask(resourcePattern, projectRoot);
    final ImmutableList<String> resourceFilePaths = FluentIterable.from(xmlFiles)
        .filter(new Predicate<File>() {
          @Override
          public boolean apply(File file) {
            return file != null && file.getParentFile().getAbsolutePath().contains("resource");
          }
        })
        .transform(new Function<File, String>() {
          @Override
          public String apply(File file) {
            return file.getAbsolutePath();
          }
        }).toList();

    String sdkPath = sdkHomePath + File.separator;
    String sdkBinPath = sdkPath + "bin" + File.separator;

    String outputName = projectName + ".prg";

    String outputDir = outputDirectory.getAbsolutePath() + File.separator;

    ImmutableList.Builder<String> parameters = ImmutableList.<String>builder()
        .add("-a", sdkBinPath + "api.db")
        .add("-i", sdkBinPath + "api.debug.xml")
        .add("-o", outputDir + outputName);
//        .add("-w") // Show compilation warnings in the Console
//        .add("-g") // Print debug output (-g)


    if (!resourceFilePaths.isEmpty()) {
      // in format: -z C:\xyz\resources\layouts\layout.xml;C:\xyz\resources\menus\menu.xml;C:\xyz\resources\resources.xml
      StringBuilder builder = new StringBuilder();
      for (String resourceFilePath : resourceFilePaths) {
        // if not first
        if (builder.length() != 0) {
          builder.append(File.pathSeparator);
        }
        builder.append(resourceFilePath);
      }
      parameters.add("-z", builder.toString());
    }

    String manifestXmlPath = projectRootPath + File.separator + "manifest.xml";
    String devicesXmlPath = sdkBinPath + "devices.xml";
    String projectInfoXmlPath = sdkBinPath + "projectInfo.xml"; // todo: is this file optional?
    parameters.add("-m", manifestXmlPath)
        .add("-u", devicesXmlPath)
        .add("-p", projectInfoXmlPath); // optional file?

    // in format: C:\xyz\source\aaApp.mc C:\xyz\source\aaMenuDelegate.mc C:\xyz\source\aaView.mc
    parameters.addAll(sourceFilePaths);

    final String deviceId = targetDeviceId != null ? targetDeviceId : "round_watch";
    final String deviceSim = deviceId + "_sim";
    // parameters.add("-r"); // if release build
    parameters.add("-d", deviceSim);

    //final String javaHome = SystemProperties.getJavaHome();
    //String javaPath = javaHome + File.separator + "bin" + File.separator + "java";
    final String jdkHome = findRealJdkHome() + File.separator;
    String javaPath = jdkHome + "bin" + File.separator + "java";
    String toolsJarPath = jdkHome + "lib" + File.separator + "tools.jar";
    String monkeybrainsJarPath = sdkBinPath + MONKEYBRAINS_JAR_FILENAME;
    GeneralCommandLine commandLine = new GeneralCommandLine();
    commandLine.setExePath(javaPath);
    commandLine.addParameters("-Dfile.encoding=UTF-8", "-Dapple.awt.UIElement=true");
    String classPath = toolsJarPath + ";" + monkeybrainsJarPath + ";";
    commandLine.addParameters("-classpath", classPath);
    commandLine.addParameters(MONKEYBRAINS_FQN);
    commandLine.addParameters(parameters.build());

    return commandLine;
  }

  // searches some common directories and misconfigurations
  public static String findRealJdkHome() {
    String javaHome = SystemProperties.getJavaHome();
    List<String> paths = ContainerUtil.packNullables(javaHome, new File(javaHome).getParent(), System.getenv("JDK_16_x64"), System.getenv("JDK_16"));
    for (String path : paths) {
      if (JdkUtil.checkForJdk(new File(path))) {
        return path;
      }
    }
    throw new RuntimeException("could not find JDK");
  }

  @NotNull
  private static JpsSdk<JpsDummyElement> getSdk(@NotNull CompileContext context,
                                                @NotNull JpsModule module) throws ProjectBuildException {
    JpsSdk<JpsDummyElement> sdk = module.getSdk(JpsMonkeySdkType.INSTANCE);
    if (sdk == null) {
      String errorMessage = "No SDK for module " + module.getName();
      context.processMessage(new CompilerMessage(NAME, BuildMessage.Kind.ERROR, errorMessage));
      throw new ProjectBuildException(errorMessage);
    }
    return sdk;
  }


  @NotNull
  private static File getBuildOutputDirectory(@NotNull JpsModule module,
                                              boolean forTests,
                                              @NotNull CompileContext context) throws ProjectBuildException {
    JpsJavaExtensionService instance = JpsJavaExtensionService.getInstance();
    File outputDirectory = instance.getOutputDirectory(module, forTests);
    if (outputDirectory == null) {
      String errorMessage = "No output dir for module " + module.getName();
      context.processMessage(new CompilerMessage(NAME, BuildMessage.Kind.ERROR, errorMessage));
      throw new ProjectBuildException(errorMessage);
    }
    if (!outputDirectory.exists()) {
      FileUtil.createDirectory(outputDirectory);
    }
    return outputDirectory;
  }

  @NotNull
  @Override
  public String getPresentableName() {
    return NAME;
  }
}
