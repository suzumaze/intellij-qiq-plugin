package com.github.suzumaze.intellijqiqplugin

import com.intellij.lang.InjectableLanguage
import com.intellij.lang.Language
import com.intellij.psi.templateLanguages.TemplateLanguage
import com.jetbrains.php.lang.PhpLanguage

object QiqLanguage : Language(PhpLanguage.INSTANCE, "Qiq"), TemplateLanguage, InjectableLanguage {
    private fun readResolve(): Any = QiqLanguage
    val INSTANCE: QiqLanguage = QiqLanguage
}