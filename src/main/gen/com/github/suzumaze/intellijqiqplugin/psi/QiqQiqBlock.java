// This is a generated file. Not intended for manual editing.
package com.github.suzumaze.intellijqiqplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QiqQiqBlock extends PsiElement {

  @NotNull
  List<QiqStatement> getStatementList();

  @NotNull
  List<QiqUseStatement> getUseStatementList();

}
