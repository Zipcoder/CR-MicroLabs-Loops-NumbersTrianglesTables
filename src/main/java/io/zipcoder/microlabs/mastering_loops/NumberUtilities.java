package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {
        if(start%2 != 0)  start += 1;
        return getRange(start,stop,2);
    }

    public static String getOddNumbers(int start, int stop) {
        if(start %2 == 0) start += 1;
        return getRange(start,stop,2);
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder square = new StringBuilder();
        for(int i = start; i < stop; i+=step) square.append(i*i);
        return square.toString();
    }

    public static String getRange(int start, int stop, int step) {
        StringBuilder xEach = new StringBuilder();
        for(int i = start; i < stop; i+=step) xEach.append(i);
        return xEach.toString();
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder expo = new StringBuilder();
        for(int i = start; i< stop; i+=step){
            expo.append((int)(Math.pow(i, exponent)));
        }
        return expo.toString();
    }

    public static void main(String[] args){

    }
}
