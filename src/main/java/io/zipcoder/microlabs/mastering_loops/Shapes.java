package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){
        String output = "triangle()\n*** Output ***";
        int lines = 6;
        for (int t =1; t < lines; t++){
            String star = "";
           for (int i=0; i<t; i++) {
               star +="*";
                          }
            output += "\n" + star;
        }
        return output;
    }

    public String tableSquare(){
        String output = "###Example\ntableSquare()\n*** Output ***\nA 4 x 4 table square";
        for (int l =1; l <5; l++){
            int newNum = 0;
                output += "\n";
                for (int cnt =0; cnt < 4; cnt++){
                    newNum = newNum + l;
                    if( cnt < 1 ) { // create rows
                        output +=  "| " + newNum ;
                    } else if( newNum <10) {
                        output +=  " |  " + newNum ;
                    } else {
                        output +=  " | " + newNum ;
                    }
            }
            output +=  " |";
        }
        return output;
    }

    public String tableSquares(int n){
        String output = "###Example\ntableSquares(6)\n*** Output ***\nA 6 x 6 table square";
       for (int l =1; l <=n; l++){
           output += "\n";
            for (int cnt =1; cnt <= n; cnt++){ //create columns
                if( cnt <= 1 ) { // build row
                    output += String.format("|%2d " , l * cnt);
                  } else {
                    output += String.format("| %2d ", l * cnt);
                }
            }
            output +=  "|";
        }
        return output;
    }
}
