package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle() {

        String output = "triangle()\n*** Output ***\n";

        for (int i = 1; i < 6; i++) {

            for (int x = 1; x < i; i++) {

            }

            output += i;

        }

        return output;
    }

    public String tableSquare() {

        String output = "square()\n*** Output ***\nA 4 x 4 table square\n";

        for (int i = 1; i <= 4; i++) {

            output += "|";

            for (int x = 1; x <= 4; x++) {

                output += String.format("%3d |", i * x);

            }

            output += "\n";

        }

        return output;

    }

    public String tableSquares(int n) {

        String output = "squares()\n*** Output ***\nA n x n table square\n";

        for (int i = 1; i <= n; i++) {

            output += "|";

            for (int x = 1; x <= n; x++) {

                output += String.format("%3d |", i * x);

            }

            output += "\n";

        }

        return output;

    }

}



