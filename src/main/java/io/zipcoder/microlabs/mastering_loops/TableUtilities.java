package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String myTable = "";

        for (int row =1; row <=5; row++){
            for (int col=1; col<=5; col++){

                int checkSpace = col*row;
                if (checkSpace < 10) {
                    myTable += " " + checkSpace + " | ";
                } else if (checkSpace >= 10){
                    myTable += " " + checkSpace + " | ";
                }


            }
            myTable += "\n";
        }

        return myTable;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
