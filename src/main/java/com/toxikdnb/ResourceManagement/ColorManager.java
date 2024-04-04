package com.toxikdnb.ResourceManagement;

import java.awt.Color;

/**
 * Manages the colors used in the application.
 */
public class ColorManager {
    public static final Color TEXT_COLOR = getColor("#2a2b2a");
    public static final Color BUTTON_COLOR = getColor("#5e4955");
    public static final Color MID_COLOUR = getColor("#c99da3");
    public static final Color TEXT_COLOR_LIGHT = getColor("#c6ddf0");
    public static final Color ACCENT_COLOR = getColor("#996888");

    public static Color getColor(String rgb) {
        int r = Integer.valueOf(rgb.substring(1, 3), 16);
        int g = Integer.valueOf(rgb.substring(3, 5), 16);
        int b = Integer.valueOf(rgb.substring(5, 7), 16);
        return new Color(r, g, b);
    }
}
