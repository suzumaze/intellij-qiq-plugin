// This is a generated file. Not intended for manual editing.
package com.github.suzumaze.intellijqiqplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.suzumaze.intellijqiqplugin.psi.impl.*;

public interface QiqTypes {

  IElementType ECHO_BLOCK = new QiqElementType("ECHO_BLOCK");
  IElementType FOREACH_STATEMENT = new QiqElementType("FOREACH_STATEMENT");
  IElementType FUNCTION_CALL = new QiqElementType("FUNCTION_CALL");
  IElementType GET_BLOCK_STATEMENT = new QiqElementType("GET_BLOCK_STATEMENT");
  IElementType IF_STATEMENT = new QiqElementType("IF_STATEMENT");
  IElementType KEY = new QiqElementType("KEY");
  IElementType NORMAL_BLOCK = new QiqElementType("NORMAL_BLOCK");
  IElementType PROPERTY = new QiqElementType("PROPERTY");
  IElementType QIQ_BLOCK = new QiqElementType("QIQ_BLOCK");
  IElementType QIQ_EXPRESSION = new QiqElementType("QIQ_EXPRESSION");
  IElementType QIQ_STATEMENT = new QiqElementType("QIQ_STATEMENT");
  IElementType SET_BLOCK_STATEMENT = new QiqElementType("SET_BLOCK_STATEMENT");
  IElementType VALUE = new QiqElementType("VALUE");
  IElementType VARIABLE = new QiqElementType("VARIABLE");

  IElementType AS = new QiqTokenType("AS");
  IElementType CRLF = new QiqTokenType("CRLF");
  IElementType ELSE = new QiqTokenType("ELSE");
  IElementType ENDFOREACH = new QiqTokenType("ENDFOREACH");
  IElementType ENDIF = new QiqTokenType("ENDIF");
  IElementType FOREACH = new QiqTokenType("FOREACH");
  IElementType GETBLOCK = new QiqTokenType("GETBLOCK");
  IElementType IDENTIFIER = new QiqTokenType("IDENTIFIER");
  IElementType IF = new QiqTokenType("IF");
  IElementType NUMBER = new QiqTokenType("NUMBER");
  IElementType QIQ_CLOSING_TAG = new QiqTokenType("QIQ_CLOSING_TAG");
  IElementType QIQ_ECHO_OPENING_TAG = new QiqTokenType("QIQ_ECHO_OPENING_TAG");
  IElementType QIQ_OPENING_TAG = new QiqTokenType("QIQ_OPENING_TAG");
  IElementType SEPARATOR = new QiqTokenType("SEPARATOR");
  IElementType SETBLOCK = new QiqTokenType("SETBLOCK");
  IElementType STRING_LITERAL = new QiqTokenType("STRING_LITERAL");
  IElementType TEMPLATE_TEXT = new QiqTokenType("TEMPLATE_TEXT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ECHO_BLOCK) {
        return new QiqEchoBlockImpl(node);
      }
      else if (type == FOREACH_STATEMENT) {
        return new QiqForeachStatementImpl(node);
      }
      else if (type == FUNCTION_CALL) {
        return new QiqFunctionCallImpl(node);
      }
      else if (type == GET_BLOCK_STATEMENT) {
        return new QiqGetBlockStatementImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new QiqIfStatementImpl(node);
      }
      else if (type == KEY) {
        return new QiqKeyImpl(node);
      }
      else if (type == NORMAL_BLOCK) {
        return new QiqNormalBlockImpl(node);
      }
      else if (type == PROPERTY) {
        return new QiqPropertyImpl(node);
      }
      else if (type == QIQ_BLOCK) {
        return new QiqQiqBlockImpl(node);
      }
      else if (type == QIQ_EXPRESSION) {
        return new QiqQiqExpressionImpl(node);
      }
      else if (type == QIQ_STATEMENT) {
        return new QiqQiqStatementImpl(node);
      }
      else if (type == SET_BLOCK_STATEMENT) {
        return new QiqSetBlockStatementImpl(node);
      }
      else if (type == VALUE) {
        return new QiqValueImpl(node);
      }
      else if (type == VARIABLE) {
        return new QiqVariableImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
