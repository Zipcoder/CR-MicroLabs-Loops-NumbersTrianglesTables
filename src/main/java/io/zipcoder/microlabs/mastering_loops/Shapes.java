package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){
        String output = "triangle()\n*** Output ***";
        for(int i = 1;i<=5;i++){
            output += "\n";
            for(int j = 1;j<=i;j++){
                output+="*";
            }

        }

        return output;
    }

    public String tableSquare(){
        String output = "tableSquare()\n*** Output ***";
        for(int i = 1;i<=4;i++){
            output += "\n|";
            for(int j = 1;j<=4;j++){
                int num = i*j;
                if(j!=1) {
                    if (num > 10) {
                        output += " " + num + " |";
                    } else {
                        output += "  " + num + " |";
                    }
                }else{
                    output += " " + num + " |";
                }
            }

        }

        return output;
    }

    public String tableSquares(int n){
        String output ="tableSquares(6)\n*** Output ***";

        for(int i = 1;i<=n;i++){
            output += "\n|";
            for(int j = 1;j<=n;j++){
                int num = i*j;
                if(j !=1) {
                    if (num < 10) {
                        output += "  " + num + " |";
                    } else {
                        output += " " + num + " |";
                    }
                }else{
                    output += " " + num + " |";
                }
            }
        }


        return output;

    }
}
