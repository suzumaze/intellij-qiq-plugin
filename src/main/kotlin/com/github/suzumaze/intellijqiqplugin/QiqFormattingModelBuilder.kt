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
        .around(QiqTypes.SEPARATOR)
        .spaceIf(settings.getCommonSettings(QiqLanguage.INSTANCE.id).SPACE_AROUND_ASSIGNMENT_OPERATORS)
        .before(QiqTypes.PROPERTY)
        .none()
}