package com.github.suzumaze.intellijqiqplugin

import com.intellij.lang.Language

object QiqLanguage : Language("Qiq") {
    private fun readResolve(): Any = QiqLanguage
}