package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {
        String evens = "";
        int count = start;
        if((count / 2) != 0) {
            count += 1;
        }
        for(int i = count; i < stop; i+=2) {
            evens = evens + i;
        }
        return evens;
    }


    public static String getOddNumbers(int start, int stop) {
        String odds = "";
        int count = start;
        if((count / 2) == 0) {
            count += 1;
        }
        for(int i = count; i < stop; i+=2) {
            odds += i;
        }
        return odds;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String square = "";
        for(int i = start; i < stop; i+=step) {
            square += (i*i);
        }
        return square;
    }


    public static String getRange(int start, int stop, int step) {
        String xEach = "";
        for(int i = start; i < stop; i+=step){
            xEach += i;
        }
        return xEach;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String expo = "";
        for(int i = start; i< stop; i+=step){
            expo += (int)(Math.pow(i, exponent));
        }
        return expo;
    }
}
