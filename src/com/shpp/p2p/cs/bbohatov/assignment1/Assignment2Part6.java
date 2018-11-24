package com.shpp.p2p.cs.bbohatov.assignment1;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part6 extends WindowProgram {
    /**
     * Application frame dimension
     */
    public static final int APPLICATION_HEIGHT = 250;
    public static final int APPLICATION_WIDTH = 650;

    //Circle diameter
    public static final double CATERPILLAR_DIAMETER = 90;

    //Quantity of circles
    public static final int CATERPILLAR_SIZE = 10;

    //Space between circles
    public static final int SPACE_BETWEEN = 5;

    @Override
    public void run() {
        drawCaterpillar(CATERPILLAR_DIAMETER, CATERPILLAR_SIZE, SPACE_BETWEEN);
    }

    /**
     * Method draws 2 rows of circles, each row has half "@param circlesQty" - circles
     *
     * First row of circle has yellow color, and situated in a bottom of a frame
     * Second row has a black color, situated half diameter upper of bottom
     * In each row circles have a space between them, space equal to third method parameter
     *
     * @param diameter - circle diameter
     * @param circlesQty - quantity of circles
     * @param spaceBetweenCircle - space between circles
     */
    private void drawCaterpillar(double diameter, int circlesQty, int spaceBetweenCircle) {
        for (int i = 0; i < circlesQty; i++) {
            GOval oval = new GOval(diameter, diameter);
            oval.setFilled(true);
            oval.setColor(Color.RED);
            if (i % 2 == 0) {
                oval.setFillColor(Color.YELLOW);
                add(oval, 0 + (i * (diameter / 2 + spaceBetweenCircle)), getHeight()- diameter);
            } else {
                oval.setFillColor(Color.BLACK);
                add(oval, 0 + (i * (diameter / 2 + spaceBetweenCircle)), getHeight() - (diameter * 1.5));
            }
        }
    }
}
