package io.zipcoder.microlabs.mastering_loops;

import java.util.ArrayList;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        StringBuilder evens = new StringBuilder();

        while (start < stop) {
            if (start % 2 == 0){
                evens.append("" + start);
        }
            start++;
        }

        return evens.toString();
    }


    public static String getOddNumbers(int start, int stop) {

        StringBuilder odds = new StringBuilder();

        while (start < stop) {
            if (start % 2 == 1){
                odds.append("" + start);
            }
            start++;
        }

        return odds.toString();

    }


    public static String getSquareNumbers(int start, int stop, int step) {

    StringBuilder sqNums = new StringBuilder();

      for (int i = start; i < stop; i+= step){
          sqNums.append((long)Math.pow(i , 2));
      }

      return sqNums.toString();

    }


    public static String getRange(int start, int stop, int step) {

        StringBuilder range = new StringBuilder();

        for (int i = start; i < stop; i+= step){
            range.append(i);
        }

        return range.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        //int start = 5;
        //int stop = 20;
        //int step = 5;
        //int exponent = 2;

        StringBuilder expo = new StringBuilder();

        for (int i = start; i < stop; i+= step){
            expo.append((long)Math.pow(i , exponent));
        }

        return expo.toString();
    }
}
