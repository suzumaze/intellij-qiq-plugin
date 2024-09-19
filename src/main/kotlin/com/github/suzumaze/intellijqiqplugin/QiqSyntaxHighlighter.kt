package com.github.suzumaze.intellijqiqplugin

import com.github.suzumaze.intellijqiqplugin.psi.QiqTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

class QiqSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val QIQ_TAG: TextAttributesKey = TextAttributesKey.createTextAttributesKey("QIQ_TAG", DefaultLanguageHighlighterColors.BRACKETS)

        private val QIQ_TAG_KEYS = arrayOf(QIQ_TAG)
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }

    override fun getHighlightingLexer(): Lexer {
        return QiqLexerAdapter()  // Lexer adapter for Qiq
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when (tokenType) {
            QiqTypes.QIQ_OPENING_TAG,
            QiqTypes.QIQ_ECHO_OPENING_TAG,
            QiqTypes.QIQ_CLOSING_TAG -> QIQ_TAG_KEYS
            else -> EMPTY_KEYS
        }
    }
}