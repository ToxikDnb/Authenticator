package com.toxikdnb.Frontend;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

import com.toxikdnb.ResourceManagement.ColorManager;
import com.toxikdnb.ResourceManagement.FontManager;

public class MainWindow extends Window {

    JPanel buttonPanel;

    public MainWindow(String name, int width, int height, boolean isResizable, ImageIcon icon) {
        super(name, width, height, isResizable, icon);

        JPanel panel = new JPanel(new BorderLayout());
        mainFrame.add(panel);

        JLabel titleLabel = new JLabel("Authenticator");
        titleLabel.setFont(FontManager.titleFont);
        titleLabel.setForeground(ColorManager.TEXT_COLOR);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBorder(new MatteBorder(0, 0, 2, 0, Color.darkGray));
        panel.add(titleLabel, BorderLayout.NORTH);

        buttonPanel = new JPanel(new GridLayout(0, 1));
        JScrollPane scrollPane = new JScrollPane(buttonPanel);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(null);
        for (int i = 0; i < 20; i++) {
            AddHashButton("Button " + i);
        }
        panel.add(scrollPane, BorderLayout.CENTER);

        mainFrame.revalidate();
    }

    public void AddHashButton(String title) {
        HashButton button = new HashButton(title);
        buttonPanel.add(button);
        mainFrame.revalidate();
    }
}
