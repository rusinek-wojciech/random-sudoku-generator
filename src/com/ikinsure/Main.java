package com.ikinsure;

import javax.swing.*;
import java.awt.*;

/**
 * Sudoku program.
 * @author iKinsure
 *
 * A {@code Main} class. Generates main frame.
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CalcFrame frame = new CalcFrame();
            frame.setTitle("Sudoku");
            frame.setSize(580, 600);
            frame.setLocationByPlatform(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }
}
