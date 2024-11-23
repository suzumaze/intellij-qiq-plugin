package com.github.suzumaze.intellijqiqplugin.psi

import com.github.suzumaze.intellijqiqplugin.QiqClassReference
import com.github.suzumaze.intellijqiqplugin.QiqReference
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiReference

object QiqPsiImplUtil {
    @JvmStatic
    fun getReference(element: QiqStringLiteral): PsiReference? {
        val value = element.text
        return if (value.contains("/")) {
            val range = TextRange(1, value.length - 1)
            QiqReference(element, range)
        } else {
            null
        }
    }

    @JvmStatic
    fun getReference(element: QiqQualifiedName): PsiReference {
        return QiqClassReference(element, element.text)
    }

    @JvmStatic
    fun getReference(element: QiqDocQualifiedName): PsiReference {
        return QiqClassReference(element, element.text)
    }

    @JvmStatic
    fun getReference(element: QiqFunction): PsiReference {
        return QiqClassReference(element, element.text)
    }
}