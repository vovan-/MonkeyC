package ee.edio.garmin.formatter.settings;

import com.intellij.application.options.IndentOptionsEditor;
import com.intellij.application.options.SmartIndentOptionsEditor;
import com.intellij.lang.Language;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider;
import ee.edio.garmin.MonkeyLanguage;
import org.jetbrains.annotations.NotNull;

public class MonkeyLanguageCodeStyleSettingsProvider extends LanguageCodeStyleSettingsProvider {
  @NotNull
  @Override
  public Language getLanguage() {
    return MonkeyLanguage.INSTANCE;
  }

  @Override
  public IndentOptionsEditor getIndentOptionsEditor() {
    return new SmartIndentOptionsEditor();
  }

  @Override
  public CommonCodeStyleSettings getDefaultCommonSettings() {
    CommonCodeStyleSettings defaultSettings = new CommonCodeStyleSettings(getLanguage());
    CommonCodeStyleSettings.IndentOptions indentOptions = defaultSettings.initIndentOptions();
    indentOptions.INDENT_SIZE = 2;
    indentOptions.CONTINUATION_INDENT_SIZE = 4;
    indentOptions.TAB_SIZE = 2;
    defaultSettings.RIGHT_MARGIN = 80;
    return defaultSettings;
  }

  @Override
  public String getCodeSample(@NotNull SettingsType settingsType) {
    return DEFAULT_CODE_SAMPLE;
  }

  private static final String DEFAULT_CODE_SAMPLE =
      "using ToyBox.System as Sys;\n" +
          "\n" +
          "function main() {\n" +
          "\tSys.println(\"Hello\")\n" +
          "}";
}
