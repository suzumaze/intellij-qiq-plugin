package com.github.suzumaze.intellijqiqplugin

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object QiqFileType : LanguageFileType(QiqLanguage) {
    override fun getName() = "Qiq"
    override fun getDescription() = "Qiq template file"
    override fun getDefaultExtension() = "qiq"
    override fun getIcon(): Icon = QiqIcons.FILE
}