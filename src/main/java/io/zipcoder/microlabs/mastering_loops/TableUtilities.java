package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        int value = 5;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= value; i++) {
            sb.append(String.format("%3d_|", i));
        }

        return null;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
