package com.toxikdnb.ResourceManagement;

import javax.swing.ImageIcon;

public class ResourceManager {
    public static ImageIcon GetResource(String filename) {
        // Get maven resource filename
        // Print if filename exists
        return new ImageIcon(ResourceManager.class.getClassLoader().getResource(filename));
    }
}
