// This is a generated file. Not intended for manual editing.
package com.github.suzumaze.intellijqiqplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QiqExpression extends PsiElement {

  @NotNull
  List<QiqArray> getArrayList();

  @NotNull
  List<QiqExpression> getExpressionList();

  @NotNull
  List<QiqStringLiteral> getStringLiteralList();

}
