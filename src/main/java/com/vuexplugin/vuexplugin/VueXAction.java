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
import com.intellij.openapi.vfs.VirtualFile;
import com.jetbrains.rd.util.string.StingUtilKt;
import org.jetbrains.annotations.NotNull;


public class VueXAction extends AnAction {

    @Override
    public void actionPerformed ( @NotNull AnActionEvent e ) {

            if(new ActionDialogVueX (true).showAndGet ()){

            }


//        String str,selectedValueInState,documentText, fileName;
//
//        StringBuilder
//                getters = new StringBuilder (),
//                mutations = new StringBuilder (),
//                state = new StringBuilder (),
//                mapGetters = new StringBuilder (),
//                mapMutations = new StringBuilder ();
//
//        Editor editor = e.getData (PlatformDataKeys.EDITOR);
//        assert editor != null;
//
//        selectedValueInState = editor.getSelectionModel ().getSelectedText ();
//
//        Document document = editor.getDocument ();
//        documentText = document.getText ();
//
//        String[] params = selectedValueInState.split (",");
//
//        mapGetters.append ("...mapGetters({\n\t");
//        mapMutations.append ("...mapMutations({\n\t");
//        fileName = getFileName(document);
//        for (String param :params) {
//            str = firstLetterToUpperCase (param);
//            getters.append ("get"+str+"(state){\n\treturn state."+param+";\n},\n");
//            mutations.append ("set"+str+"(state,value){\n\tstate."+param+" = value;\n},\n");
//            state.append (param+":null,\n\t\t");
//            mapGetters.append ("'get"+str+"':'"+fileName+"/get"+str+"',\n\t");
//            mapMutations.append ("'set"+str+"':'"+fileName+"/set"+str+"',\n\t");
//        }
//        mapGetters.append ("}),");
//        mapMutations.append ("}),");
//        documentText = documentText.replace (selectedValueInState,state);
//        document.setText (getters+"\n"+mutations+"\n"+mapGetters+"\n"+mapMutations+"\n"+documentText);
    }


    private String firstLetterToUpperCase(String word){
        if(word==null || word.length ()==0)
            return word;
        return word.substring (0,1).toUpperCase ()+word.substring (1);
    }

    private String getFileName(Document document){
        String temp = document.toString ();
        temp = temp.substring (temp.lastIndexOf ("/")+1).replaceAll (".js]","");
        return temp;
    }

    @Override
    public boolean isDumbAware ( ) {
        return false;
//        return super.isDumbAware ();
    }
}
