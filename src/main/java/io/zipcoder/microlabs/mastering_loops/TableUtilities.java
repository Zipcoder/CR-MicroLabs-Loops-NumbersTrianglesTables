package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    public static String getSmallMultiplicationTable() {
        String small = "";
        for(int i = 1; i < 6; i++) {
            String multiply = "";
            for (int j = 1; j < 6; j++) {
                int x = j*i;
                multiply += String.format("%3d", x) + " |";
            }
            small += multiply + "\n";
        }
        return small;
    }

    public static String getLargeMultiplicationTable() {
        String large = "";
        for(int i = 1; i < 11; i++) {
            String multiply = "";
            for (int j = 1; j < 11; j++) {
                int x = j * i;
                multiply += String.format("%3d", x) + " |";
            }
            large += multiply + "\n";
        }
        return large;
    }

    public static String getMultiplicationTable(int tableSize) {
        String size = "";
        for(int i = 1; i <= tableSize; i++) {
            String multiply = "";
            for (int j = 1; j <= tableSize; j++) {
                int x = j * i;
                multiply += String.format("%3d", x) + " |";
            }
            size += multiply + "\n";
        }
        return size;
    }
}
