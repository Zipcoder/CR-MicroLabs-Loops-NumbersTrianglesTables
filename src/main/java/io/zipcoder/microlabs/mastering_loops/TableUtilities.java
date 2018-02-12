package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return null;
    }


    public static String getLargeMultiplicationTable() {

        StringBuilder theString = new StringBuilder();

        for (int i = 1; i<11; i++) {

            for (int j = 1; j<11; j++) {

                theString.append(String.format("%3d |", i * j));
            }
            theString.append("\n");
        }
        return theString.toString();
    }


    public static String getMultiplicationTable(int tableSize) {

        StringBuilder theString = new StringBuilder();

        for (int i = 1; i <= tableSize; i++) {

            for (int j = 1; j <= tableSize; j++) {

                theString.append(String.format("%3d |", i * j));
            }
            theString.append("\n");
        }
        return theString.toString();

    }
}