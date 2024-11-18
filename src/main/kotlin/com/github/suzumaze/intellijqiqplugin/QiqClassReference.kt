package com.github.suzumaze.intellijqiqplugin

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReferenceBase
import com.jetbrains.php.PhpIndex

class QiqClassReference(
    element: PsiElement,
    private val className: String
) : PsiReferenceBase<PsiElement>(element, TextRange(0, element.textLength)) {
    override fun resolve(): PsiElement? {
        val project = element.project
        val phpIndex = PhpIndex.getInstance(project)

        phpIndex.getClassesByFQN(className).firstOrNull()?.let { return it }

        return phpIndex.getClassesByName(className).firstOrNull()
    }
}