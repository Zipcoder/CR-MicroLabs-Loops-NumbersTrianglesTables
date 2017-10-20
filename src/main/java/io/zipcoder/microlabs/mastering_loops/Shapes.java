package io.zipcoder.microlabs.mastering_loops;


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
        return "";
    }

    public String tableSquares(int n){
        return "";
    }
}
