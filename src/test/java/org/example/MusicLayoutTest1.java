package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

class MusicLayoutTest {

    @Test
    void testNorthButtonText() throws Exception {
        // Run GUI creation on EDT
        SwingUtilities.invokeAndWait(MusicLayout::new);

        // Get all top-level frames
        Frame[] frames = Frame.getFrames();
        JFrame frame = null;
        for (Frame f : frames) {
            if (f instanceof JFrame) {
                frame = (JFrame) f;
                break;
            }
        }

        Assertions.assertNotNull(frame, "No JFrame found");

        // NORTH button
        JButton northButton = (JButton) frame.getContentPane().getComponent(0);
        Assertions.assertEquals("My Music Genre", northButton.getText());
    }

    @Test
    void testSouthButtonText() throws Exception {
        SwingUtilities.invokeAndWait(MusicLayout::new);

        Frame[] frames = Frame.getFrames();
        JFrame frame = null;
        for (Frame f : frames) {
            if (f instanceof JFrame) {
                frame = (JFrame) f;
            }
        }

        Assertions.assertNotNull(frame, "No JFrame found");

        // SOUTH button
        JButton southButton = (JButton) frame.getContentPane().getComponent(1);
        Assertions.assertEquals("Rap Music", southButton.getText());
    }
}
