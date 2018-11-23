package com.shpp.p2p.cs.bbohatov.assignment1;

import acm.graphics.GObject;

import java.awt.*;
import java.util.ArrayList;

public class Assignment2Part4ext extends Assignment2Part4 {
    private static final double RECTANGLE_WIDTH = 100;
    private static final double RECTANGLE_HEIGHT = 250;

    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 450;

    private static final Color LIME_GREEN = new Color(0, 59, 43);

    @Override
    public void run() {

        ArrayList<tricolorCountry> countries = tricolorCounties();

        while (true) {
            for (int i = 0; i < countries.size(); i++) {
                drawTricolorFlag(
                        countries.get(i).getFirstVerticalColor(),
                        countries.get(i).getSecondVerticalColor(),
                        countries.get(i).getThirdVerticalColor(),
                        RECTANGLE_WIDTH,
                        RECTANGLE_HEIGHT);
                drawFlagsCountry("Flag of " + countries.get(i).getCountry());
                pause(5000);
                removeAll();
            }
        }
    }


    /**
     * Method contains countries that has three color flag, flag has three color situated in three same vertical rectangles
     *
     * @return - array of countries name with its flags colors
     */
    public ArrayList<tricolorCountry> tricolorCounties() {
        ArrayList<Assignment2Part4ext.tricolorCountry> countries = new ArrayList<>();
        countries.add(new Assignment2Part4ext.tricolorCountry("Bulgaria", Color.white, LIME_GREEN, Color.black));
        countries.add(new Assignment2Part4ext.tricolorCountry("Chad", Color.BLUE, Color.YELLOW, Color.RED));
        countries.add(new Assignment2Part4ext.tricolorCountry("France", Color.BLUE, Color.WHITE, Color.RED));
        countries.add(new Assignment2Part4ext.tricolorCountry("Guinea", Color.RED, Color.YELLOW, LIME_GREEN));
        countries.add(new Assignment2Part4ext.tricolorCountry("Ireland", LIME_GREEN, Color.WHITE, Color.ORANGE));
        countries.add(new Assignment2Part4ext.tricolorCountry("Italy", LIME_GREEN, Color.WHITE, Color.RED));
        countries.add(new Assignment2Part4ext.tricolorCountry("Mali", Color.GREEN, Color.YELLOW, Color.RED));
        countries.add(new Assignment2Part4ext.tricolorCountry("Nigeria", LIME_GREEN, Color.WHITE, LIME_GREEN));
        return countries;
    }

    /**
     * Class made for special countries that has a three colors flag, that colors must situated vertically
     */
    class tricolorCountry {
        private Color firstVerticalColor;
        private Color secondVerticalColor;
        private Color thirdVerticalColor;
        private String country;

        public tricolorCountry(String country, Color firstVertical, Color secondVertical, Color thirdVertical) {
            this.firstVerticalColor = firstVertical;
            this.secondVerticalColor = secondVertical;
            this.thirdVerticalColor = thirdVertical;
            this.country = country;
        }

        public Color getFirstVerticalColor() {
            return firstVerticalColor;
        }

        public void setFirstVerticalColor(Color firstVerticalColor) {
            this.firstVerticalColor = firstVerticalColor;
        }

        public Color getSecondVerticalColor() {
            return secondVerticalColor;
        }

        public void setSecondVerticalColor(Color secondVerticalColor) {
            this.secondVerticalColor = secondVerticalColor;
        }

        public Color getThirdVerticalColor() {
            return thirdVerticalColor;
        }

        public void setThirdVerticalColor(Color thirdVerticalColor) {
            this.thirdVerticalColor = thirdVerticalColor;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }
}
