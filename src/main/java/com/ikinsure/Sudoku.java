package com.ikinsure;

import javax.swing.*;
import java.awt.*;

/**
 * Sudoku program.
 * @author iKinsure
 *
 * A {@code Sudoku} class. Generates main frame.
 */
public class Sudoku {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SudokuFrame frame = new SudokuFrame();
            frame.setTitle("Sudoku");
            frame.setSize(580, 600);
            frame.setLocationByPlatform(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setVisible(true);
            frame.pack();
        });
    }
}
