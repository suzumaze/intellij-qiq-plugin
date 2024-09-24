package com.github.suzumaze.intellijqiqplugin

import com.intellij.psi.tree.IElementType
import java.io.StringReader

class QiqLexerTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val input = "{{ ${'$'}hoge }}"
            val lexer = QiqLexer(StringReader(input))
            lexer.reset(input, 0, input.length, QiqLexer.YYINITIAL)

            println("Before advance")
            var token = lexer.advance()
            println("After advance: $token")
            while (token != null) {
                println("Token: $token, Text: '${lexer.yytext()}'")
                token = lexer.advance()
                println("After advance: $token")
            }
        }
    }
}