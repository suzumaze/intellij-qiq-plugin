package com.github.suzumaze.intellijqiqplugin

import com.github.suzumaze.intellijqiqplugin.psi.QiqTypes
import com.intellij.ide.highlighter.HtmlFileType
import com.intellij.openapi.editor.colors.EditorColorsScheme
import com.intellij.openapi.editor.ex.util.LayerDescriptor
import com.intellij.openapi.editor.ex.util.LayeredLexerEditorHighlighter
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.fileTypes.FileTypes
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.templateLanguages.TemplateDataLanguageMappings

class QiqLayeredLexerEditorHighlighter(project: Project?, virtualFile: VirtualFile?, colors: EditorColorsScheme) :
    LayeredLexerEditorHighlighter(QiqSyntaxHighlighter(), colors) {
    init {
        var type: FileType? = null
        if (project == null || virtualFile == null) {
            type = FileTypes.PLAIN_TEXT
        } else {
            val language = TemplateDataLanguageMappings.getInstance(project).getMapping(virtualFile)
            if (language != null) type = language.associatedFileType
            if (type == null) type = HtmlFileType.INSTANCE
        }

        val outerHighlighter = SyntaxHighlighterFactory.getSyntaxHighlighter(type!!, project, virtualFile)

        registerLayer(QiqTypes.CONTENT, LayerDescriptor(outerHighlighter!!, ""))
    }
}

