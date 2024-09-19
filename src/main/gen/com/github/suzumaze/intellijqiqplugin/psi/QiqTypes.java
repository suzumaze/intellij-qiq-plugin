// This is a generated file. Not intended for manual editing.
package com.github.suzumaze.intellijqiqplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.suzumaze.intellijqiqplugin.psi.impl.*;

public interface QiqTypes {

  IElementType PHP_BLOCK = new QiqElementType("PHP_BLOCK");
  IElementType PROPERTY = new QiqElementType("PROPERTY");

  IElementType CONTENT = new QiqTokenType("CONTENT");
  IElementType CRLF = new QiqTokenType("CRLF");
  IElementType KEY = new QiqTokenType("KEY");
  IElementType PHP_CONTENT = new QiqTokenType("PHP_CONTENT");
  IElementType QIQ_CLOSING_TAG = new QiqTokenType("QIQ_CLOSING_TAG");
  IElementType QIQ_ECHO_OPENING_TAG = new QiqTokenType("QIQ_ECHO_OPENING_TAG");
  IElementType QIQ_OPENING_TAG = new QiqTokenType("QIQ_OPENING_TAG");
  IElementType SEPARATOR = new QiqTokenType("SEPARATOR");
  IElementType VALUE = new QiqTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PHP_BLOCK) {
        return new QiqPhpBlockImpl(node);
      }
      else if (type == PROPERTY) {
        return new QiqPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
