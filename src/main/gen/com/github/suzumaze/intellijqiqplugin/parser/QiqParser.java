// This is a generated file. Not intended for manual editing.
package com.github.suzumaze.intellijqiqplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.suzumaze.intellijqiqplugin.psi.QiqTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class QiqParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return qiqFile(b, l + 1);
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean KEY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEY")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, KEY, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | STRING_LITERAL | NUMBER
  public static boolean VALUE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VALUE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, NUMBER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '$' IDENTIFIER
  public static boolean VARIABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE, "<variable>");
    r = consumeToken(b, "$");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // QIQ_ECHO_OPENING_TAG qiqExpression QIQ_CLOSING_TAG
  public static boolean echoBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "echoBlock")) return false;
    if (!nextTokenIs(b, QIQ_ECHO_OPENING_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QIQ_ECHO_OPENING_TAG);
    r = r && qiqExpression(b, l + 1);
    r = r && consumeToken(b, QIQ_CLOSING_TAG);
    exit_section_(b, m, ECHO_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // FOREACH '(' qiqExpression AS KEY '=>' VALUE ')' ':' qiqStatement* ENDFOREACH
  public static boolean foreachStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachStatement")) return false;
    if (!nextTokenIs(b, FOREACH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOREACH);
    r = r && consumeToken(b, "(");
    r = r && qiqExpression(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && KEY(b, l + 1);
    r = r && consumeToken(b, "=>");
    r = r && VALUE(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, ":");
    r = r && foreachStatement_9(b, l + 1);
    r = r && consumeToken(b, ENDFOREACH);
    exit_section_(b, m, FOREACH_STATEMENT, r);
    return r;
  }

  // qiqStatement*
  private static boolean foreachStatement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachStatement_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qiqStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "foreachStatement_9", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER '(' (qiqExpression (',' qiqExpression)*)? ')'
  public static boolean functionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && functionCall_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, FUNCTION_CALL, r);
    return r;
  }

  // (qiqExpression (',' qiqExpression)*)?
  private static boolean functionCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_2")) return false;
    functionCall_2_0(b, l + 1);
    return true;
  }

  // qiqExpression (',' qiqExpression)*
  private static boolean functionCall_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qiqExpression(b, l + 1);
    r = r && functionCall_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' qiqExpression)*
  private static boolean functionCall_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!functionCall_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionCall_2_0_1", c)) break;
    }
    return true;
  }

  // ',' qiqExpression
  private static boolean functionCall_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && qiqExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GETBLOCK '(' ')'
  public static boolean getBlockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getBlockStatement")) return false;
    if (!nextTokenIs(b, GETBLOCK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GETBLOCK);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, ")");
    exit_section_(b, m, GET_BLOCK_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // IF '(' qiqExpression ')' ':' qiqStatement* (ELSE ':' qiqStatement*)? ENDIF
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && consumeToken(b, "(");
    r = r && qiqExpression(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, ":");
    r = r && ifStatement_5(b, l + 1);
    r = r && ifStatement_6(b, l + 1);
    r = r && consumeToken(b, ENDIF);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // qiqStatement*
  private static boolean ifStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qiqStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifStatement_5", c)) break;
    }
    return true;
  }

  // (ELSE ':' qiqStatement*)?
  private static boolean ifStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_6")) return false;
    ifStatement_6_0(b, l + 1);
    return true;
  }

  // ELSE ':' qiqStatement*
  private static boolean ifStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && consumeToken(b, ":");
    r = r && ifStatement_6_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // qiqStatement*
  private static boolean ifStatement_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_6_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qiqStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifStatement_6_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // qiqBlock | TEMPLATE_TEXT | CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = qiqBlock(b, l + 1);
    if (!r) r = consumeToken(b, TEMPLATE_TEXT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // QIQ_OPENING_TAG qiqStatement* QIQ_CLOSING_TAG
  public static boolean normalBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "normalBlock")) return false;
    if (!nextTokenIs(b, QIQ_OPENING_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QIQ_OPENING_TAG);
    r = r && normalBlock_1(b, l + 1);
    r = r && consumeToken(b, QIQ_CLOSING_TAG);
    exit_section_(b, m, NORMAL_BLOCK, r);
    return r;
  }

  // qiqStatement*
  private static boolean normalBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "normalBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qiqStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "normalBlock_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (KEY? SEPARATOR VALUE?) | KEY
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    if (!nextTokenIs(b, "<property>", IDENTIFIER, SEPARATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = property_0(b, l + 1);
    if (!r) r = KEY(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEY? SEPARATOR VALUE?
  private static boolean property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_0_0(b, l + 1);
    r = r && consumeToken(b, SEPARATOR);
    r = r && property_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KEY?
  private static boolean property_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_0")) return false;
    KEY(b, l + 1);
    return true;
  }

  // VALUE?
  private static boolean property_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_2")) return false;
    VALUE(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // normalBlock | echoBlock
  public static boolean qiqBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qiqBlock")) return false;
    if (!nextTokenIs(b, "<qiq block>", QIQ_ECHO_OPENING_TAG, QIQ_OPENING_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QIQ_BLOCK, "<qiq block>");
    r = normalBlock(b, l + 1);
    if (!r) r = echoBlock(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // property
  //                 | functionCall
  //                 | STRING_LITERAL
  //                 | NUMBER
  //                 | VARIABLE
  public static boolean qiqExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qiqExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QIQ_EXPRESSION, "<qiq expression>");
    r = property(b, l + 1);
    if (!r) r = functionCall(b, l + 1);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = VARIABLE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean qiqFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qiqFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qiqFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ifStatement
  //                | foreachStatement
  //                | setBlockStatement
  //                | getBlockStatement
  //                | property
  //                | qiqExpression
  public static boolean qiqStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qiqStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QIQ_STATEMENT, "<qiq statement>");
    r = ifStatement(b, l + 1);
    if (!r) r = foreachStatement(b, l + 1);
    if (!r) r = setBlockStatement(b, l + 1);
    if (!r) r = getBlockStatement(b, l + 1);
    if (!r) r = property(b, l + 1);
    if (!r) r = qiqExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SETBLOCK '(' STRING_LITERAL ')' qiqStatement*
  public static boolean setBlockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setBlockStatement")) return false;
    if (!nextTokenIs(b, SETBLOCK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SETBLOCK);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, STRING_LITERAL);
    r = r && consumeToken(b, ")");
    r = r && setBlockStatement_4(b, l + 1);
    exit_section_(b, m, SET_BLOCK_STATEMENT, r);
    return r;
  }

  // qiqStatement*
  private static boolean setBlockStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setBlockStatement_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qiqStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "setBlockStatement_4", c)) break;
    }
    return true;
  }

}
