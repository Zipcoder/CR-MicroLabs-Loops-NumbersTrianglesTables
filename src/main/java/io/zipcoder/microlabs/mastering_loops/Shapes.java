package io.zipcoder.microlabs.mastering_loops;
import java.util.*;


public class Shapes {

    public String triangle(){

        String star = "*";
        String newLine = "\n";
        String output = "*** Output ***";
        int length = 5;

        for (int i = 1;i <= length; i++){
            String stars = "";
            for(int j = 1; j <= i; j++){
                stars += star;
            }
            output += newLine + stars;
        }

        return output;
    }

    public String tableSquare(){

        int tableSizeOne = 4;
        String output = "*** Output ***\nA 4x4 table square";

        for(int i=1; i<=tableSizeOne; i++){
            int num = i;
            output += "\n" + String.format("|%2d", num);
            for(int j=1; j<=tableSizeOne -1; j++){
               num += i;
               output +=  String.format(" |%3d", num);
            }
            output += " |";
        }

        return output;
    }

    public String tableSquares(int n){

        String output = "*** Output ***\nA 6x6 table square()";

        for(int i=1; i<=n; i++){
            int num = i;
            output += "\n" + String.format("|%2d" , num);
            for(int j=1; j<=n -1; j++) {
                num += i;
                    output += String.format(" |%3d", num);
            }
            output += " |";
            }

        return output;
    }
}
