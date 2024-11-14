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

CRLF             = \R
WHITE_SPACE      = [\ \n\t\f]
IDENTIFIER       = [a-zA-Z_][a-zA-Z0-9_]*
VARIABLE         = "$" {IDENTIFIER}
NUMBER           = [0-9]+(\.[0-9]*)?

DOUBLE_QUOTED_STRING = \"([^\"\r\n\\]|\\[^\r\n])*\"
SINGLE_QUOTED_STRING = '([^'\r\n\\]|\\[^\r\n])*'

LINE_COMMENT     = "//"[^\r\n\}]*
DOC_COMMENT      = "/**" ([^*] | \*[^/])* \*"/"

QIQ_OPENING_TAG      = "{{" [hucja]?
QIQ_ECHO_OPENING_TAG = "{{="
QIQ_CLOSING_TAG      = "}}"|"~}}"

PHP_OPENING_TAG      = "<?php"
PHP_ECHO_OPENING_TAG = "<?="
PHP_CLOSING_TAG      = "?>"

AS      = "as"
USE     = "use"

%state IN_QIQ
%state IN_PHP

%%

<YYINITIAL> {
    {PHP_OPENING_TAG}       { yybegin(IN_PHP); return QiqTypes.PHP_OPENING_TAG; }
    {PHP_ECHO_OPENING_TAG}  { yybegin(IN_PHP); return QiqTypes.PHP_ECHO_OPENING_TAG; }
    {QIQ_OPENING_TAG}       { yybegin(IN_QIQ); return QiqTypes.QIQ_OPENING_TAG; }
    {QIQ_ECHO_OPENING_TAG}  { yybegin(IN_QIQ); return QiqTypes.QIQ_ECHO_OPENING_TAG; }
    [^{<]+                  { return QiqTypes.TEMPLATE_TEXT; }
    [{<]                    { return QiqTypes.TEMPLATE_TEXT; }
}

<IN_PHP> {
    {PHP_CLOSING_TAG}       { yybegin(YYINITIAL); return QiqTypes.PHP_CLOSING_TAG; }
    [^?>][^?]*             { return QiqTypes.PHP_CODE; }
    [?][^>]                { return QiqTypes.PHP_CODE; }
}

<IN_QIQ> {
    {QIQ_CLOSING_TAG}       { yybegin(YYINITIAL); return QiqTypes.QIQ_CLOSING_TAG; }

    {AS}                   { return QiqTypes.AS; }
    {USE}                   { return QiqTypes.USE; }

    "==="                  { return QiqTypes.IDENTICAL; }
    "!=="                  { return QiqTypes.NOT_IDENTICAL; }
    "=="                   { return QiqTypes.EQUAL_TO; }
    "!="                   { return QiqTypes.NOT_EQUAL; }
    ">="                   { return QiqTypes.GREATER_EQUAL; }
    "<="                   { return QiqTypes.LESS_EQUAL; }
    "=>"                   { return QiqTypes.ARROW; }
    "->"                   { return QiqTypes.OBJECT_OPERATOR; }
    "?->"                  { return QiqTypes.NULL_SAFE_OPERATOR; }
    "&&"                   { return QiqTypes.AND_OP; }
    "||"                   { return QiqTypes.OR_OP; }

    "+"                    { return QiqTypes.PLUS; }
    "-"                    { return QiqTypes.MINUS; }
    "*"                    { return QiqTypes.MULTIPLY; }
    "/"                    { return QiqTypes.DIVIDE; }
    "\\"                   { return QiqTypes.BACKSLASH; }
    "%"                    { return QiqTypes.MOD; }
    "."                    { return QiqTypes.DOT; }
    ">"                    { return QiqTypes.GREATER_THAN; }
    "<"                    { return QiqTypes.LESS_THAN; }
    "="                    { return QiqTypes.EQUALS; }
    "!"                    { return QiqTypes.NOT_OP; }

    ":"                    { return QiqTypes.COLON; }
    ";"                    { return QiqTypes.SEMICOLON; }
    ","                    { return QiqTypes.COMMA; }
    "("                    { return QiqTypes.LEFT_PAREN; }
    ")"                    { return QiqTypes.RIGHT_PAREN; }
    "["                    { return QiqTypes.LEFT_BRACKET; }
    "]"                    { return QiqTypes.RIGHT_BRACKET; }

    {LINE_COMMENT}         { return QiqTypes.LINE_COMMENT; }
    {DOC_COMMENT}          { return QiqTypes.DOC_COMMENT; }

    {VARIABLE}             { return QiqTypes.VARIABLE; }
    {DOUBLE_QUOTED_STRING} { return QiqTypes.DOUBLE_QUOTED_STRING; }
    {SINGLE_QUOTED_STRING} { return QiqTypes.SINGLE_QUOTED_STRING; }
    {NUMBER}               { return QiqTypes.NUMBER; }
    {IDENTIFIER}           { return QiqTypes.IDENTIFIER; }

    {WHITE_SPACE}+         { return TokenType.WHITE_SPACE; }
    {CRLF}                 { return QiqTypes.CRLF; }
}

[^]                        { return TokenType.BAD_CHARACTER; }