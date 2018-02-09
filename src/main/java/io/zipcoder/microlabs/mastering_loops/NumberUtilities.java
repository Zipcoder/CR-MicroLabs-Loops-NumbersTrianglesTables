package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        return getRange(start + (start % 2), stop, 2);
    }

/* //Kris wrote this, look at it later
    public static String getEvenNumbersk(int start, int stop) { //
        for ({String s = ""; int i=start;}; i < stop;i++) s = s + ((i % 2 == 0) ? i  : "");
        return s;
    }
*/

    public static String getOddNumbers(int start, int stop) {
        return getRange((start % 2 != 0) ? start : start+1, stop, 2);
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }

    public static String getPerfectSquares(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i=start;i<stop;i++) {
            if (Math.round(Math.sqrt(i)) == Math.sqrt(i)) { //if the number is the same after round() its a perfect square
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }

    public static String getRange(int start, int stop, int step) {
       StringBuilder sb = new StringBuilder();
       for (int i=start;i<stop;i+=step) {
           sb.append(i);
       }
       return sb.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();
        for (int i = start;i<stop;i+=step) {
            sb.append((int)Math.pow(i, exponent));
        }
        return sb.toString();
    }
}
