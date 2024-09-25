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
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
STRING_LITERAL=\"([^\"\\]|\\.)*\"
NUMBER=[0-9]+(\.[0-9]*)?
SEPARATOR=[:=]

QIQ_OPENING_TAG="{{"|"{{h"|"{{u"|"{{c"|"{{j"|"{{a"
QIQ_ECHO_OPENING_TAG="{{="
QIQ_CLOSING_TAG="}}"

IF="if"
ELSE="else"
ENDIF="endif"
FOREACH="foreach"
AS="as"
ENDFOREACH="endforeach"
SETBLOCK="setBlock"
GETBLOCK="getBlock"

%state IN_QIQ

%%

<YYINITIAL> {
  {QIQ_OPENING_TAG}       { yybegin(IN_QIQ); return QiqTypes.QIQ_OPENING_TAG; }
  {QIQ_ECHO_OPENING_TAG}  { yybegin(IN_QIQ); return QiqTypes.QIQ_ECHO_OPENING_TAG; }
  [^{]+                   { return QiqTypes.TEMPLATE_TEXT; }
}

<IN_QIQ> {
  {QIQ_CLOSING_TAG}       { yybegin(YYINITIAL); return QiqTypes.QIQ_CLOSING_TAG; }
  {IF}                    { return QiqTypes.IF; }
  {ELSE}                  { return QiqTypes.ELSE; }
  {ENDIF}                 { return QiqTypes.ENDIF; }
  {FOREACH}               { return QiqTypes.FOREACH; }
  {AS}                    { return QiqTypes.AS; }
  {ENDFOREACH}            { return QiqTypes.ENDFOREACH; }
  {SETBLOCK}              { return QiqTypes.SETBLOCK; }
  {GETBLOCK}              { return QiqTypes.GETBLOCK; }
  {IDENTIFIER}            { return QiqTypes.IDENTIFIER; }
  "$"{IDENTIFIER}         { return QiqTypes.VARIABLE; }
  {STRING_LITERAL}        { return QiqTypes.STRING_LITERAL; }
  {NUMBER}                { return QiqTypes.NUMBER; }
  {SEPARATOR}             { return QiqTypes.SEPARATOR; }
  {WHITE_SPACE}+          { return TokenType.WHITE_SPACE; }
  {CRLF}                  { return QiqTypes.CRLF; }
}

[^]                       { return TokenType.BAD_CHARACTER; }