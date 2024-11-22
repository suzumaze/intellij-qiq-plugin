package com.github.suzumaze.intellijqiqplugin

import com.intellij.lang.InjectableLanguage
import com.intellij.lang.Language
import com.intellij.psi.templateLanguages.TemplateLanguage

object QiqLanguage : Language("Qiq"), TemplateLanguage, InjectableLanguage {
    private fun readResolve(): Any = QiqLanguage
    val INSTANCE: QiqLanguage = QiqLanguage
}