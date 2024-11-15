package com.github.suzumaze.intellijqiqplugin

import com.github.suzumaze.intellijqiqplugin.psi.QiqTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

class QiqSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        // Qiqタグ
        val DELIMITER_TAG = TextAttributesKey.createTextAttributesKey(
            "QIQ.TAG", DefaultLanguageHighlighterColors.KEYWORD
        )

        // PHP関連
        val PHP_TAG = TextAttributesKey.createTextAttributesKey(
            "QIQ.PHP_TAG", DefaultLanguageHighlighterColors.KEYWORD
        )
        val PHP_CODE = TextAttributesKey.createTextAttributesKey(
            "QIQ.PHP_CODE", DefaultLanguageHighlighterColors.TEMPLATE_LANGUAGE_COLOR
        )

        // キーワード
        val KEYWORD = TextAttributesKey.createTextAttributesKey(
            "QIQ.KEYWORD", DefaultLanguageHighlighterColors.KEYWORD
        )

        // 変数と識別子
        val VARIABLE = TextAttributesKey.createTextAttributesKey(
            "QIQ.VARIABLE", DefaultLanguageHighlighterColors.INSTANCE_FIELD
        )
        val IDENTIFIER = TextAttributesKey.createTextAttributesKey(
            "QIQ.IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER
        )

        // リテラル
        val STRING = TextAttributesKey.createTextAttributesKey(
            "QIQ.STRING", DefaultLanguageHighlighterColors.STRING
        )
        val NUMBER = TextAttributesKey.createTextAttributesKey(
            "QIQ.NUMBER", DefaultLanguageHighlighterColors.NUMBER
        )

        // コメント
        val LINE_COMMENT = TextAttributesKey.createTextAttributesKey(
            "QIQ.LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT
        )
        val DOC_COMMENT = TextAttributesKey.createTextAttributesKey(
            "QIQ.DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT
        )
        var DOC_TAG_NAME = TextAttributesKey.createTextAttributesKey(
            "QIQ.DOC_TAG_NAME", DefaultLanguageHighlighterColors.DOC_COMMENT_TAG
        )
        var DOC_QUALIFIED_NAME = TextAttributesKey.createTextAttributesKey(
            "QIQ.DOC_QUALIFIED_NAME", DefaultLanguageHighlighterColors.DOC_COMMENT_MARKUP
        )
        var DOC_VARIABLE = TextAttributesKey.createTextAttributesKey(
            "QIQ.DOC_VARIABLE", DefaultLanguageHighlighterColors.INSTANCE_FIELD
        )

        // 演算子
        val OPERATOR = TextAttributesKey.createTextAttributesKey(
            "QIQ.OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN
        )
    }

    override fun getHighlightingLexer(): Lexer {
        return QiqLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when (tokenType) {
            // Qiqタグ
            QiqTypes.QIQ_OPENING_TAG, QiqTypes.QIQ_ECHO_OPENING_TAG, QiqTypes.QIQ_CLOSING_TAG ->
                pack(DELIMITER_TAG)

            // PHPタグとコード
            QiqTypes.PHP_OPENING_TAG, QiqTypes.PHP_ECHO_OPENING_TAG, QiqTypes.PHP_CLOSING_TAG ->
                pack(PHP_TAG)
            QiqTypes.PHP_CODE ->
                pack(PHP_CODE)

            // キーワード
            QiqTypes.USE,
            QiqTypes.AS ->
                pack(KEYWORD)

            // 変数と識別子
            QiqTypes.VARIABLE ->
                pack(VARIABLE)
            QiqTypes.IDENTIFIER ->
                pack(IDENTIFIER)

            // リテラル
            QiqTypes.SINGLE_QUOTED_STRING, QiqTypes.DOUBLE_QUOTED_STRING ->
                pack(STRING)
            QiqTypes.NUMBER ->
                pack(NUMBER)

            // コメント
            QiqTypes.LINE_COMMENT ->
                pack(LINE_COMMENT)
            QiqTypes.DOC_COMMENT_START,
            QiqTypes.DOC_COMMENT_END ->
                pack(DOC_COMMENT)

            QiqTypes.DOC_TAG_NAME -> pack(DOC_TAG_NAME)
            QiqTypes.DOC_QUALIFIED_NAME -> pack(DOC_QUALIFIED_NAME)
            QiqTypes.DOC_VARIABLE -> pack(DOC_VARIABLE)

            // 演算子
            QiqTypes.PLUS, QiqTypes.MINUS, QiqTypes.MULTIPLY, QiqTypes.DIVIDE,
            QiqTypes.MOD, QiqTypes.EQUAL_TO, QiqTypes.NOT_EQUAL,
            QiqTypes.IDENTICAL, QiqTypes.NOT_IDENTICAL, QiqTypes.ARROW,
            QiqTypes.OBJECT_OPERATOR, QiqTypes.AND_OP, QiqTypes.OR_OP ->
                pack(OPERATOR)

            else -> TextAttributesKey.EMPTY_ARRAY
        }
    }

    private fun pack(vararg keys: TextAttributesKey) =
        keys.toList().toTypedArray()
}