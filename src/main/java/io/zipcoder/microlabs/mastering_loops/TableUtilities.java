package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder tree = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                tree.append(String.format("%3d |", (i*j)));

            }
            tree.append("\n");
        }
        return tree.toString();

    }

    public static String getLargeMultiplicationTable() {

        StringBuilder tree = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                tree.append(String.format("%3d |", (i*j)));

            }
            tree.append("\n");
        }
        return tree.toString();
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder tree = new StringBuilder();

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                tree.append(String.format("%3d |", (i*j)));

            }
            tree.append("\n");
        }
        return tree.toString();
    }
}
