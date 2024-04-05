package com.toxikdnb.App;

import com.toxikdnb.Frontend.MainWindow;
import com.toxikdnb.ResourceManagement.ResourceManager;

public class Main {
    public static void main(String[] args) {
        new MainWindow("Authenticator", 600, 600, true, ResourceManager.GetResource("appIcon96.png"));
    }
}