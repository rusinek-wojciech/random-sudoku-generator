package com.ikinsure;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 *Class {@code CalcPanel} contains main panel.
 *Logic is done there.
 */
public class CalcPanel extends JPanel {

    private static int[][] number;

    private static final int SIZE = 9;

    public CalcPanel() {

        setBackground(Color.BLACK);
        LayoutManager layout = new GridLayout(SIZE, SIZE);
        JPanel panel = new JPanel();
        panel.setLayout(layout);
        panel.setBackground(Color.GRAY);
        CalcButton[][] button = new CalcButton[SIZE][SIZE];
        randomManager();
        Random rand = new Random();

        // Creates buttons and decides about hiding.
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                boolean isConst = true;
                int tmp = rand.nextInt(4);
                //isConst = false;


                button[i][j] = new CalcButton(number[i][j], isConst);
                if (i < 3 && j < 3) {
                    button[i][j].initializeButton(new Color(230, 245, 255));
                }
                else if (i < 6 && j < 3) {
                    button[i][j].initializeButton(new Color(204, 235, 255));
                }
                else if (j < 3) {
                    button[i][j].initializeButton(new Color(179, 224, 255));
                }
                else if (i < 3 && j < 6) {
                    button[i][j].initializeButton(new Color(153, 214, 255));
                }
                else if (i < 6 && j < 6) {
                    button[i][j].initializeButton(new Color(128, 204, 255));
                }
                else if (j < 6) {
                    button[i][j].initializeButton(new Color(102, 194, 255));
                }
                else if (i < 3) {
                    button[i][j].initializeButton(new Color(77, 184, 255));
                }
                else if (i < 6) {
                    button[i][j].initializeButton(new Color(51, 173, 255));
                }
                else {
                    button[i][j].initializeButton(new Color(26, 163, 255));
                }
                panel.add(button[i][j]);
            }
        }
        add(panel, BorderLayout.SOUTH);
    }


    /**
     *Doing while generating with error.
     */
    private void randomManager() {
        number = new int[SIZE][SIZE];
        boolean done;
        do {
            resetRandom();
            done = randomGenerator();
        } while (!done);
    }


    /**
     *Function is generating all sudoku numbers.
     * @return false if error.
     */
    private boolean randomGenerator() {

        boolean isGood;
        int row;
        int column;
        Random randNumber1 = new Random();
        Random randNumber2= new Random();

        for (int value = SIZE; value >= 1; value--) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int tmp = 0;
                    do {
                        isGood = true;
                        row = i*3 + randNumber1.nextInt(3);
                        column = j*3 + randNumber2.nextInt(3);

                        if (number[row][column] != 0) {
                            isGood = false;
                        }
                        for (int n = 0; n < SIZE; n++) {
                            if (number[row][n] == value) {
                                isGood = false;
                            }
                            if (number[n][column] == value) {
                                isGood = false;
                            }
                        }
                        if (tmp >= 600) {
                            return false;
                        }
                        tmp++;
                    } while (!isGood);
                    number[row][column] = value;
                }
            }
        }
        return true;
    }


    /**
     * Gives all numbers value of 0.
     */
    private void resetRandom() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                number[i][j] = 0;
            }
        }
    }

}
