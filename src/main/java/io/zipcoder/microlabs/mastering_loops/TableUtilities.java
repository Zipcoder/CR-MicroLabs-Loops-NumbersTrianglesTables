package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    public String getSmallMultiplicationTable() {

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

    public String getLargeMultiplicationTable() {

        String bigguy = "";
        for(int i = 1; i < 11; i++) {
            String grow = "";
            for (int a = 1; a < 11; a++) {
                int b = a * i;
                grow += String.format("%3d", b) + " |";
            }
            bigguy += grow + "\n";
        }
        return bigguy;
    }

    public String getMultiplicationTable(int tableSize) {

        String ultraguy = "";
        for (int i = 1; i < 21; i++) {
            String grow = "";
            for (int a = 1; a < 21; a++) {
                int b = a * i;
                grow += String.format("%3d", b) + " |";
            }
            ultraguy += grow + "\n";
        }

            return ultraguy;
        }
    }
