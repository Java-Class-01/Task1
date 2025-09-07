package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MusicLayoutTest {
    @Test
    void testFrameComponents() {
        // Arrange
        new MusicLayout();

        // Act
        Frame[] frames = Frame.getFrames();

        // Assert
        Assertions.assertTrue(frames.length > 0, "Frame should be created");

        // Find the first JFrame
        JFrame frame = null;
        for (Frame f : frames) {
            if (f instanceof JFrame) {
                frame = (JFrame) f;
                break;
            }

        }
    }
}