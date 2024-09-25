// This is a generated file. Not intended for manual editing.
package com.github.suzumaze.intellijqiqplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QiqForeachStatement extends PsiElement {

  @NotNull
  QiqKey getKey();

  @NotNull
  QiqValue getValue();

  @NotNull
  QiqQiqExpression getQiqExpression();

  @NotNull
  List<QiqQiqStatement> getQiqStatementList();

}
