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

public class QiqQiqStatementImpl extends ASTWrapperPsiElement implements QiqQiqStatement {

  public QiqQiqStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QiqVisitor visitor) {
    visitor.visitQiqStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QiqVisitor) accept((QiqVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QiqForeachStatement getForeachStatement() {
    return findChildByClass(QiqForeachStatement.class);
  }

  @Override
  @Nullable
  public QiqGetBlockStatement getGetBlockStatement() {
    return findChildByClass(QiqGetBlockStatement.class);
  }

  @Override
  @Nullable
  public QiqIfStatement getIfStatement() {
    return findChildByClass(QiqIfStatement.class);
  }

  @Override
  @Nullable
  public QiqProperty getProperty() {
    return findChildByClass(QiqProperty.class);
  }

  @Override
  @Nullable
  public QiqQiqExpression getQiqExpression() {
    return findChildByClass(QiqQiqExpression.class);
  }

  @Override
  @Nullable
  public QiqSetBlockStatement getSetBlockStatement() {
    return findChildByClass(QiqSetBlockStatement.class);
  }

}
