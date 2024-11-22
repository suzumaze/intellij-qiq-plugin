package com.github.suzumaze.intellijqiqplugin

import com.github.suzumaze.intellijqiqplugin.psi.QiqTypes
import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext

internal class QiqCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(QiqTypes.IDENTIFIER),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    resultSet: CompletionResultSet
                ) {
                    quotedHelpers.forEach { resultSet.addElement(it) }
                    simpleHelpers.forEach { resultSet.addElement(it) }

                    resultSet.addElement(foreachTag)
                    resultSet.addElement(LookupElementBuilder.create("endforeach ").withIcon(QiqIcons.FILE))
                }

                private val quoteCursorHandler = InsertHandler<LookupElement> { insertionContext, _ ->
                    val editor = insertionContext.editor
                    val cursorOffset = insertionContext.tailOffset - 3
                    editor.caretModel.moveToOffset(cursorOffset)
                }

                private val quotedHelpers = listOf(
                    "setBlock",
                    "setLayout",
                    "extends",
                    "render"
                ).map { helper ->
                    LookupElementBuilder.create("$helper ('') ")
                        .withIcon(QiqIcons.FILE)
                        .withInsertHandler(quoteCursorHandler)
                }

                private val simpleHelpers = listOf(
                    "endBlock",
                    "parentBlock",
                    "getBlock",
                    "getContent"
                ).map { helper ->
                    LookupElementBuilder.create("$helper () ")
                        .withIcon(QiqIcons.FILE)
                }

                private val foreachTag = LookupElementBuilder.create("foreach(): ")
                    .withIcon(QiqIcons.FILE)
                    .withInsertHandler(quoteCursorHandler)
            }
        )
    }
}
