package com.vuexplugin.vuexplugin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileChooser.ex.FileChooserKeys;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.vfs.VirtualFile;
import com.jetbrains.rd.util.string.StingUtilKt;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class VueXAction extends AnAction {

    @Override
    public void actionPerformed ( @NotNull AnActionEvent e ) {
        Editor editor = e.getData (PlatformDataKeys.EDITOR);
        ActionDialogVueX  dialog = new ActionDialogVueX(editor);
        JBPopupFactory.getInstance().createListPopup(dialog,5).showInFocusCenter();
    }
}
