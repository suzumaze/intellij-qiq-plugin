package com.github.suzumaze.intellijqiqplugin

import com.github.suzumaze.intellijqiqplugin.parser.QiqParser
import com.github.suzumaze.intellijqiqplugin.psi.QiqFile
import com.github.suzumaze.intellijqiqplugin.psi.QiqTokenSets
import com.github.suzumaze.intellijqiqplugin.psi.QiqTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class QiqParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = QiqLexerAdapter()
    override fun getCommentTokens(): TokenSet = QiqTokenSets.COMMENTS
    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY
    override fun createParser(project: Project): PsiParser = QiqParser()
    override fun getFileNodeType(): IFileElementType = IFileElementType(QiqLanguage.INSTANCE)
    override fun createFile(viewProvider: FileViewProvider): PsiFile = QiqFile(viewProvider)
    override fun createElement(node: ASTNode): PsiElement = QiqTypes.Factory.createElement(node)
}