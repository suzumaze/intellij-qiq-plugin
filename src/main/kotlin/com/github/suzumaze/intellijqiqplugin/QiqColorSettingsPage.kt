package com.github.suzumaze.intellijqiqplugin

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class QiqColorSettingsPage : ColorSettingsPage {

    override fun getIcon(): Icon {
        return QiqIcons.FILE
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return QiqSyntaxHighlighter()
    }

    override fun getDemoText(): String {
        return """
            {{= php }}
            {{h ${'$'}foo }}
            {{h "foo" }}
            {{h 1 + 2 }}
            {{h __FILE__ }}
            {{h PHP_EOL }}
            {{h ${'$'}person->firstName() }}
            {{h time() }}
            {{ foreach (${'$'}foo as ${'$'}bar => ${'$'}baz): }}
                {{ if (${'$'}baz === 0): }}
                    {{= "First element!" }}
                {{ else: }}
                    {{= "Not the first element." }}
                {{ endif }}
            {{ endforeach }}
            <title>{{h ${'$'}this }}</title>
        """.trimIndent()
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    override fun getDisplayName(): String {
        return "Qiq"
    }
}

private val DESCRIPTORS = arrayOf(
    AttributesDescriptor("Delimiter", QiqSyntaxHighlighter.DELIMITER_TAG),
    AttributesDescriptor("Statement", QiqSyntaxHighlighter.STATEMENT_TAG),
    AttributesDescriptor("Variable", QiqSyntaxHighlighter.VARIABLE_TAG),
)