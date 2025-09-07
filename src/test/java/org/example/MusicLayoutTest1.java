package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

class MusicLayoutTest {

    @Test
    void testFrameTitle() {
        new MusicLayout();

        Frame[] frames = Frame.getFrames();

        JFrame frame = null;
        for (Frame f : frames) {
            if (f instanceof JFrame) {
                frame = (JFrame) f;
            }
        }
    }
}
