package com.github.suzumaze.intellijqiqplugin

import com.intellij.application.options.IndentOptionsEditor
import com.intellij.lang.Language
import com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider
import org.jetbrains.annotations.NotNull


internal class QiqLanguageCodeStyleSettingsProvider : LanguageCodeStyleSettingsProvider() {
    @NotNull
    override fun getLanguage(): Language {
        return QiqLanguage.INSTANCE
    }

    override fun customizeSettings(
        @NotNull consumer: CodeStyleSettingsCustomizable,
        @NotNull settingsType: SettingsType
    ) {
        if (settingsType == SettingsType.INDENT_SETTINGS) {
            consumer.showStandardOptions("INDENT_SIZE")
            consumer.showStandardOptions("CONTINUATION_INDENT_SIZE")
            consumer.showStandardOptions("TAB_SIZE")
            consumer.showStandardOptions("USE_TAB_CHARACTER")
        }
    }

    override fun getIndentOptionsEditor(): IndentOptionsEditor? {
        return IndentOptionsEditor()
    }

    override fun getCodeSample(@NotNull settingsType: SettingsType): String? {
        return """
        {{ setBlock ('local-nav') }}
            <p><a href="/foo">Foo</a></p>
        {{= getBlock () ~}}
        """.trimIndent()
    }
}