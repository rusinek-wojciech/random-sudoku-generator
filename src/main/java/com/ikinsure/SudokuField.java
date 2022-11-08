package com.ikinsure;

import javax.swing.*;
import java.awt.*;

/**
 * Class {@code SudokuField}.
 * Sudoku buttons.
 */
public class SudokuField extends JButton {

    private final int value;

    public SudokuField(int value) {
        this.value = value;
    }

    /**
     * Settings of button + listeners.
     * @param color of button.
     */
    public void initializeButton(Color color) {
        this.setBackground(color);
        this.setPreferredSize(new Dimension(60, 60));
        this.setMargin(new Insets(0, 0, 0, 0));
        this.setText(Integer.toString(value));
        this.setFont(new Font("Arial", Font.BOLD, 40));
    }

}

