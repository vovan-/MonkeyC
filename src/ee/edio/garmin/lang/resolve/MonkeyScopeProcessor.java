package ee.edio.garmin.lang.resolve;

import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.BaseScopeProcessor;
import ee.edio.garmin.psi.MonkeyComponentName;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MonkeyScopeProcessor extends BaseScopeProcessor {
  private final List<MonkeyComponentName> result;
  private final String name;

  public MonkeyScopeProcessor(List<MonkeyComponentName> result, String name) {
    this.result = result;
    this.name = name;
  }

  @Override
  public boolean execute(@NotNull PsiElement element, @NotNull ResolveState state) {
    if (!(element instanceof MonkeyComponentName)) return true;
    final MonkeyComponentName componentName = (MonkeyComponentName) element;

    final PsiElement parentElement = componentName.getParent();

    if (this.name.equals(componentName.getName())) {
      this.result.add(componentName);
      return false;
    }
    return true;
  }
}
