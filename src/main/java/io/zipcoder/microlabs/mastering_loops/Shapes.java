package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){
        String output = "triangle()\n***Output***";

        for(int i = 0; i < 5; i++){
            output += "\n";
            for(int j = 0; j < (i+1); j++){
                output += "*";
            }
        }
        return output;
    }

    public String tableSquare(){
        String output = "tableSquare()\n***Output***";

        for(int i = 1; i <= 4; i++){
            output += "\n|";
            for(int j = 1; j <= 4; j++){
                output += String.format("%3d |", (i*j));
            }
        }
        return output;
    }

    public String tableSquares(int input){
        String output = "tableSquares(" + input + ")\n***Output***";

        for(int row = 1; row <= input; row++){
            output += "\n|";
            for(int col = 1; col <= input; col++){
                int lastIntColumn = col*input;
                String lastStrColumn = "" + lastIntColumn;
                int columnIntWidth = lastStrColumn.length();
                output += String.format("%" + (columnIntWidth + 1) + "d |", (row*col));
            }
        }
        return output;
    }
}