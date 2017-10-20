package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public static String triangle() {

        String output = "triangle()\n*** Output ***";
        String starCount = "";

        for (int i = 1; i < 6; i++) {

            starCount += "\n";

            for (int x = 0; x < i; x++) {

                starCount += "*";

            }

        }

        output += starCount;

        return output;
    }

    public static String tableSquare() {
        String output = "tableSquare()\n*** Output ***\n";

        for (int i = 1; i <= 4; i++){

            if(i > 1) {
                output += " \n";
            }

            for (int x = 1; x < 5; x++){

                if(x < 10) {
                    output += "| " + (x * i) + " ";
                }

                if(x > 3){
                    output += "|";
                }
            }
        }

        return output;
    }

    public static String tableSquares(int n) {
    String output = "";
    int product;

    for (int i = 1; i <= n; i++){

        for (int x = 1; x <= n; x++){
            product = (x * i);

                if (product < 10){
                    output += "|  " + (x * i) + " ";
                }

                else {
                    output += "| " + (x * i) + " ";
                }

                if (x == n){

                    output += "|" + "\n";
                }

            }
        }

        return output;
    }
}
