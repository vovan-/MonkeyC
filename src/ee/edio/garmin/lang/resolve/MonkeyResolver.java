package ee.edio.garmin.lang.resolve;

import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.impl.source.resolve.ResolveCache;
import com.intellij.psi.util.PsiTreeUtil;
import ee.edio.garmin.psi.MonkeyComponentName;
import ee.edio.garmin.psi.MonkeyReference;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MonkeyResolver implements ResolveCache.AbstractResolver<MonkeyReference, List<? extends PsiElement>> {
  public static final MonkeyResolver INSTANCE = new MonkeyResolver();

  @Override
  public List<? extends PsiElement> resolve(MonkeyReference reference, boolean incompleteCode) {
    return resolveSimpleReference(reference);
    //return null;
  }

  private List<? extends PsiElement> resolveSimpleReference(@NotNull MonkeyReference reference) {

    final List<? extends PsiElement> result = resolveSimpleReference(reference, reference.getCanonicalText());

    return result;
  }

  @NotNull
  public static List<? extends PsiElement> resolveSimpleReference(@NotNull final PsiElement scopeElement, @NotNull final String name) {
    final List<MonkeyComponentName> result = new ArrayList<>();
    // local
    final MonkeyScopeProcessor monkeyResolveProcessor = new MonkeyScopeProcessor(result, name);
    PsiTreeUtil.treeWalkUp(monkeyResolveProcessor, scopeElement, null, ResolveState.initial());

/*    // supers
    final DartClass dartClass = PsiTreeUtil.getParentOfType(scopeElement, DartClass.class);
    final boolean inClass = PsiTreeUtil.getParentOfType(scopeElement, DartClassBody.class, false) != null;
    if (result.isEmpty() && dartClass != null && inClass) {
      final DartComponent field = filterAccess(scopeElement, dartClass.findMembersByName(name));
      if (field != null) {
        return toResult(field.getComponentName());
      }
    }

    // global
    if (result.isEmpty()) {
      final List<VirtualFile> libraryFiles = DartResolveUtil.findLibrary(scopeElement.getContainingFile());
      DartResolveUtil.processTopLevelDeclarations(scopeElement, monkeyResolveProcessor, libraryFiles, name);
    }*/

    return result;
  }
}
