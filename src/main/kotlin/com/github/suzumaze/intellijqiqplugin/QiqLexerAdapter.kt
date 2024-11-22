package com.github.suzumaze.intellijqiqplugin

import com.intellij.lexer.FlexAdapter

class QiqLexerAdapter : FlexAdapter(QiqLexer(null))