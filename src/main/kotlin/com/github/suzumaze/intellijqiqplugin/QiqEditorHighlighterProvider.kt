package com.github.suzumaze.intellijqiqplugin

import com.intellij.openapi.editor.colors.EditorColorsScheme
import com.intellij.openapi.editor.highlighter.EditorHighlighter
import com.intellij.openapi.fileTypes.EditorHighlighterProvider
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class QiqEditorHighlighterProvider : EditorHighlighterProvider {
    override fun getEditorHighlighter(
        project: Project?,
        fileType: FileType,
        virtualFile: VirtualFile?,
        editorColorsScheme: EditorColorsScheme
    ): EditorHighlighter {
        return QiqLayeredLexerEditorHighlighter(project, virtualFile, editorColorsScheme)
    }
}