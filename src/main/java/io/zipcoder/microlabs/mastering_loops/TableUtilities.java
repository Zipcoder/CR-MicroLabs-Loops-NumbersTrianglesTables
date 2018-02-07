package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for(int i = 1; i < 6; ++i) {
            for(int j = 1; j < 6; ++j) {
                String row = String.format("%3d |", i * j);
                table.append(row);
            }
            table.append("\n");
        }
        return table.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for(int i = 1; i < 11; ++i){
            for(int j = 1; j < 11; ++j){
                String row = String.format("%3d |", i * j);
                table.append(row);
            }
            table.append("\n");
        }
        return table.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for(int i = 1; i < tableSize + 1; ++i) {
            for(int j = 1; j < tableSize + 1; ++j) {
                String row = String.format("%3d |", i * j);
                table.append(row);
            }
            table.append("\n");
        }
        return table.toString();
    }
}
