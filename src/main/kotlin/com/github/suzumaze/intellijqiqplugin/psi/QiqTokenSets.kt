package com.github.suzumaze.intellijqiqplugin.psi

import com.intellij.psi.tree.TokenSet

interface QiqTokenSets {
    companion object {
        val IDENTIFIERS = TokenSet.create(QiqTypes.KEY)
        val COMMENTS: TokenSet = TokenSet.create(QiqTypes.COMMENT)
    }
}