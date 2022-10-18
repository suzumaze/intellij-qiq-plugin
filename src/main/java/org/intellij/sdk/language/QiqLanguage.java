package org.intellij.sdk.language;

import com.intellij.lang.Language;

public class QiqLanguage extends Language {

    public static final QiqLanguage INSTANCE = new QiqLanguage();

    private QiqLanguage() {
        super("Qiq");
    }
}