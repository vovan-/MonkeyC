package ee.edio.garmin.jps.builder;

import ee.edio.garmin.jps.model.JpsMCModuleProperties;
import ee.edio.garmin.jps.model.JpsMCModuleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.builders.BuildTargetLoader;
import org.jetbrains.jps.builders.ModuleBasedBuildTargetType;
import org.jetbrains.jps.model.JpsModel;
import org.jetbrains.jps.model.JpsSimpleElement;
import org.jetbrains.jps.model.module.JpsTypedModule;

import java.util.ArrayList;
import java.util.List;

public class MCBuildTargetType extends ModuleBasedBuildTargetType<MCBuildTarget> {
  public static final MCBuildTargetType PRODUCTION = new MCBuildTargetType("mc-production", false);
  public static final MCBuildTargetType TESTS = new MCBuildTargetType("mc-tests", true);
  private final boolean tests;

  private MCBuildTargetType(String typeId, boolean tests) {
    super(typeId);
    this.tests = tests;
  }

  public boolean isTests() {
    return tests;
  }

  @NotNull
  @Override
  public List<MCBuildTarget> computeAllTargets(@NotNull JpsModel model) {
    List<MCBuildTarget> targets = new ArrayList<>();
    for (JpsTypedModule<JpsSimpleElement<JpsMCModuleProperties>> module : model.getProject().getModules(JpsMCModuleType.INSTANCE)) {
      targets.add(new MCBuildTarget(this, module));
    }
    return targets;
  }

  @NotNull
  @Override
  public BuildTargetLoader<MCBuildTarget> createLoader(@NotNull final JpsModel model) {
    return new BuildTargetLoader<MCBuildTarget>() {
      @Nullable
      @Override
      public MCBuildTarget createTarget(@NotNull String targetId) {
        for (JpsTypedModule<JpsSimpleElement<JpsMCModuleProperties>> module : model.getProject().getModules(JpsMCModuleType.INSTANCE)) {
          if (module.getName().equals(targetId)) {
            return new MCBuildTarget(MCBuildTargetType.this, module);
          }
        }
        return null;
      }
    };
  }
}