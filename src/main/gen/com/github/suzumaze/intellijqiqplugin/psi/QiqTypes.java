// This is a generated file. Not intended for manual editing.
package com.github.suzumaze.intellijqiqplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.suzumaze.intellijqiqplugin.psi.impl.*;

public interface QiqTypes {

  IElementType ARRAY = new QiqElementType("ARRAY");
  IElementType DOC_COMMENT = new QiqElementType("DOC_COMMENT");
  IElementType DOC_ELEMENT = new QiqElementType("DOC_ELEMENT");
  IElementType DOC_QUALIFIED_NAME = new QiqElementType("DOC_QUALIFIED_NAME");
  IElementType EXPRESSION = new QiqElementType("EXPRESSION");
  IElementType FUNCTION = new QiqElementType("FUNCTION");
  IElementType FUNCTION_CALL = new QiqElementType("FUNCTION_CALL");
  IElementType NAMED_ARGUMENT = new QiqElementType("NAMED_ARGUMENT");
  IElementType OTHER_DOC_TEXT = new QiqElementType("OTHER_DOC_TEXT");
  IElementType QIQ_BLOCK = new QiqElementType("QIQ_BLOCK");
  IElementType QUALIFIED_NAME = new QiqElementType("QUALIFIED_NAME");
  IElementType STATEMENT = new QiqElementType("STATEMENT");
  IElementType STRING_LITERAL = new QiqElementType("STRING_LITERAL");
  IElementType TAG_VAR = new QiqElementType("TAG_VAR");
  IElementType USE_STATEMENT = new QiqElementType("USE_STATEMENT");

  IElementType AND_OP = new QiqTokenType("AND_OP");
  IElementType ARROW = new QiqTokenType("ARROW");
  IElementType AS = new QiqTokenType("AS");
  IElementType BACKSLASH = new QiqTokenType("BACKSLASH");
  IElementType COLON = new QiqTokenType("COLON");
  IElementType COMMA = new QiqTokenType("COMMA");
  IElementType CRLF = new QiqTokenType("CRLF");
  IElementType DIVIDE = new QiqTokenType("DIVIDE");
  IElementType DOC_COMMENT_END = new QiqTokenType("DOC_COMMENT_END");
  IElementType DOC_COMMENT_START = new QiqTokenType("DOC_COMMENT_START");
  IElementType DOC_COMMENT_TEXT = new QiqTokenType("DOC_COMMENT_TEXT");
  IElementType DOC_IDENTIFIER = new QiqTokenType("DOC_IDENTIFIER");
  IElementType DOC_TAG_NAME = new QiqTokenType("DOC_TAG_NAME");
  IElementType DOC_VARIABLE = new QiqTokenType("DOC_VARIABLE");
  IElementType DOT = new QiqTokenType("DOT");
  IElementType DOUBLE_QUOTED_STRING = new QiqTokenType("DOUBLE_QUOTED_STRING");
  IElementType EQUALS = new QiqTokenType("EQUALS");
  IElementType EQUAL_TO = new QiqTokenType("EQUAL_TO");
  IElementType GREATER_EQUAL = new QiqTokenType("GREATER_EQUAL");
  IElementType GREATER_THAN = new QiqTokenType("GREATER_THAN");
  IElementType IDENTICAL = new QiqTokenType("IDENTICAL");
  IElementType IDENTIFIER = new QiqTokenType("IDENTIFIER");
  IElementType LEFT_BRACKET = new QiqTokenType("LEFT_BRACKET");
  IElementType LEFT_PAREN = new QiqTokenType("LEFT_PAREN");
  IElementType LESS_EQUAL = new QiqTokenType("LESS_EQUAL");
  IElementType LESS_THAN = new QiqTokenType("LESS_THAN");
  IElementType LINE_COMMENT = new QiqTokenType("LINE_COMMENT");
  IElementType MINUS = new QiqTokenType("MINUS");
  IElementType MOD = new QiqTokenType("MOD");
  IElementType MULTIPLY = new QiqTokenType("MULTIPLY");
  IElementType NOT_EQUAL = new QiqTokenType("NOT_EQUAL");
  IElementType NOT_IDENTICAL = new QiqTokenType("NOT_IDENTICAL");
  IElementType NOT_OP = new QiqTokenType("NOT_OP");
  IElementType NULL_SAFE_OPERATOR = new QiqTokenType("NULL_SAFE_OPERATOR");
  IElementType NUMBER = new QiqTokenType("NUMBER");
  IElementType OBJECT_OPERATOR = new QiqTokenType("OBJECT_OPERATOR");
  IElementType OR_OP = new QiqTokenType("OR_OP");
  IElementType PHP_CLOSING_TAG = new QiqTokenType("PHP_CLOSING_TAG");
  IElementType PHP_CODE = new QiqTokenType("PHP_CODE");
  IElementType PHP_ECHO_OPENING_TAG = new QiqTokenType("PHP_ECHO_OPENING_TAG");
  IElementType PHP_OPENING_TAG = new QiqTokenType("PHP_OPENING_TAG");
  IElementType PLUS = new QiqTokenType("PLUS");
  IElementType QIQ_CLOSING_TAG = new QiqTokenType("QIQ_CLOSING_TAG");
  IElementType QIQ_ECHO_OPENING_TAG = new QiqTokenType("QIQ_ECHO_OPENING_TAG");
  IElementType QIQ_OPENING_TAG = new QiqTokenType("QIQ_OPENING_TAG");
  IElementType RIGHT_BRACKET = new QiqTokenType("RIGHT_BRACKET");
  IElementType RIGHT_PAREN = new QiqTokenType("RIGHT_PAREN");
  IElementType SEMICOLON = new QiqTokenType("SEMICOLON");
  IElementType SINGLE_QUOTED_STRING = new QiqTokenType("SINGLE_QUOTED_STRING");
  IElementType TEMPLATE_TEXT = new QiqTokenType("TEMPLATE_TEXT");
  IElementType USE = new QiqTokenType("USE");
  IElementType VARIABLE = new QiqTokenType("VARIABLE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY) {
        return new QiqArrayImpl(node);
      }
      else if (type == DOC_COMMENT) {
        return new QiqDocCommentImpl(node);
      }
      else if (type == DOC_ELEMENT) {
        return new QiqDocElementImpl(node);
      }
      else if (type == DOC_QUALIFIED_NAME) {
        return new QiqDocQualifiedNameImpl(node);
      }
      else if (type == EXPRESSION) {
        return new QiqExpressionImpl(node);
      }
      else if (type == FUNCTION) {
        return new QiqFunctionImpl(node);
      }
      else if (type == FUNCTION_CALL) {
        return new QiqFunctionCallImpl(node);
      }
      else if (type == NAMED_ARGUMENT) {
        return new QiqNamedArgumentImpl(node);
      }
      else if (type == OTHER_DOC_TEXT) {
        return new QiqOtherDocTextImpl(node);
      }
      else if (type == QIQ_BLOCK) {
        return new QiqQiqBlockImpl(node);
      }
      else if (type == QUALIFIED_NAME) {
        return new QiqQualifiedNameImpl(node);
      }
      else if (type == STATEMENT) {
        return new QiqStatementImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new QiqStringLiteralImpl(node);
      }
      else if (type == TAG_VAR) {
        return new QiqTagVarImpl(node);
      }
      else if (type == USE_STATEMENT) {
        return new QiqUseStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
