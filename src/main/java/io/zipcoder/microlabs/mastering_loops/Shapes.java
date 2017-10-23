package io.zipcoder.microlabs.mastering_loops;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Shapes {

    public String triangle(){
        //output pattern is triangle
        //pattern is for every increment the * will increment 1
        String output = "triangle()\n*** Output ***";
        for(int level = 1; level<=5;level++){
            String ast ="";
            for(int block = 0; block<level;block++){
                ast += "*";
            }
            output += "\n" +ast;
        }
//        String ast ="";
//        for(int i=0;i<5;i++){
//            ast+= "*";
//            output += "\n"+ ast;
//        }
        return output;
    }

    public String tableSquare(){
        //produce a 4X4 square
        //4 columns(blocks) and 4 rows(levels)
        //each iteration the strings increment by the number of limits
        String output = "tablesSquare()\n*** Output ***\nA 4 x 4 table square\n";

        for(int level = 1;level<=4;level++){

            for(int block = 1; block<=4;block++){
                if(level*block>10)
                    output += "| " + String.format("%1d",(level *block))+ " ";
                else{
                    output += "| " + String.format("%2d", (level * block))+" ";
                }

            }
            output +="|\n";
        }
        return output;
    }

    public String tableSquares(int n){
        String output = "tablesSquare(6)\n*** Output ***\nA 6 x 6 table square\n";
        for(int level =1; level<= n; level++){
            for(int block= 1; block<= n; block++){
                if(level*block>10){
                    output += "| " + String.format("%1d",(level*block))+" ";
                }
                else{
                    output += "| "+ String.format("%2d",(level*block))+" ";
                }
            }
            output += "|\n";
        }
        return output;
    }

//    public static void main(String[] args) {
//        Shapes shapes = new Shapes();
//        String string = shapes.tableSquare();
//        System.out.println(string);
//
//    }
}
