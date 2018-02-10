package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String numList = "";

        for (int i = start; i < stop; i++) {

            if (i % 2 == 0) {

                numList = numList + i;
            }
        }


        return numList;
    }


    public static String getOddNumbers(int start, int stop) {

        String numList = "";

        for (int i = start; i < stop; i++) {

            if (i % 2 != 0) {

                numList = numList + i;
            }
        }
        return numList;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String numList = "";

        for (int i = start; i < stop; i += step) {

            int theLid = (int) Math.pow(i, 2);
            numList += String.valueOf(theLid);

        }

        return numList;
    }


    public static String getRange(int stop) {
        String numList = "";

        for (int i = 0; i < stop; i++)
            numList += String.valueOf(i);

        return numList;
    }



    public static String getRange(int start, int stop) {
        String numList = "";

        for (int i = start; i < stop; i++)
            numList += String.valueOf(i);

        return numList;
    }


    public static String getRange(int start, int stop, int step) {
        String numList = "";

        for (int i = start; i < stop; i+=step)
            numList += String.valueOf(i);

        return numList;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        String numList = "";

        for (int i = start; i < stop; i += step) {

            int theLid = (int) Math.pow(i, exponent);
            numList += String.valueOf(theLid);
        }
        return numList;
    }
}
