package org.example;

import java.awt.*;
import java.awt.GraphicsEnvironment;

public class Main {
    public static void main(String[] args) {
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Running in headless mode - skipping UI");
        } else {
            MusicLayout Music = new MusicLayout();
        }

    }
}