package com.github.suzumaze.intellijqiqplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.github.suzumaze.intellijqiqplugin.psi.QiqTypes;
import com.intellij.psi.TokenType;

%%

%class QiqLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]

QIQ_OPENING_TAG="{{"
QIQ_ECHO_OPENING_TAG="{{="
QIQ_CLOSING_TAG="}}"

%state PHP_CONTENT

%%

<YYINITIAL> {
  {QIQ_OPENING_TAG}            { yybegin(PHP_CONTENT); return QiqTypes.QIQ_OPENING_TAG; }
  {QIQ_ECHO_OPENING_TAG}       { yybegin(PHP_CONTENT); return QiqTypes.QIQ_ECHO_OPENING_TAG; }
  [^{]+                        { return QiqTypes.CONTENT; }
}

<PHP_CONTENT> {
  {QIQ_CLOSING_TAG}            { yybegin(YYINITIAL); return QiqTypes.QIQ_CLOSING_TAG; }
  [^}]+                        { return QiqTypes.PHP_CONTENT; }
}

{WHITE_SPACE}                 { return TokenType.WHITE_SPACE; }
{CRLF}                        { return TokenType.WHITE_SPACE; }

[^]                           { return TokenType.BAD_CHARACTER; }