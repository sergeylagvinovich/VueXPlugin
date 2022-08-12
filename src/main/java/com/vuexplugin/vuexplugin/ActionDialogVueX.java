package com.vuexplugin.vuexplugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.components.JBLabel;
import com.intellij.uiDesigner.core.AbstractLayout;
import com.intellij.util.ui.GridBag;
import com.intellij.util.ui.JBUI;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class ActionDialogVueX extends DialogWrapper {


    JPanel panel = new JPanel(new GridBagLayout());
    JTextField txtMode = new JTextField();

    protected ActionDialogVueX ( boolean canBeParent ) {
        super (canBeParent);
    }

    @Override
    protected @Nullable JComponent createCenterPanel ( ) {
        GridBag gb = new GridBag ()
                .setDefaultInsets (JBUI.insets (0, 0, AbstractLayout.DEFAULT_VGAP, AbstractLayout.DEFAULT_HGAP))
                .setDefaultWeightX (1.0)
                .setDefaultFill (GridBagConstraints.HORIZONTAL);
        panel.setPreferredSize (new Dimension (400,200));
        panel.add (label ("mode"),gb.next ().weightx(0.2));
        panel.add (txtMode,gb.next ().weightx(0.8));

        return panel;
    }

    private JComponent label(String text){

        JBLabel label = new JBLabel (text);
        label.setComponentStyle (UIUtil.ComponentStyle.SMALL);
        label.setFontColor (UIUtil.FontColor.BRIGHTER);
        label.setBorder (JBUI.Borders.empty (0,5,2,0));

        return label;
    }
}
