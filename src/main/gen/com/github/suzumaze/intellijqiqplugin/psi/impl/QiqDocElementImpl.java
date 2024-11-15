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

public class QiqDocElementImpl extends ASTWrapperPsiElement implements QiqDocElement {

  public QiqDocElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QiqVisitor visitor) {
    visitor.visitDocElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QiqVisitor) accept((QiqVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QiqOtherDocText getOtherDocText() {
    return findChildByClass(QiqOtherDocText.class);
  }

  @Override
  @Nullable
  public QiqTagVar getTagVar() {
    return findChildByClass(QiqTagVar.class);
  }

}
