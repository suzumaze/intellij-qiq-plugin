package com.github.suzumaze.intellijqiqplugin

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.search.FilenameIndex
import com.intellij.psi.search.GlobalSearchScope

class QiqReference(
    element: PsiElement,
    textRange: TextRange
) : PsiReferenceBase<PsiElement>(element, textRange) {
    override fun resolve(): PsiElement? {
        val project = element.project
        var filePath = element.text.substring(rangeInElement.startOffset, rangeInElement.endOffset)

        // 拡張子が含まれていない場合は .qiq.php を補う
        if (!filePath.contains(".")) {
            filePath += ".qiq.php"
        }

        // ファイル名を抽出
        val fileName = filePath.substringAfterLast('/')

        // プロジェクト全体を対象にファイルを検索
        val virtualFiles = FilenameIndex.getVirtualFilesByName(
            fileName, GlobalSearchScope.projectScope(project)
        )

        // 最初のVirtualFileをPsiFileに変換して返す
        val virtualFile = virtualFiles.firstOrNull() ?: return null
        return PsiManager.getInstance(project).findFile(virtualFile)
    }
}