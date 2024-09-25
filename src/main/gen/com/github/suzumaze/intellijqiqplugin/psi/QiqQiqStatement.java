// This is a generated file. Not intended for manual editing.
package com.github.suzumaze.intellijqiqplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QiqQiqStatement extends PsiElement {

  @Nullable
  QiqForeachStatement getForeachStatement();

  @Nullable
  QiqGetBlockStatement getGetBlockStatement();

  @Nullable
  QiqIfStatement getIfStatement();

  @Nullable
  QiqProperty getProperty();

  @Nullable
  QiqQiqExpression getQiqExpression();

  @Nullable
  QiqSetBlockStatement getSetBlockStatement();

}
