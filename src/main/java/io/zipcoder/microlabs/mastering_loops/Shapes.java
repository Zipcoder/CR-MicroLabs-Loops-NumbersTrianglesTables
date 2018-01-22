package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle() {
        //"triangle\n*** Output ***\n*\n**\n***\n****\n*****";
        String triangle = "triangle\n*** Output ***";
        int rows = 5;
        for (int i = 0; i <= rows; i++) {
            for (int k = 0; k < i; k++) {
                triangle += "*";
            }
            if (i < rows) {
                triangle += "\n";
            }
        }
        return triangle;
    }

    public String tableSquare() {
        //"tableSquare\n*** Output ***\nA 4 x 4 table square\n|1|2|3|4|\n" +
        //      "                                             |2|4|6|8|\n" +
        //    "                                               |3|6|9|12|\n" +
        //  "                                                 |4|8|12|16|"
        String Square = "tableSquare()\n*** Output ***\nA 4 x 4 table square\n";
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            Square += "|";
            for (int k = 1; k <= rows; k++) {
                int cellNumber = i*k;
                Square += String.format("%3d |", cellNumber);
            }
            if (i < rows) {
                Square += "\n";
            }
        }
        return Square;
    }


    public String tableSquares(int n){

        String Square = "ableSquare("+n+")\n*** Output ***\nA " + n + " x " + n + " table square\n";
        int userIn = n;
        for (int row = 1; row <= userIn; row++) {
            for (int col = 1; col <= userIn; col++) {
                Square += "|";
                int number = row * col;
                String theDigit = Integer.toString(number);
                int padsTocell = theDigit.length()+ 1;
                Square += FormatingMethods.paddingLeftandRight(1, 2 , theDigit);
            }
            if (row < userIn) {
                Square += "|\n";
            }
        }
        Square += "|";
        return Square;
    }
}
