package ee.edio.garmin.formatter;

import com.intellij.formatting.*;
import com.intellij.formatting.templateLanguages.BlockWithParent;
import com.intellij.lang.ASTNode;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.formatter.FormatterUtil;
import com.intellij.psi.formatter.common.AbstractBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MonkeyFormattingBlock extends AbstractBlock implements BlockWithParent {
  private final CodeStyleSettings codeStyleSettings;
  private final SpacingBuilder spacingBuilder;
  private BlockWithParent parent;

  protected MonkeyFormattingBlock(ASTNode node, @Nullable Wrap wrap, @Nullable Alignment alignment, CodeStyleSettings codeStyleSettings, SpacingBuilder spacingBuilder) {
    super(node, wrap, alignment);
    this.codeStyleSettings = codeStyleSettings;
    this.spacingBuilder = spacingBuilder;
  }

  @Override
  protected List<Block> buildChildren() {
    if (isLeaf()) {
      return EMPTY;
    }
    final ArrayList<Block> tlChildren = new ArrayList<>();
    for (ASTNode childNode = getNode().getFirstChildNode(); childNode != null; childNode = childNode.getTreeNext()) {
      if (FormatterUtil.containsWhiteSpacesOnly(childNode)) continue;
      final MonkeyFormattingBlock childBlock = new MonkeyFormattingBlock(childNode, null, null, codeStyleSettings, spacingBuilder);
      childBlock.setParent(this);
      tlChildren.add(childBlock);
    }
    return tlChildren;
  }

  @Nullable
  @Override
  public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
    if (child1 == null ||
        !(child1 instanceof AbstractBlock) ||
        !(child2 instanceof AbstractBlock)) {
      return null;
    }
    return spacingBuilder.getSpacing(this, child1, child2);
  }

  @Override
  public boolean isLeaf() {
    return getNode().getFirstChildNode() == null;
  }

  @Override
  public BlockWithParent getParent() {
    return parent;
  }

  @Override
  public void setParent(BlockWithParent newParent) {
    this.parent = newParent;
  }
}
