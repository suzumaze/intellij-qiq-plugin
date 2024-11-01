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
        // 演算子の周りにスペース
        .around(QiqTypes.PLUS).spaceIf(true)
        .around(QiqTypes.MINUS).spaceIf(true)
        .around(QiqTypes.MULTIPLY).spaceIf(true)
        .around(QiqTypes.DIVIDE).spaceIf(true)
        .around(QiqTypes.MOD).spaceIf(true)
        .around(QiqTypes.EQUAL_TO).spaceIf(true)
        .around(QiqTypes.NOT_EQUAL).spaceIf(true)
        .around(QiqTypes.IDENTICAL).spaceIf(true)
        .around(QiqTypes.NOT_IDENTICAL).spaceIf(true)
        .around(QiqTypes.AND_OP).spaceIf(true)
        .around(QiqTypes.OR_OP).spaceIf(true)
        .around(QiqTypes.AS).spaceIf(true)

        // カンマの後にスペース
        .after(QiqTypes.COMMA).spaceIf(true)

        // 括弧の中のスペース制御
        .after(QiqTypes.LEFT_PAREN).none()
        .before(QiqTypes.RIGHT_PAREN).none()
        .after(QiqTypes.LEFT_BRACKET).none()
        .before(QiqTypes.RIGHT_BRACKET).none()

        // アロー演算子の周りにスペース
        .around(QiqTypes.ARROW).spaceIf(true)

        // オブジェクト演算子の周りにスペースなし
        .around(QiqTypes.OBJECT_OPERATOR).none()
}