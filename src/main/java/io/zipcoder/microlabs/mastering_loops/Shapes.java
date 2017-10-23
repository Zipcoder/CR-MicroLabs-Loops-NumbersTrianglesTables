package io.zipcoder.microlabs.mastering_loops;


public class Shapes {



    public String triangle() {

        String output = "*** Output ***\nTriangle";

        int lines =6;
        for (int i =0; i<5; i++){
            String star = "";
        for (int k=0; k <= i; k++) {
                star += "*";
            }
            output += "\n" + star;
        }
            return output;
        }

    public String tableSquare() {
        String output = "*** Output ***\ntableSquare()";

        for (int l = 1; l < 5; l++) {
            int newNum = 0;
            output += "\n";
            for (int cnt = 0; cnt < 4; cnt++) {
                newNum = newNum + l;
                output += "|" + newNum;

            }      output += "|";

                }
                return output;
            }

    public String tableSquares(int n) {
        String input = "*** Output ***\ntableSquare()";

        for(int i = 1; i <=6; i++){
            input += "\n|";

            for ( int j = 1; j<=6; j++){
                if (j * i < 10 && j == 1)
                input = String.format("%s%d|", input, j*i);
                else if (j * i < 10)
                    input = String.format("%s%d|", input, j*i);
                else
                    input = String.format("%s%d|", input, j*i);

            }
        }

        return input;
    }
















}
