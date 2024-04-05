package com.toxikdnb.Frontend;

import javax.swing.*;
import java.awt.*;

/**
 * Generic window class to create a window with a title, width, height and resizable option
 */
public class Window {
    protected JFrame mainFrame;
    public Window(String name, int width, int height, boolean isResizable, ImageIcon icon) {
        mainFrame = new JFrame(name);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(width, height);
        mainFrame.setResizable(isResizable);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setIconImage(icon.getImage());
        mainFrame.setVisible(true);
    }
}
