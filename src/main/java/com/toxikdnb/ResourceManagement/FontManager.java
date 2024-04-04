package com.toxikdnb.ResourceManagement;

import java.awt.Font;

/**
 * Manages the fonts used in the application.
 */
public class FontManager {
    private static Font mainFont = new Font("Monospaced", Font.PLAIN, 16);
    private static Font titleFont = mainFont.deriveFont(Font.BOLD, 32);
    private static Font buttonFont = mainFont.deriveFont(Font.BOLD, 24);
    private static Font smallFont = mainFont.deriveFont(Font.PLAIN, 12);

    public static Font getMainFont() {
        return mainFont;
    }

    public static Font getTitleFont() {
        return titleFont;
    }

    public static Font getButtonFont() {
        return buttonFont;
    }

    public static Font getSmallFont() {
        return smallFont;
    }
}
