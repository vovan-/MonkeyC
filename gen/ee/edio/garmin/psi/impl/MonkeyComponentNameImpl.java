// This is a generated file. Not intended for manual editing.
package ee.edio.garmin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import ee.edio.garmin.psi.MonkeyComponentName;
import ee.edio.garmin.psi.MonkeyId;
import ee.edio.garmin.psi.MonkeyVisitor;
import org.jetbrains.annotations.NotNull;

public class MonkeyComponentNameImpl extends MonkeyNamedElementImpl implements MonkeyComponentName {

  public MonkeyComponentNameImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MonkeyVisitor) ((MonkeyVisitor) visitor).visitComponentName(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MonkeyId getId() {
    return findNotNullChildByClass(MonkeyId.class);
  }

  @Override
  public String toString() {
    return getId().getParent().getNode().getElementType().toString();
  }

}
