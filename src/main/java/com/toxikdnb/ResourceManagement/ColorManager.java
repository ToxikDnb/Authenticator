package com.toxikdnb.ResourceManagement;

import java.awt.Color;

/**
 * Manages the colors used in the application.
 */
public class ColorManager {
    public static final Color TEXT_COLOR = getColor("#14110F");
    public static final Color ACCENT_COLOR = getColor("#04A777");
    public static final Color BG_COLOUR = getColor("#FFFBDB");
    public static final Color TEXT_COLOR_LIGHT = getColor("#A6ECE0");
    public static final Color BUTTON_COLOR = getColor("#F0424F");

    public static Color getColor(String rgb) {
        int r = Integer.valueOf(rgb.substring(1, 3), 16);
        int g = Integer.valueOf(rgb.substring(3, 5), 16);
        int b = Integer.valueOf(rgb.substring(5, 7), 16);
        return new Color(r, g, b);
    }
}
