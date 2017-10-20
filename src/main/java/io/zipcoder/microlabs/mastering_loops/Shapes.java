package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){
        String output = "triangle()\n*** Output ***";

        for(int x=0;x<5;x++){
            output += "\n";
            for(int y=0;y <= x;y++ ){
                output += "*";
            }
        }
        return output;
    }

    public String tableSquare(){
        String output = "tableSquare()\n" +
                        "*** Output ***\n" +
                        "A 4 x 4 table square";

        for(int x = 1;x <=4;x++){

            output += "\n|";
            for(int y = 1; y <=4;y++){
                int product = x*y;
                if(y!=1){
                    if(product <10)
                        output += "  "+ product + " |";
                    else {
                        output += " " + product + " |";}
                }else {
                    output += " " + product + " |";
                }
            }
        }

        return output;
    }

    public String tableSquares(int n) {
        String output = "tableSquares(6)\n" +
                "*** Output ***\n" +
                "A 6 x 6 table square";

        for (int x = 1; x <= n; x++) {
            output += "\n|";
            for (int y = 1; y <= n; y++) {
                int product = x * y;
                if (y != 1) {
                    if (product < 10)
                        output += "  " + product + " |";
                    else {
                        output += " " + product + " |";
                    }
                } else {
                    output += " " + product + " " + "|";
                }
            }
        }

        return output;

    }
}
