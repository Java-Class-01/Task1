package org.example;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
class MusicLayoutTest {

    @Test
    void testFrameEast() {
        new MusicLayout();

        Frame[] frames = Frame.getFrames();

        JFrame frame = null;
        for (Frame east : frames) {
            if (east instanceof JFrame) {
                frame = (JFrame) east;
            }
        }
    }

    @Test
    void testFrameWest() {
        new MusicLayout();

        Frame[] frames = Frame.getFrames();

        JFrame frame = null;
        for (Frame west : frames) {
            if (west  instanceof JFrame) {
                frame = (JFrame) west;
            }
        }
    }

}