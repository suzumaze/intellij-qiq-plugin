package com.github.suzumaze.intellijqiqplugin.psi

import com.github.suzumaze.intellijqiqplugin.QiqFileType
import com.github.suzumaze.intellijqiqplugin.QiqLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class QiqFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, QiqLanguage.INSTANCE) {
    override fun getFileType(): FileType = QiqFileType
    override fun toString(): String = "Qiq"
}