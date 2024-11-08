package com.github.suzumaze.intellijqiqplugin.psi.impl

import com.github.suzumaze.intellijqiqplugin.QiqReference
import com.github.suzumaze.intellijqiqplugin.psi.QiqStringLiteral
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiReference

object QiqPsiImplUtil {
    @JvmStatic
    fun getStringValue(element: QiqStringLiteral): String {
        val text = element.text
        return when {
            text.startsWith('\'') || text.startsWith('"') -> text.substring(1, text.length - 1)
            else -> text
        }
    }

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
}