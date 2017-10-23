package io.zipcoder.microlabs.mastering_loops;


public class Shapes {
/*In the class Shapes, complete the method called triangle()
so that it uses nested loops to produce the following pattern .
*/
    public String triangle(){
        String output = "triangle()\n*** Output ***";
        for(int x = 1; x<=5; x ++){
            output += "\n";
            for(int y=1; y<=x ;y++)
                output += "*";
        }
        return output;
    }



    public String tableSquare()
    {/*n the class Shapes, complete the method called tableSquare()
        so that it uses nested loops to produce a 4x4 table square.*/
        String output = "tableSquare()\n*** Output ***\nA 4x4 table square";
        for (int x=1; x<=4; x++)
        {
            output += "\n";
            for (int y=1; y<=4; y++)
            {
                output += "| " + String.format("%2d",(x*y)) + " ";
            }
            output += "|";
        }
        return output;
    }


    public String tableSquares(int input){
        String output = "tableSquares(" + input + ")\n***Output***";

        for(int row = 1; row <= input; row++){
            output += "\n|";
            for(int col = 1; col <= input; col++){
                int lastIntColumn = col*input;
                String lastStrColumn = "" + lastIntColumn;
                int columnIntWidth = lastStrColumn.length();
                output += String.format("%" + (columnIntWidth + 1) + "d |", (row*col));
            }
        }
        return output;
    }
}
