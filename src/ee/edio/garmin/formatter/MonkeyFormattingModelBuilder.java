package ee.edio.garmin.formatter;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import ee.edio.garmin.MonkeyLanguage;
import ee.edio.garmin.psi.MonkeyFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static ee.edio.garmin.psi.MonkeyTypes.*;

public class MonkeyFormattingModelBuilder implements FormattingModelBuilder {
  @NotNull
  @Override
  public FormattingModel createModel(PsiElement element, CodeStyleSettings codeStyleSettings) {
    final PsiFile psiFile = element.getContainingFile();
    final ASTNode rootNode = psiFile instanceof MonkeyFile ? psiFile.getNode() : element.getNode();
    final Block rootBlock = new MonkeyFormattingBlock(rootNode, null, null, codeStyleSettings, createSpacingBuilder(codeStyleSettings));
    return FormattingModelProvider.createFormattingModelForPsiFile(element.getContainingFile(), rootBlock, codeStyleSettings);
  }

  @NotNull
  private static SpacingBuilder createSpacingBuilder(@NotNull CodeStyleSettings settings) {
    return new SpacingBuilder(settings, MonkeyLanguage.INSTANCE)
        .before(COMMA).spaceIf(false)
        .after(COMMA).spaceIf(true)
        .before(SEMI).spaceIf(false)
        .after(SEMI).spaceIf(true)
        //.beforeInside(DOT, USING).none()
        //.afterInside(DOT, USING).spaces(1)
        .around(DOT).none()
        .around(ASSIGNMENT_OPERATOR).spaces(1)
        .around(VARIABLE_DECLARATOR).spaces(1)
//        .before(BLOCK).spaces(1)
        .after(FUNCTION).spaces(1)
        //.after(USING).spaces(1)
        .after(CONST).spaces(1)
        .after(VAR).spaces(1)
        .after(RETURN).spaces(1)
        .after(CONTINUE).spaces(1)
        .after(BREAK).spaces(1)
        .after(FOR).spaces(1)
        .after(IF).spaces(1)
        .after(ELSE).spaces(1)
        .after(CASE).spaces(1)
        .after(SWITCH).spaces(1)
        .afterInside(LBRACE, LITERAL).none()
        .beforeInside(LBRACE, LITERAL).none()
        .after(SINGLE_LINE_COMMENT).lineBreakInCodeIf(true)
        .after(BLOCK_COMMENT).lineBreakInCodeIf(true)
        .around(ASSIGNMENT_OPERATOR).spaces(1)
        ;
  }

  @Nullable
  @Override
  public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
    return null;
  }
}