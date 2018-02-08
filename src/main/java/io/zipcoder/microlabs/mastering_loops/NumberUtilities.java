package io.zipcoder.microlabs.mastering_loops;

// Given two integers, start, and stop, return a String
// concatenation of all even integers between start up to and not including stop.
public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
      StringBuilder evenNum = new StringBuilder();

        for(int i = start; i < stop; i++){
          //check to see if number is even

            if (i % 2 == 0){
                evenNum.append(i);
            }
      }
        return evenNum.toString();
    }



    public static String getOddNumbers(int start, int stop) {
        StringBuilder oddNum = new StringBuilder();

        for(int i = start; i < stop; i++){
            //odds
           if(i == 1 || i == 3){
               oddNum.append(i);
           }
            //check to see if number is odd
               if (i % 2 != 0){
                oddNum.append(i);
            }
        }
        return oddNum.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
         StringBuilder squareNum = new StringBuilder();
        for(int i = start; i < stop; i += step) {
           int s = (int) Math.pow(i,2);
            squareNum.append(s);
        }
        //how else can I use a toString();
        return squareNum.toString();
    }

//Given an integer, stop, return a String concatenation
// of all integers between 0 up to and not including stop.
    public static String getRange(int start, int stop, int step) {
        StringBuilder num = new StringBuilder();

        for(int i = start; i < stop; i++) {
            num.append(i);
        }
        return num.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder num = new StringBuilder();

        for(int i = start; i < stop; i += step) {
            int s = (int) Math.pow(i, exponent);
            num.append(s);
        }
        return num.toString();


    }
}
