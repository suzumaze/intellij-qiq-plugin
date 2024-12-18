// This is a generated file. Not intended for manual editing.
package com.github.suzumaze.intellijqiqplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.suzumaze.intellijqiqplugin.psi.QiqTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.suzumaze.intellijqiqplugin.psi.*;

public class QiqFunctionCallImpl extends ASTWrapperPsiElement implements QiqFunctionCall {

  public QiqFunctionCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QiqVisitor visitor) {
    visitor.visitFunctionCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QiqVisitor) accept((QiqVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<QiqExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QiqExpression.class);
  }

  @Override
  @NotNull
  public QiqFunction getFunction() {
    return findNotNullChildByClass(QiqFunction.class);
  }

  @Override
  @NotNull
  public List<QiqNamedArgument> getNamedArgumentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QiqNamedArgument.class);
  }

}
