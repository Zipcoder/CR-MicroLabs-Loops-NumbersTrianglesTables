package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){
        String output = "triangle()\n*** Output ***";
        String star = "*";
        for (int row = 0; row < 5; row++) {
            output += "\n" + star;
            for (int column = 0; column < row; column++) {
                output += star;
            }
         }
        return output;
    }

    public String tableSquare(){
        String output = "tableSquare()\n*** Output ***";
        for (int row = 1; row <= 4; row++) {
            output += "\n|"; //+ "row";
            for (int column = 1; column <= 4; column++) {
                output += String.format("%3d |", column*row);
            }
        }

        return output;
    }

    public String tableSquares(int n){
        String output = "tableSquares(6)\n*** Output ***";
        for (int row = 1; row <= n; row++) {
            output += "\n|"; //+ "row";
            for (int column = 1; column <= n; column++) {
                output += String.format("%3d |", column * row);
            }
        }
        return output;
    }
}
