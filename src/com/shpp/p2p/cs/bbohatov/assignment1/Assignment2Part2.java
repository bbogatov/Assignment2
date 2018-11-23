package com.shpp.p2p.cs.bbohatov.assignment1;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;

/**
 * Class creates frame with 4 black ovals in each corner, and one white rectangle which situated in ovals center
 */
public class Assignment2Part2 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 450;
    public static final int APPLICATION_HEIGHT = 450;
    public static final int OVAL_DIAMETER = 100;

    @Override
    public void run() {
        drawFourOvalsOnCorners(OVAL_DIAMETER);
        add(drawRectangleOverOvals(OVAL_DIAMETER));
    }


    /**
     * Precondition: empty frame
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
     * Precondition: empty window
     * Result: window has 4 black ovals on each corner
     * @param ovalDiameter - diameter of oval that need to create in frame
     */
    private void drawFourOvalsOnCorners(int ovalDiameter) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                add(addOval((i * getWidth() == 0 ? 0 : i * getWidth() - ovalDiameter), (j * getHeight() == 0 ? 0 : j * getHeight() - ovalDiameter), ovalDiameter));
            }
        }
    }

    /**
     * Precondition: frame with 4 ovals in each corner
     * Result: returns white rectangle which situated in ovals centers
     * @param ovalDiameter
     * @return - white rectangle which situated in @param ovalDiameter center
     */
    private GRect drawRectangleOverOvals(int ovalDiameter){
        double width = getWidth() - ovalDiameter;
        double height = getHeight() - ovalDiameter;
        GRect gRect = new GRect(ovalDiameter / 2.0, ovalDiameter / 2.0, width, height);
        gRect.setColor(Color.white);
        gRect.setFilled(true);
        return gRect;
    }


}
