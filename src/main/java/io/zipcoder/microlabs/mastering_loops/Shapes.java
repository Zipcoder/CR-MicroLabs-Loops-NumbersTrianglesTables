package io.zipcoder.microlabs.mastering_loops;

public class Shapes {

    public String triangle() {
        String output = "triangle()\n*** Output ***";
        int rows = 4;

        for (int i = 0; i <= rows; i++) {
            String star = "";
            for (int j = 0; j <= i; j++) {
                star += "*";
            }
            output += "\n" + star;
        }
        return output;
    }


    public String tableSquare() {
        String output = "tableSquare()\n*** Output ***\nA 4x4 table square\n|";

        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 4; col++) {
                output += row * col + "|";
            }
            if (row < 4){
            output += "\n" + "|";
            }
        }
        return output;
    }


    public String tableSquares(int n){
      //  System.out.println("");

        String output = "tableSquares(6)\n*** Output ***\nA 6x6 table square\n|";

        for (int i = 1; i <= n; i++){
            for (int col = 1; col <= n; col++){
                int table = i * col;
                output += table + "|";
            }
            if (i<n){
            output += "\n" + "|";
            }
        }
        return output;
    }
}
