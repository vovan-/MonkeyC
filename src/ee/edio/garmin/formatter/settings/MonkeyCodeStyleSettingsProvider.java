package ee.edio.garmin.formatter.settings;

import com.intellij.application.options.CodeStyleAbstractConfigurable;
import com.intellij.application.options.CodeStyleAbstractPanel;
import com.intellij.application.options.TabbedLanguageCodeStylePanel;
import com.intellij.openapi.options.Configurable;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CodeStyleSettingsProvider;
import ee.edio.garmin.MonkeyLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MonkeyCodeStyleSettingsProvider extends CodeStyleSettingsProvider {
  @Override
  public String getConfigurableDisplayName() {
    return "Monkey C";
  }

  @NotNull
  @Override
  public Configurable createSettingsPage(CodeStyleSettings settings, CodeStyleSettings originalSettings) {
    return new MonkeyCodeStyleConfigurable(settings, originalSettings, getConfigurableDisplayName());
  }


  private class MonkeyCodeStyleConfigurable extends CodeStyleAbstractConfigurable {
    public MonkeyCodeStyleConfigurable(@NotNull CodeStyleSettings settings, CodeStyleSettings cloneSettings, String displayName) {
      super(settings, cloneSettings, displayName);
    }

    @Override
    protected CodeStyleAbstractPanel createPanel(CodeStyleSettings settings) {
      return new MonkeyCodeStyleMainPanel(getCurrentSettings(), settings);
    }

    @Nullable
    @Override
    public String getHelpTopic() {
      return null;
    }

    private class MonkeyCodeStyleMainPanel extends TabbedLanguageCodeStylePanel {
      protected MonkeyCodeStyleMainPanel(CodeStyleSettings currentSettings, CodeStyleSettings settings) {
        super(MonkeyLanguage.INSTANCE, currentSettings, settings);
      }
    }
  }
}
