// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class QiqFileType extends LanguageFileType {

    public static final QiqFileType INSTANCE = new QiqFileType();

    private QiqFileType() {
        super(QiqLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Qiq File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Qiq language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "qiq.php";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return QiqIcons.FILE;
    }
}