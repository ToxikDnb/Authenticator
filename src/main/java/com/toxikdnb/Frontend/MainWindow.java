package com.toxikdnb.Frontend;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

import com.toxikdnb.ResourceManagement.FontManager;

public class MainWindow extends Window {
    public MainWindow(String name, int width, int height, boolean isResizable, Image icon) {
        super(name, width, height, isResizable, icon);

        JPanel panel = new JPanel(new BorderLayout());
        mainFrame.add(panel);

        JLabel titleLabel = new JLabel("Authenticator");
        titleLabel.setFont(FontManager.getTitleFont());
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBorder(new MatteBorder(0, 0, 2, 0, Color.darkGray));
        panel.add(titleLabel, BorderLayout.NORTH);

        mainFrame.revalidate();
    }
}
