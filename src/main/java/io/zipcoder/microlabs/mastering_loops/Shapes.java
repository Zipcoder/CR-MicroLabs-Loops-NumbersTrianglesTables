package io.zipcoder.microlabs.mastering_loops;


public class Shapes {
    public String triangle() {
        String output = "***Output***\n";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                output = output + "*"; }
            output = output + "\n"; }
        return output;
    }


    public String tableSquare(){
        String output = "***Output***";
        for (int x = 1; x <= 4; x++){
            output = output + "\n";
            for (int y=1; y<=4; y++)
            {
                output = output + "| " + String.format("%2d",(x*y)) + " ";
            }
            output = output + "|";
        }
        return output;
    }


    public String tableSquares(int n){
        String output = "***Output***";
        for (int x = 1; x <= n; x++){
            output = output + "\n";
            for (int y=1; y<=4; y++)
            {
                output = output + "| " + String.format("%2d",(x*y)) + " ";
            }
            output = output + "|";
        }
        return output;
    }
}
