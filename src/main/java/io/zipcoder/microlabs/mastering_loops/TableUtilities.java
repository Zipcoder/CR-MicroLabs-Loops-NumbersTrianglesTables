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
        StringBuilder larTable = new StringBuilder();
        int tableSize = 10;
        int col;// columns of table
        int row; //rows of table
        for (row = 1; row <= tableSize; row++) {
//            smallTable.append(String.format("%3d |", row));
            for (col = 1; col <= tableSize; col++) {
                larTable.append(String.format("%3d |", row * col));
                if (col == tableSize) {
                    larTable.append("\n");
                }
            }
        }

        return larTable.toString();
    }


    public static String getMultiplicationTable(int tableSize) {
        StringBuilder mulTable = new StringBuilder();

        int col;// columns of table
        int row; //rows of table
        for (row = 1; row <= tableSize; row++) {

            for (col = 1; col <= tableSize; col++) {
                mulTable.append(String.format("%3d |", row * col));
                if (col == tableSize) {
                    mulTable.append("\n");
                }
            }
        }

        return mulTable.toString();
    }
    }

