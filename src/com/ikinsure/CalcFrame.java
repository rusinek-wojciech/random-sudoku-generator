package com.ikinsure;

import javax.swing.*;

/**
 * Class adds panel.
 */
public class CalcFrame extends JFrame {
    public CalcFrame() {
        CalcPanel panel = new CalcPanel();
        add(panel);
        pack();
    }
}
