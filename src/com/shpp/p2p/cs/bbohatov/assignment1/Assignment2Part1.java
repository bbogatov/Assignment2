package com.shpp.p2p.cs.bbohatov.assignment1;

import com.shpp.cs.a.console.TextProgram;

import java.math.BigDecimal;

/**
 * Class asks user input 3 numbers, first number must not be zero
 * After user put three numbers class solve quadratic equation
 */
public class Assignment2Part1 extends TextProgram {
    @Override
    public void run() {
        System.out.print("Hello, welcome to quadratic factorization solving program");
        double firstNumber = askFirstNumber("\nEnter first");
        double secondNumber = askUserNumber("Enter second");
        double thirdNumber = askUserNumber("Enter third");
        double discriminant = discriminant(firstNumber, secondNumber, thirdNumber);
        if (discriminant < 0) {
            System.out.println("There are no real roots");
        } else if (discriminant == 0) {
            System.out.println("There is one root: " + firstRoot(firstNumber, secondNumber, discriminant));
        } else {
            System.out.println("There are two roots: " + firstRoot(firstNumber, secondNumber, discriminant) + " and " + secondRoot(firstNumber, secondNumber, discriminant));
        }
    }

    /**
     * Method returns first root
     *
     * @param a - first coefficient
     * @param b - second coefficient
     * @param discriminant - discriminant
     * @return - returns quadratic factorization
     */
    private double firstRoot(double a, double b, double discriminant) {
        return ((b * -1) + Math.sqrt(discriminant)) / (2 * a);
    }

    /**
     * Method returns second root
     *
     * @param a - first coefficient
     * @param b - second coefficient
     * @param discriminant - discriminant
     * @return - returns quadratic factorization
     */
    private double secondRoot(double a, double b, double discriminant) {
        return ((b * -1) - Math.sqrt(discriminant)) / (2 * a);
    }

    /**
     * Method locking for a discriminant that needs for quadratic equation
     *
     * @param a - first number cant be zero, can be positive or negative
     * @param b - second number can be positive, negative and zero
     * @param c - third number can be positive, negative and zero
     * @return - return discriminant
     */
    private double discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    /**
     *
     * @param input - users string
     * @return - return
     */
    private double askUserNumber(String input) {
        System.out.println(input + " number please");
        String s = readLine();
        if (checkNumberCanBeZero(s)) {
            if (new BigDecimal(s).compareTo(BigDecimal.valueOf(Double.MAX_VALUE)) >= 0) {
                return askUserNumber("Enter valid double");
            }
            return Double.valueOf(s);
        } else {
            return askUserNumber("Enter valid");
        }
    }

    /**
     * Asks user input a number, number cant bee zero
     *
     * @param string - user input
     * @return - return users input
     */
    private double askFirstNumber(String string) {
        System.out.println(string + " number please");
        String s = readLine();
        if (checkNumber(s)) {
            if (new BigDecimal(s).compareTo(BigDecimal.valueOf(Double.MAX_VALUE)) >= 0) {
                return askFirstNumber("Enter valid double");
            }
            return Double.valueOf(s);
        } else {
            return askFirstNumber("Enter valid");
        }
    }

    /**
     * Method checks inputted string can it be a number including zero
     *
     * @param str - input value which need check, is it number or not
     * @return - if input string str can bee number return true, other case - false
     */
    private boolean checkNumberCanBeZero(String str) {
        return str.matches("^([0]?|[-]?[1-9]{1}[0-9]*[\\.]?[0-9]*$)$");
    }

    /**
     * Method checks if inputted string can be a number, number can't be a zero
     *
     * @param str - input value which need check, is it number or not
     * @return - if input string str can bee number return true, other case - false
     */
    private boolean checkNumber(String str) {
        return str.matches("^[-]?[1-9]{1}[0-9]*[\\.]?[0-9]*$");
    }
}
