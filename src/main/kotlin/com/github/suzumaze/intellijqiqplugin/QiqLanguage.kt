package com.github.suzumaze.intellijqiqplugin

import com.intellij.lang.Language
import com.jetbrains.php.lang.PhpLanguage

object QiqLanguage : Language(PhpLanguage.INSTANCE, "Qiq") {
    private fun readResolve(): Any = QiqLanguage
    val INSTANCE: QiqLanguage = QiqLanguage
}