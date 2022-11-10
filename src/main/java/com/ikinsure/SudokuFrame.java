package com.ikinsure;

import javax.swing.*;

/**
 * Class adds panel.
 */
public class SudokuFrame extends JFrame {
    public SudokuFrame() {
        SudokuPanel panel = new SudokuPanel();
        add(panel);
    }
}
