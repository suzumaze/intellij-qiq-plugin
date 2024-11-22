package com.github.suzumaze.intellijqiqplugin

import com.intellij.formatting.*
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.github.suzumaze.intellijqiqplugin.psi.QiqTypes

internal class QiqFormattingModelBuilder : FormattingModelBuilder {
    override fun createModel(formattingContext: FormattingContext): FormattingModel {
        val codeStyleSettings = formattingContext.codeStyleSettings
        return FormattingModelProvider
            .createFormattingModelForPsiFile(
                formattingContext.containingFile,
                QiqBlock(
                    formattingContext.node,
                    Wrap.createWrap(WrapType.NONE, false),
                    Alignment.createAlignment(),
                    createSpaceBuilder(codeStyleSettings)
                ),
                codeStyleSettings
            )
    }

}

private fun createSpaceBuilder(settings: CodeStyleSettings): SpacingBuilder {
    return SpacingBuilder(settings, QiqLanguage.INSTANCE)
        // Qiqタグのスペース
        .after(QiqTypes.QIQ_OPENING_TAG).spaceIf(true)
        .after(QiqTypes.QIQ_ECHO_OPENING_TAG).spaceIf(true)

        // 1行コメント以外で、Qiq閉じタグの前にスペースを入れる（先に定義した設定が適応される）
        .between(QiqTypes.LINE_COMMENT, QiqTypes.QIQ_CLOSING_TAG).none()
        .before(QiqTypes.QIQ_CLOSING_TAG).spaceIf(true)

        // ( の前にスペースを入れる
        .before(QiqTypes.LEFT_PAREN).spaceIf(true)

        // ( の前にスペースを入れる
        .before(QiqTypes.RIGHT_PAREN).none()

        // 代入演算子
        .around(QiqTypes.EQUALS).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_ASSIGNMENT_OPERATORS)

        // 論理演算子
        .around(QiqTypes.AND_OP).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_LOGICAL_OPERATORS)
        .around(QiqTypes.OR_OP).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_LOGICAL_OPERATORS)
        .around(QiqTypes.NOT_OP).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_LOGICAL_OPERATORS)

        // 等価演算子
        .around(QiqTypes.EQUAL_TO).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_EQUALITY_OPERATORS)
        .around(QiqTypes.NOT_EQUAL).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_EQUALITY_OPERATORS)
        .around(QiqTypes.IDENTICAL).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_EQUALITY_OPERATORS)
        .around(QiqTypes.NOT_IDENTICAL).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_EQUALITY_OPERATORS)

        // 関係演算子
        .around(QiqTypes.GREATER_THAN).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_RELATIONAL_OPERATORS)
        .around(QiqTypes.LESS_THAN).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_RELATIONAL_OPERATORS)
        .around(QiqTypes.GREATER_EQUAL).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_RELATIONAL_OPERATORS)
        .around(QiqTypes.LESS_EQUAL).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_RELATIONAL_OPERATORS)

        // 算術演算子
        .around(QiqTypes.PLUS).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_ADDITIVE_OPERATORS)
        .around(QiqTypes.MINUS).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_ADDITIVE_OPERATORS)
        .around(QiqTypes.MULTIPLY).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_MULTIPLICATIVE_OPERATORS)
        .around(QiqTypes.DIVIDE).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_MULTIPLICATIVE_OPERATORS)
        .around(QiqTypes.MOD).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_MULTIPLICATIVE_OPERATORS)

        // コンマ
        .after(QiqTypes.COMMA).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AFTER_COMMA)
        .before(QiqTypes.COMMA).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_BEFORE_COMMA)

        // アロー演算子（=>）
        .around(QiqTypes.ARROW).spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_LAMBDA_ARROW)

        // オブジェクト演算子（->）
        .around(QiqTypes.OBJECT_OPERATOR).none()
}