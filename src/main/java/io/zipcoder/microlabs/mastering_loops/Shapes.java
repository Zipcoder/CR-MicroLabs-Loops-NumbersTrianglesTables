package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle() {

        String output = "triangle()\n*** Output ***";

        for(int i = 1; i < 6; i++) {
            output += "\n";
            for(int j = 0; j < i; j++) {
                output += "*";
            }
        }

        return output;
    }

    public String tableSquare(){

        String output = "tableSquare()\n*** Output ***\nA 4x4 table square";

        for(int i = 1; i <= 4; i++) {
            output += "\n|";
            int count = i;
            for(int j = 0; j < 4; j++) {
                output += " " + count + " |";
                count += i;
            }
        }

        return output;
    }

    public String tableSquares(int n){

        String output = "tableSquares()\n*** Output ***\nA 6x6 table square";

        for(int i = 1; i < (n + 1); i++) {
            output += "\n|";
            int count = i;
            for(int j = 0; j < n; j++) {
                output += " " + count + " |";
                count += i;
            }
        }

        return output;
    }
}