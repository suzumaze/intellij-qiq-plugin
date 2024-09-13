package com.github.suzumaze.intellijqiqplugin

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class QiqColorSettingsPage : ColorSettingsPage {

    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Key", QiqSyntaxHighlighter.KEY),
            AttributesDescriptor("Separator", QiqSyntaxHighlighter.SEPARATOR),
            AttributesDescriptor("Value", QiqSyntaxHighlighter.VALUE),
            AttributesDescriptor("Bad value", QiqSyntaxHighlighter.BAD_CHARACTER)
        )
    }

    override fun getIcon(): Icon {
        return QiqIcons.FILE
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return QiqSyntaxHighlighter()
    }

    override fun getDemoText(): String {
        return """
            # You are reading the ".properties" entry.
            ! The exclamation mark can also mark text as comments.
            website = https://en.wikipedia.org/
            language = English
            # The backslash below tells the application to continue reading
            # the value onto the next line.
            message = Welcome to \
                      Wikipedia!
            # Add spaces to the key
            key\ with\ spaces = This is the value that could be looked up with the key "key with spaces".
            # Unicode
            tab : \u0009
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