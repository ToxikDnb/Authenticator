package com.toxikdnb.Frontend;

import javax.swing.JButton;

import com.toxikdnb.ResourceManagement.ColorManager;
import com.toxikdnb.ResourceManagement.FontManager;

public class HashButton extends JButton {

    private String code = "456294";
    private String title = "";

    public HashButton(String title) {
        super("<html><center>" + title + "<br>" + "000000" + "</center></html>");
        this.title = title;
        setFont(FontManager.buttonFont);
        setFocusPainted(false);
        setForeground(ColorManager.TEXT_COLOR);
        setBackground(ColorManager.BUTTON_COLOR);
        updateText();
    }

    public void updateText() {
        setText("<html><center>" + title + "<br>" + code + "</center></html>");
    }
}
