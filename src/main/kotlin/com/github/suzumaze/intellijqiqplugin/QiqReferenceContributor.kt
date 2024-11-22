package com.github.suzumaze.intellijqiqplugin

import com.github.suzumaze.intellijqiqplugin.psi.QiqFile
import com.github.suzumaze.intellijqiqplugin.psi.QiqTypes
import com.intellij.openapi.util.TextRange
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.*
import com.intellij.util.ProcessingContext

class QiqReferenceContributor : PsiReferenceContributor() {
    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
        registrar.registerReferenceProvider(
            PlatformPatterns.psiElement(QiqTypes.STRING_LITERAL).inFile(PlatformPatterns.psiFile(QiqFile::class.java)),
            object : PsiReferenceProvider() {
                override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<PsiReference> {
                    val textRange = TextRange(1, element.textLength - 1)
                    return arrayOf(QiqReference(element, textRange))
                }
            }
        )
    }
}