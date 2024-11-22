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
  // multiplicativeExpression (additiveOperator multiplicativeExpression)*
  static boolean additiveExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicativeExpression(b, l + 1);
    r = r && additiveExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (additiveOperator multiplicativeExpression)*
  private static boolean additiveExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!additiveExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additiveExpression_1", c)) break;
    }
    return true;
  }

  // additiveOperator multiplicativeExpression
  private static boolean additiveExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additiveOperator(b, l + 1);
    r = r && multiplicativeExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PLUS | MINUS | DOT
  static boolean additiveOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveOperator")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, DOT);
    return r;
  }

  /* ********************************************************** */
  // namedArgument | expression
  static boolean argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument")) return false;
    boolean r;
    r = namedArgument(b, l + 1);
    if (!r) r = expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // argument (COMMA argument)*
  static boolean argumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = argument(b, l + 1);
    r = r && argumentList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA argument)*
  private static boolean argumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argumentList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argumentList_1", c)) break;
    }
    return true;
  }

  // COMMA argument
  private static boolean argumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACKET (arrayElement (COMMA arrayElement)*)? RIGHT_BRACKET
  public static boolean array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && array_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, ARRAY, r);
    return r;
  }

  // (arrayElement (COMMA arrayElement)*)?
  private static boolean array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1")) return false;
    array_1_0(b, l + 1);
    return true;
  }

  // arrayElement (COMMA arrayElement)*
  private static boolean array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrayElement(b, l + 1);
    r = r && array_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA arrayElement)*
  private static boolean array_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA arrayElement
  private static boolean array_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && arrayElement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (IDENTIFIER ARROW)? expression
  static boolean arrayElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayElement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrayElement_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IDENTIFIER ARROW)?
  private static boolean arrayElement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayElement_0")) return false;
    arrayElement_0_0(b, l + 1);
    return true;
  }

  // IDENTIFIER ARROW
  private static boolean arrayElement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayElement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, ARROW);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (statement | comment | useStatement)*
  static boolean blockContent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockContent")) return false;
    while (true) {
      int c = current_position_(b);
      if (!blockContent_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "blockContent", c)) break;
    }
    return true;
  }

  // statement | comment | useStatement
  private static boolean blockContent_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockContent_0")) return false;
    boolean r;
    r = statement(b, l + 1);
    if (!r) r = comment(b, l + 1);
    if (!r) r = useStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // primaryExpression (chainOperator primaryExpression)*
  static boolean chainExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "chainExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primaryExpression(b, l + 1);
    r = r && chainExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (chainOperator primaryExpression)*
  private static boolean chainExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "chainExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!chainExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "chainExpression_1", c)) break;
    }
    return true;
  }

  // chainOperator primaryExpression
  private static boolean chainExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "chainExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = chainOperator(b, l + 1);
    r = r && primaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OBJECT_OPERATOR | ARROW | AS
  static boolean chainOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "chainOperator")) return false;
    boolean r;
    r = consumeToken(b, OBJECT_OPERATOR);
    if (!r) r = consumeToken(b, ARROW);
    if (!r) r = consumeToken(b, AS);
    return r;
  }

  /* ********************************************************** */
  // LINE_COMMENT | BLOCK_COMMENT
  static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    if (!nextTokenIs(b, "", BLOCK_COMMENT, LINE_COMMENT)) return false;
    boolean r;
    r = consumeToken(b, LINE_COMMENT);
    if (!r) r = consumeToken(b, BLOCK_COMMENT);
    return r;
  }

  /* ********************************************************** */
  // additiveExpression (comparisonOperator additiveExpression)*
  static boolean comparisonExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additiveExpression(b, l + 1);
    r = r && comparisonExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comparisonOperator additiveExpression)*
  private static boolean comparisonExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!comparisonExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comparisonExpression_1", c)) break;
    }
    return true;
  }

  // comparisonOperator additiveExpression
  private static boolean comparisonExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparisonOperator(b, l + 1);
    r = r && additiveExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EQUAL_TO | NOT_EQUAL
  //    | IDENTICAL | NOT_IDENTICAL
  //    | GREATER_THAN | LESS_THAN
  //    | GREATER_EQUAL | LESS_EQUAL
  //    | EQUALS
  static boolean comparisonOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonOperator")) return false;
    boolean r;
    r = consumeToken(b, EQUAL_TO);
    if (!r) r = consumeToken(b, NOT_EQUAL);
    if (!r) r = consumeToken(b, IDENTICAL);
    if (!r) r = consumeToken(b, NOT_IDENTICAL);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, GREATER_EQUAL);
    if (!r) r = consumeToken(b, LESS_EQUAL);
    if (!r) r = consumeToken(b, EQUALS);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PAREN expression RIGHT_PAREN
  //    | NOT_OP expression
  //    | array
  static boolean complexExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = complexExpression_0(b, l + 1);
    if (!r) r = complexExpression_1(b, l + 1);
    if (!r) r = array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_PAREN expression RIGHT_PAREN
  private static boolean complexExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT_OP expression
  private static boolean complexExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT_OP);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QIQ_OPENING_TAG DOC_COMMENT QIQ_CLOSING_TAG
  static boolean docBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docBlock")) return false;
    if (!nextTokenIs(b, QIQ_OPENING_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, QIQ_OPENING_TAG, DOC_COMMENT, QIQ_CLOSING_TAG);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // logicalExpression
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = logicalExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER LEFT_PAREN RIGHT_PAREN
  //               | IDENTIFIER LEFT_PAREN argumentList COMMA? RIGHT_PAREN
  public static boolean functionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, IDENTIFIER, LEFT_PAREN, RIGHT_PAREN);
    if (!r) r = functionCall_1(b, l + 1);
    exit_section_(b, m, FUNCTION_CALL, r);
    return r;
  }

  // IDENTIFIER LEFT_PAREN argumentList COMMA? RIGHT_PAREN
  private static boolean functionCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, LEFT_PAREN);
    r = r && argumentList(b, l + 1);
    r = r && functionCall_1_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean functionCall_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_1_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // qiqBlock | phpBlock | TEMPLATE_TEXT | CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = qiqBlock(b, l + 1);
    if (!r) r = phpBlock(b, l + 1);
    if (!r) r = consumeToken(b, TEMPLATE_TEXT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // comparisonExpression (logicalOperator comparisonExpression)*
  static boolean logicalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparisonExpression(b, l + 1);
    r = r && logicalExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (logicalOperator comparisonExpression)*
  private static boolean logicalExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicalExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logicalExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logicalExpression_1", c)) break;
    }
    return true;
  }

  // logicalOperator comparisonExpression
  private static boolean logicalExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicalExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = logicalOperator(b, l + 1);
    r = r && comparisonExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AND_OP | OR_OP
  static boolean logicalOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicalOperator")) return false;
    if (!nextTokenIs(b, "", AND_OP, OR_OP)) return false;
    boolean r;
    r = consumeToken(b, AND_OP);
    if (!r) r = consumeToken(b, OR_OP);
    return r;
  }

  /* ********************************************************** */
  // chainExpression (multiplicativeOperator chainExpression)*
  static boolean multiplicativeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = chainExpression(b, l + 1);
    r = r && multiplicativeExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (multiplicativeOperator chainExpression)*
  private static boolean multiplicativeExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multiplicativeExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiplicativeExpression_1", c)) break;
    }
    return true;
  }

  // multiplicativeOperator chainExpression
  private static boolean multiplicativeExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicativeOperator(b, l + 1);
    r = r && chainExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MULTIPLY | DIVIDE | MOD
  static boolean multiplicativeOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeOperator")) return false;
    boolean r;
    r = consumeToken(b, MULTIPLY);
    if (!r) r = consumeToken(b, DIVIDE);
    if (!r) r = consumeToken(b, MOD);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON expression
  public static boolean namedArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedArgument")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, NAMED_ARGUMENT, r);
    return r;
  }

  /* ********************************************************** */
  // (PHP_OPENING_TAG | PHP_ECHO_OPENING_TAG) PHP_CODE? PHP_CLOSING_TAG
  static boolean phpBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "phpBlock")) return false;
    if (!nextTokenIs(b, "", PHP_ECHO_OPENING_TAG, PHP_OPENING_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = phpBlock_0(b, l + 1);
    r = r && phpBlock_1(b, l + 1);
    r = r && consumeToken(b, PHP_CLOSING_TAG);
    exit_section_(b, m, null, r);
    return r;
  }

  // PHP_OPENING_TAG | PHP_ECHO_OPENING_TAG
  private static boolean phpBlock_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "phpBlock_0")) return false;
    boolean r;
    r = consumeToken(b, PHP_OPENING_TAG);
    if (!r) r = consumeToken(b, PHP_ECHO_OPENING_TAG);
    return r;
  }

  // PHP_CODE?
  private static boolean phpBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "phpBlock_1")) return false;
    consumeToken(b, PHP_CODE);
    return true;
  }

  /* ********************************************************** */
  // simpleExpression | complexExpression
  static boolean primaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryExpression")) return false;
    boolean r;
    r = simpleExpression(b, l + 1);
    if (!r) r = complexExpression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // standardBlock | docBlock
  public static boolean qiqBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qiqBlock")) return false;
    if (!nextTokenIs(b, "<qiq block>", QIQ_ECHO_OPENING_TAG, QIQ_OPENING_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QIQ_BLOCK, "<qiq block>");
    r = standardBlock(b, l + 1);
    if (!r) r = docBlock(b, l + 1);
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
  // IDENTIFIER (BACKSLASH IDENTIFIER)*
  public static boolean qualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && qualifiedName_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME, r);
    return r;
  }

  // (BACKSLASH IDENTIFIER)*
  private static boolean qualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qualifiedName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_1", c)) break;
    }
    return true;
  }

  // BACKSLASH IDENTIFIER
  private static boolean qualifiedName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BACKSLASH, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VARIABLE             // 例: $name
  //    | stringLiteral      // 例: "text", 'text'
  //    | NUMBER               // 例: 42
  //    | IDENTIFIER
  static boolean simpleExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleExpression")) return false;
    boolean r;
    r = consumeToken(b, VARIABLE);
    if (!r) r = stringLiteral(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // QIQ_OPENING_TAG blockContent QIQ_CLOSING_TAG
  //                       | QIQ_ECHO_OPENING_TAG blockContent QIQ_CLOSING_TAG
  static boolean standardBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "standardBlock")) return false;
    if (!nextTokenIs(b, "", QIQ_ECHO_OPENING_TAG, QIQ_OPENING_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = standardBlock_0(b, l + 1);
    if (!r) r = standardBlock_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // QIQ_OPENING_TAG blockContent QIQ_CLOSING_TAG
  private static boolean standardBlock_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "standardBlock_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QIQ_OPENING_TAG);
    r = r && blockContent(b, l + 1);
    r = r && consumeToken(b, QIQ_CLOSING_TAG);
    exit_section_(b, m, null, r);
    return r;
  }

  // QIQ_ECHO_OPENING_TAG blockContent QIQ_CLOSING_TAG
  private static boolean standardBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "standardBlock_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QIQ_ECHO_OPENING_TAG);
    r = r && blockContent(b, l + 1);
    r = r && consumeToken(b, QIQ_CLOSING_TAG);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // functionCall COLON?
  //           | expression COLON?
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_0(b, l + 1);
    if (!r) r = statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // functionCall COLON?
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionCall(b, l + 1);
    r = r && statement_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON?
  private static boolean statement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_1")) return false;
    consumeToken(b, COLON);
    return true;
  }

  // expression COLON?
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && statement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON?
  private static boolean statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1_1")) return false;
    consumeToken(b, COLON);
    return true;
  }

  /* ********************************************************** */
  // SINGLE_QUOTED_STRING | DOUBLE_QUOTED_STRING
  public static boolean stringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringLiteral")) return false;
    if (!nextTokenIs(b, "<string literal>", DOUBLE_QUOTED_STRING, SINGLE_QUOTED_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = consumeToken(b, SINGLE_QUOTED_STRING);
    if (!r) r = consumeToken(b, DOUBLE_QUOTED_STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // USE qualifiedName (AS IDENTIFIER)? SEMICOLON?
  public static boolean useStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useStatement")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && qualifiedName(b, l + 1);
    r = r && useStatement_2(b, l + 1);
    r = r && useStatement_3(b, l + 1);
    exit_section_(b, m, USE_STATEMENT, r);
    return r;
  }

  // (AS IDENTIFIER)?
  private static boolean useStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useStatement_2")) return false;
    useStatement_2_0(b, l + 1);
    return true;
  }

  // AS IDENTIFIER
  private static boolean useStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean useStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useStatement_3")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

}
