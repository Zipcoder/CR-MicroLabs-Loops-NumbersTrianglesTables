package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle() {
        String output = "triangle()\n*** Output ***";
        for (int x = 1; x <= 5; x++) {
            output += "\n";
            for (int i = 1; i <= x; i++) {
                output += "*";
            }
        }

        return output;
    }


    public String tableSquare() {
        String output = "tableSquare()\n*** Output ***\nA 4 x 4 table square";
        String width  =  4 * 4 +"";
        for (int x = 1; x <= 4; x++) {
            output += "\n| " + x + " |";
            for (int i = 2; i <= 4; i++) {
                output += String.format("%" + (width.length() + 1) + "d |", x * i);
            }
        }
        return output;
    }

    public String tableSquares(int n) {
        String output = "tableSquares(" + n + ")\n*** Output ***\nA 6 x 6 table square";
        String width = n * n +"";
        for (int x = 1; x <= n; x++) {
            output += "\n| " + x + " |";
            for (int i = 2; i <= n; i++) {
                output += String.format("%" + (width.length() + 1) +"d |", x * i);
            }
        }
        return output;
    }
}
