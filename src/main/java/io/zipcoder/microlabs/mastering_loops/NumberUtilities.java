package io.zipcoder.microlabs.mastering_loops;


import java.util.Arrays;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder evenN = new StringBuilder();

        for (int i = start; i < stop; i++) {
            if ((i % 2) == 0) {
                evenN.append(i);
            }

        }return evenN.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder newStringy = new StringBuilder();

        for (int i = start; i < stop; i++) {
            if ((i % 2) != 0) {
                newStringy.append(i);
            }

        }return newStringy.toString();
        }


        public static String getSquareNumbers ( int start, int stop, int step){
            StringBuilder newSt = new StringBuilder();

            for (int i = start; i < stop; i += step) {
                int squareD = (int) Math.pow(i, 2);
                newSt.append(squareD);
            }
            return newSt.toString();
        }


        public static String getRange ( int start, int stop, int step){
            StringBuilder newArr = new StringBuilder();

            for (int i = start; i < stop; i += step) {
                newArr.append(i);
            }
            return newArr.toString();
        }



    public static String getExponentiationNumbers( int start, int stop, int step, int exponent){
            StringBuilder expoS = new StringBuilder();

            for(int i = start; i < stop; i+= step){
                int powerS = (int) Math.pow(i, exponent);
                expoS.append(powerS);
            }
            return expoS.toString();
        }
    }
