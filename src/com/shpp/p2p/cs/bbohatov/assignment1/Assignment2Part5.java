package com.shpp.p2p.cs.bbohatov.assignment1;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import org.jcp.xml.dsig.internal.dom.ApacheCanonicalizer;

import java.awt.*;

public class Assignment2Part5 extends WindowProgram {
    /**
     * Application frame dimension
     */
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 450;

    /**
     * The number of rows and columns in the grid, respectively.
     */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /**
     * The width and height of each box.
     */
    private static final double BOX_SIZE = 40;

    /**
     * The horizontal and vertical spacing between the boxes.
     */
    private static final double BOX_SPACING = 10;


    @Override
    public void run() {
        drawRectangles(NUM_COLS, NUM_ROWS, BOX_SPACING, BOX_SIZE);
    }

    /**
     * Precondition: frame is running, method add squares in the center of a frame
     * Result: in the centre of a frame are squares (rowsQty * colsQty), they has a space between them
     *
     * @param rowsQty    - rows of squares
     * @param colsQty    - cols of squares
     * @param boxSpacing - space between squares
     * @param boxSize    - squares size, width and height are the same
     */
    private void drawRectangles(int rowsQty, int colsQty, double boxSpacing, double boxSize) {
        double totalWidth = rowsQty * boxSize + (rowsQty - 1) * boxSpacing;
        double totalHeight = colsQty * boxSize + (colsQty - 1) * boxSpacing;
        double xCoordinate = getWidth() / 2.0 - totalWidth / 2.0;
        double yCoordinate = getHeight() / 2.0 - totalHeight / 2.0;
        for (int i = 0; i < colsQty; i++) {
            for (int j = 0; j < rowsQty; j++) {
                add(drawBlackRectangle(xCoordinate + (j * (boxSize + boxSpacing)), yCoordinate + (i * (boxSize + boxSpacing)), boxSize));
            }
        }
    }

    /**
     * Precondition: frame is running
     * Result: method returns black square in inputted coordinates, with param sizes
     *
     * @param xCoordinate - X coordinate
     * @param yCoordinate - Y coordinate
     * @param size        - square size
     * @return - return black square thant situated in argument coordinates
     */
    private GRect drawBlackRectangle(double xCoordinate, double yCoordinate, double size) {
        GRect rect = new GRect(xCoordinate, yCoordinate, size, size);
        rect.setColor(Color.BLACK);
        rect.setVisible(true);
        rect.setFilled(true);
        return rect;
    }
}
