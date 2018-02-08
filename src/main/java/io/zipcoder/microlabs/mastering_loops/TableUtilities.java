package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder matrix = new StringBuilder();

        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= 5; col++){
                matrix.append(String.format("%3d |", row * col));
            }
            matrix.append("\n");
        }
        return matrix.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder matrix = new StringBuilder();

        for(int row = 1; row <= 10; row++) {
            for(int col = 1; col <= 10; col++){
                matrix.append(String.format("%3d |", row * col));
            }
            matrix.append("\n");
        }
        return matrix.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder matrix = new StringBuilder();

        for(int row = 1; row <= tableSize; row++) {
            for(int col = 1; col <= tableSize; col++){
                matrix.append(String.format("%3d |", row * col));
            }
            matrix.append("\n");
        }
        return matrix.toString();
    }
}


