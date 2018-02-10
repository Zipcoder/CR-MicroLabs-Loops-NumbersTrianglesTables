package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    public static String getSmallMultiplicationTable() {

        String lilguy = "";
            for(int i = 1; i < 6; i++) {
                String grow = "";
                for (int a = 1; a < 6; a++) {
                    int b = a * i;
                        grow += String.format("%3d", b) + " |";
                    }
                lilguy += grow + "\n";
            }
        return lilguy;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
