package com.toxikdnb.Frontend;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import com.toxikdnb.ResourceManagement.ColorManager;
import com.toxikdnb.ResourceManagement.FontManager;

public class HashButton extends JPanel {

    private String code = "456294";
    private String title = "";
    JButton button;

    public HashButton(String title) {
        button = new JButton("<html><center>" + title + "<br>" + "000000" + "</center></html>");
        this.title = title;
        setLayout(new BorderLayout());
        button.setFont(FontManager.buttonFont);
        button.setFocusPainted(false);
        button.setForeground(ColorManager.TEXT_COLOR);
        button.setBackground(ColorManager.BUTTON_COLOR);
        button.setBorder(new BevelBorder(BevelBorder.RAISED));
        setBorder(
                new EmptyBorder(5, 10, 5, 10));
        updateText();
        setBackground(ColorManager.BG_COLOUR);
        add(button, BorderLayout.CENTER);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                StringSelection stringSelection = new StringSelection(code);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            }
        });
    }

    public void updateText() {
        button.setText("<html><center>" + title + "<br>" + code + "</center></html>");
    }
}
