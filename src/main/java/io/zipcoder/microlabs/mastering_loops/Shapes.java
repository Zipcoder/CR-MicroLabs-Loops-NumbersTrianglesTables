package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle()
    {/*In the class Shapes, complete the method called triangle()
        so that it uses nested loops to produce the following
        pattern (see specification document)*/
        String output = "triangle()\n*** Output ***";
        for (int i=1; i<=5; i++)
        {
            output += "\n";
            for (int j=1; j<=i; j++)
                output += "*";
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
