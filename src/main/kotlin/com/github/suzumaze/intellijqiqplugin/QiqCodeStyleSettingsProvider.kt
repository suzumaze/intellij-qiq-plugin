package com.github.suzumaze.intellijqiqplugin

import com.intellij.application.options.CodeStyleAbstractConfigurable
import com.intellij.application.options.CodeStyleAbstractPanel
import com.intellij.application.options.TabbedLanguageCodeStylePanel
import com.intellij.psi.codeStyle.CodeStyleConfigurable
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CodeStyleSettingsProvider
import com.intellij.psi.codeStyle.CustomCodeStyleSettings
import org.jetbrains.annotations.NotNull


internal class QiqCodeStyleSettingsProvider : CodeStyleSettingsProvider() {
    override fun createCustomSettings(@NotNull settings: CodeStyleSettings): CustomCodeStyleSettings {
        return QiqCodeStyleSettings(settings)
    }

    override fun getConfigurableDisplayName(): String {
        return "Qiq"
    }

    @NotNull
    override fun createConfigurable(
        @NotNull settings: CodeStyleSettings,
        @NotNull modelSettings: CodeStyleSettings
    ): CodeStyleConfigurable {
        return object : CodeStyleAbstractConfigurable(settings, modelSettings, this.configurableDisplayName) {
            @NotNull
            override fun createPanel(@NotNull settings: CodeStyleSettings): CodeStyleAbstractPanel {
                return QiqCodeStyleMainPanel(currentSettings, settings)
            }
        }
    }

    private class QiqCodeStyleMainPanel(currentSettings: CodeStyleSettings?, settings: CodeStyleSettings?) :
        TabbedLanguageCodeStylePanel(QiqLanguage.INSTANCE, currentSettings, settings!!)
}