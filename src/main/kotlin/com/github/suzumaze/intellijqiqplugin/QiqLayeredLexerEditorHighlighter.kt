package com.github.suzumaze.intellijqiqplugin

import com.github.suzumaze.intellijqiqplugin.psi.QiqTypes
import com.intellij.ide.highlighter.HtmlFileHighlighter
import com.intellij.openapi.editor.colors.EditorColorsScheme
import com.intellij.openapi.editor.ex.util.LayerDescriptor
import com.intellij.openapi.editor.ex.util.LayeredLexerEditorHighlighter

class QiqLayeredLexerEditorHighlighter(colors: EditorColorsScheme) :
    LayeredLexerEditorHighlighter(QiqSyntaxHighlighter(), colors) {
    init {
        val htmlHighlighter = HtmlFileHighlighter()

        registerLayer(QiqTypes.CONTENT, LayerDescriptor(htmlHighlighter, ""))
    }
}

