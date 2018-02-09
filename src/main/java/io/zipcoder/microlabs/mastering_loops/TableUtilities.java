package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    public static String getSmallMultiplicationTable() {
        String table = getMultiplicationTable(5);
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String largeTable = getMultiplicationTable(10);
        return largeTable;
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder newTable = new StringBuilder();

        for (int i = 1; i <= tableSize; i++) {
            for (int m = 1; m <= tableSize; m++) {
                newTable.append((String.format("%3d |", i * m)) + "");
            }
            newTable.append("" + "\n");
        }
        return newTable.toString();
    }
}
