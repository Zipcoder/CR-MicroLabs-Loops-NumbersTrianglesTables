package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder myString = new StringBuilder();

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                myString.append(i*j + " | ");

            }

            myString.append("\n");

        }

        return myString.toString();

    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
