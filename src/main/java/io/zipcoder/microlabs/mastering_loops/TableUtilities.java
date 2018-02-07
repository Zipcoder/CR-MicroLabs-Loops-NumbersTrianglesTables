package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    //return table 4 by 4
    public static String getSmallMultiplicationTable() {
        StringBuilder smallTable = new StringBuilder();
        int tableSize = 5;
        int col;// columns of table
        int row; //rows of table
        for (row = 1; row <= tableSize; row++) {
//            smallTable.append(String.format("%3d |", row));
            for (col = 1; col <= tableSize; col++) {
                smallTable.append(String.format("%3d |", row * col));
                if (col == tableSize) {
                    smallTable.append("\n");
                }
            }
        }

        return smallTable.toString();
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
