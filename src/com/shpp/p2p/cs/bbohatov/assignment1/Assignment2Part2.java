package com.shpp.p2p.cs.bbohatov.assignment1;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;


import java.awt.*;

public class Assignment2Part2 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;
    public static final int OVAL_DIAMETER = 50;

    @Override
    public void run() {
        addFourOvalsOnCorners();
        addRectangle();
    }

    private void addRectangle() {
    }

    /**
     * Method creates a black Oval with in inputted parameters, with inputted size
     * @param xCoordinate - X coordinate where need place Oval
     * @param yCoordinate - Y coordinate where need place Oval
     * @param diameter - Oval diameter
     * @return - returns black oval, which situated in methods parameters, with methods size
     */
    private GOval addOval(int xCoordinate, int yCoordinate, int diameter) {
        GOval oval = new GOval(xCoordinate, yCoordinate, diameter, diameter);
        oval.setColor(Color.BLACK);
        oval.setFilled(true);
        oval.setVisible(true);
        oval.sendToBack();
        return oval;
    }

    /**
     * Method creates four ovals, in each corner of a window
     */
    private void addFourOvalsOnCorners() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                add(addOval((i * getWidth() == 0 ? 0 : i * getWidth() - OVAL_DIAMETER), (j * getHeight() == 0 ? 0 : j * getHeight() - OVAL_DIAMETER), OVAL_DIAMETER));
            }
        }
    }

}
