// This is a generated file. Not intended for manual editing.
package com.github.suzumaze.intellijqiqplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.suzumaze.intellijqiqplugin.psi.impl.*;

public interface QiqTypes {

  IElementType PROPERTY = new QiqElementType("PROPERTY");

  IElementType COMMENT = new QiqTokenType("COMMENT");
  IElementType CRLF = new QiqTokenType("CRLF");
  IElementType KEY = new QiqTokenType("KEY");
  IElementType SEPARATOR = new QiqTokenType("SEPARATOR");
  IElementType VALUE = new QiqTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new QiqPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
