package io.zipcoder.microlabs.mastering_loops;


import com.sun.tools.javac.util.StringUtils;

public class Shapes {

    public String triangle(){

        String output = "triangle()\n*** Output ***";

        // OH, by "nested for loops" you meant "substring"
        // I heard someone say that nested for loops are bad

        /*String breakthisstringintopieces = "\n*****";
        output += breakthisstringintopieces.substring(1,1);

        for (int i= 2; i<7; i++){
            output += breakthisstringintopieces.substring(0,i);
        }
        */

        for(int row = 1; row<6; row++){
            output += "\n*";

            for(int col = 1; col<row ; col++){

                output += "*";

            }

        }


        return output;
    }

    public String tableSquare(int n){

        String output = "tableSquares(" + n + ")\n*** Output ***\nA " + n + " x " + n + " table square";

        for(int row = 1; row<5; row++){
            output += "\n|";

            for(int col = 1; col<5 ; col++){

                output +=  String.format("%3d |",col*row);


            }

        }

        return output;
    }

    public String tableSquares(int n){
        String output = "tableSquares(" + n + ")\n*** Output ***\nA " + n + " x " + n + " table square";

        for(int row = 1; row<=n; row++){
            output += "\n|";

            for(int col = 1; col<=n ; col++){

                output +=  String.format("%3d |",col*row);


            }

        }



        return output;
    }
}
