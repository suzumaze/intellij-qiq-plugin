// This is a generated file. Not intended for manual editing.
package com.github.suzumaze.intellijqiqplugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class QiqVisitor extends PsiElementVisitor {

  public void visitArray(@NotNull QiqArray o) {
    visitPsiElement(o);
  }

  public void visitExpression(@NotNull QiqExpression o) {
    visitPsiElement(o);
  }

  public void visitFunctionCall(@NotNull QiqFunctionCall o) {
    visitPsiElement(o);
  }

  public void visitNamedArgument(@NotNull QiqNamedArgument o) {
    visitPsiElement(o);
  }

  public void visitQiqBlock(@NotNull QiqQiqBlock o) {
    visitPsiElement(o);
  }

  public void visitQualifiedName(@NotNull QiqQualifiedName o) {
    visitPsiElement(o);
  }

  public void visitStatement(@NotNull QiqStatement o) {
    visitPsiElement(o);
  }

  public void visitStringLiteral(@NotNull QiqStringLiteral o) {
    visitPsiElement(o);
  }

  public void visitUseStatement(@NotNull QiqUseStatement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
