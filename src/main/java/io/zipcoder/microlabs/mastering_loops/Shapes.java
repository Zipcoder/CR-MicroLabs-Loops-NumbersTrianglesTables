package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle() {
        String output = ("*** Output ***\ntriangle()");
        for (int row=1; row<=5; row++) {
            output += "\n";
            for (int col=1; col<=row; col++) {
                output += "*";
            }
        }
        return output;
    }

    public String tableSquare() {
        String output = "*** Output ***\nA 4x4 table square";
        for (int i=1; i<=4; i++) {
            output += "\n" + "| " +i+ " |";
            for(int j=2; j<=4 ; j++) {
                    output += String.format("%3d |", (i * j));
            }
        }
        return output;
    }

    public String tableSquares(int n) {
        String output = "*** Output ***\nA nxn Table Square";
        for (int i=1; i<=n; i++) {
            output += "\n|" + String.format(("%" + ((n + "").length()+1)) + "d |", i);
            for(int j=2; j<=n ; j++) {
                int product = (n*n); //last possible space in array
                String result = product + "";
                output+= String.format("%" + (result.length()+1) + "d |", (i*j));
                //need the product as a string
                //get the length of the string
                //this gets put into our formatter to adjust the size
            }
        }
        return output;
    }
}
