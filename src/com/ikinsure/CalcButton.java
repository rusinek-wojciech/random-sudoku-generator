package com.ikinsure;

import javax.swing.*;
import java.awt.*;

/**
 * Class {@code CalcButton}.
 * All sudoku buttons.
 */
public class CalcButton extends JButton {

    private int value;
    private final boolean isConst;

    public CalcButton(int value, boolean isConst) {
        this.value = value;
        this.isConst = isConst;
    }

    /**
     * Settings of button + listeners.
     * @param color of button.
     */
    public void initializeButton(Color color) {
        this.setBackground(color);
        this.setPreferredSize(new Dimension(60, 60));
        this.setMargin(new Insets(0, 0, 0, 0));
        if (isConst) {
            this.setText(Integer.toString(value));
            this.setFont(new Font("Arial", Font.BOLD, 40));
        }
        else {
            this.value = 0;
            this.setText("");
            this.setFont(new Font("Arial", Font.PLAIN, 40));
            this.addActionListener(e -> {
                if (value == 9) {
                    value = 1;
                }
                else {
                    value++;
                }
                this.setText(Integer.toString(value));
            });
        }
    }

}

