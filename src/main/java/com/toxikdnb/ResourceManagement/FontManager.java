package com.toxikdnb.ResourceManagement;

import java.awt.Font;

/**
 * Manages the fonts used in the application.
 */
public class FontManager {
    public static final Font mainFont = new Font("Monospaced", Font.PLAIN, 16);
    public static final Font titleFont = mainFont.deriveFont(Font.BOLD, 32);
    public static final Font buttonFont = mainFont.deriveFont(Font.BOLD, 24);
    public static final Font smallFont = mainFont.deriveFont(Font.PLAIN, 12);
}
