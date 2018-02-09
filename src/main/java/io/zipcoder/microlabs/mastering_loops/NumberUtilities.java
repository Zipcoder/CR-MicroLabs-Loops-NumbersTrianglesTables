package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder evens = new StringBuilder();
        for (int i = start; i <stop; i++) {
            if (i % 2 == 0) {
                evens.append(i);
            }
        }

        return evens.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        return null;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
