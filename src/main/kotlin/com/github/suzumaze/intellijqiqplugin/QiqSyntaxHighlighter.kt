package com.github.suzumaze.intellijqiqplugin

import com.github.suzumaze.intellijqiqplugin.psi.QiqTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

class QiqSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val DELIMITER_TAG: TextAttributesKey by lazy {
            TextAttributesKey.createTextAttributesKey("QIQ_TAG", DefaultLanguageHighlighterColors.KEYWORD)
        }
        val STATEMENT_TAG: TextAttributesKey by lazy {
            TextAttributesKey.createTextAttributesKey("STATEMENT_TAG", DefaultLanguageHighlighterColors.KEYWORD)
        }
        val VARIABLE_TAG: TextAttributesKey by lazy {
            TextAttributesKey.createTextAttributesKey("VARIABLE_TAG", DefaultLanguageHighlighterColors.IDENTIFIER)
        }

        private val QIQ_TAG_KEYS: Array<TextAttributesKey> by lazy { arrayOf(DELIMITER_TAG) }
        private val STATEMENT_TAG_KEYS: Array<TextAttributesKey> by lazy { arrayOf(STATEMENT_TAG) }
        private val VARIABLE_TAG_KEYS: Array<TextAttributesKey> by lazy { arrayOf(VARIABLE_TAG) }
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }

    override fun getHighlightingLexer(): Lexer {
        return QiqLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when (tokenType) {
            QiqTypes.QIQ_OPENING_TAG,
            QiqTypes.QIQ_ECHO_OPENING_TAG,
            QiqTypes.QIQ_CLOSING_TAG -> QIQ_TAG_KEYS
            QiqTypes.IF,
            QiqTypes.ELSE,
            QiqTypes.ENDIF,
            QiqTypes.FOREACH,
            QiqTypes.ENDFOREACH,
            QiqTypes.SETBLOCK,
            QiqTypes.GETBLOCK -> STATEMENT_TAG_KEYS
            QiqTypes.VARIABLE -> VARIABLE_TAG_KEYS
            else -> EMPTY_KEYS
        }
    }
}