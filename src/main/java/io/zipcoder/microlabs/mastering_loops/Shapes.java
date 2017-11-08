package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){
        String output = "triangle()\n*** Output ***";
        int rows = 4;

        for(int i = 0; i <= rows; i++){

            String dots = "";
            for (int r = 0; r <= i; r++){

                dots += "*";
            }output += "\n" + dots;
        }


        return output;
    }

    public String tableSquare(){
        return "";
    }

    public String tableSquares(int n){
        return "";
    }
}
