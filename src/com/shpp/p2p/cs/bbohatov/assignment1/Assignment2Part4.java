package com.shpp.p2p.cs.bbohatov.assignment1;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Class creates frame with a flag of Belgium in a center, and a text in right bottom corner "Flag of Belgium"
 */
public class Assignment2Part4 extends WindowProgram {
    private static final double RECTANGLE_WIDTH = 100;
    private static final double RECTANGLE_HEIGHT = 250;

    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 450;

    @Override
    public void run() {
        drawTricolorFlag(Color.black, Color.yellow, Color.red, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
        drawFlagsCountry("Flag of Belgium");
    }

    /**
     * Method draws inputted string in bottom right corner
     * Has Verdana-20 font
     *
     * @param string - string wanna add to frame
     */
    void drawFlagsCountry(String string) {
        GLabel label = new GLabel(string);
        label.setFont("Verdana-20");
        double height = label.getHeight() - label.getAscent();
        double width = label.getWidth();
        add(label, getWidth() - width, getHeight() - height);
    }

    /**
     * Method adds on frame three same size rectangle, with different colors that are in params
     * Rectangles situated as a one big rectangle in the center of a frame, near each other
     *
     * @param firstVerticalColor  - first rectangle color
     * @param secondVerticalColor - second rectangle color
     * @param thirdVerticalColor  - third rectangle color
     * @param width               - width of rectangle
     * @param height              - height of rectangle
     */
    void drawTricolorFlag(Color firstVerticalColor, Color secondVerticalColor, Color thirdVerticalColor, double width, double height) {
        Color[] colors = new Color[]{firstVerticalColor, secondVerticalColor, thirdVerticalColor};
        double xCoordinate = (getWidth() / 2.0) - ((width * 3.0) / 2.0);
        double yCoordinate = getHeight() / 2.0 - height / 2.0;
        for (int i = 0; i < 3; i++) {
            add(drawColorRectangle(xCoordinate + (i * width), yCoordinate, width, height, colors[i]));
        }
    }

    /**
     * Method returns filled rectangle, with entered width and height, and situated in parameters coordinate
     *
     * @param xCoordinate - system coordinate X
     * @param yCoordinate - system coordinate Y
     * @param width       - width of rectangle
     * @param height      - height of rectangle
     * @param color
     * @return - returns a rectangle with inputted parameters
     */
    GRect drawColorRectangle(double xCoordinate, double yCoordinate, double width, double height, Color color) {
        GRect rect = new GRect(xCoordinate, yCoordinate, width, height);
        rect.setColor(color);
        rect.setFilled(true);
        add(rect);
        return rect;
    }
}
