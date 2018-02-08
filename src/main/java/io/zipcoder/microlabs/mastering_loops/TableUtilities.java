package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder getSmol = new StringBuilder();

        for (int r = 1; r <= 5; r++){

            for(int c = 1; c <= 5; c++){

                getSmol.append(String.format("%3d |", r*c));

            }

            getSmol.append("\n");
        }

        return getSmol.toString();
    }

    public static String getLargeMultiplicationTable() {

        StringBuilder getBig = new StringBuilder();

        for (int r = 1; r <= 10; r++){

            for(int c = 1; c <= 10; c++){

                getBig.append(String.format("%3d |", r*c));

            }

            getBig.append("\n");
        }

        return getBig.toString();
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder getSmol = new StringBuilder();

        for (int r = 1; r <= tableSize; r++){

            for(int c = 1; c <= tableSize; c++){

                getSmol.append(String.format("%3d |", r*c));

            }

            getSmol.append("\n");
        }

        return getSmol.toString();
    }
}
