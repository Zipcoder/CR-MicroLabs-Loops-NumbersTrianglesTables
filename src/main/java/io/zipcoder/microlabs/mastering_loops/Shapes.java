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

    public String tableSquare()
    {/*n the class Shapes, complete the method called tableSquare()
        so that it uses nested loops to produce a 4x4 table square.*/
        String output = "tableSquare()\n*** Output ***\nA 4x4 table square";
        for (int i=1; i<=4; i++)
        {
            output += "\n";
            for (int j=1; j<=4; j++)
            {

                output += "| " + String.format("%2d",(i*j)) + " ";
            }
            output += "|";
        }
        return output;
    }

    public String tableSquares(int n)
    {/*In the class Shapes, extend your answer to the last question
        produce a method that will return string of characters out og
        n x n table square.*/
        String output = "tableSquares("+n+")\n*** Output ***\nA "+n+"x"+n+" table square";
        int fieldWidth;
        String fieldWidthAsString;
        for (int i=1; i<=n; i++)//col
        {
            output += "\n" + "|" ;
            for (int j=1; j<=n; j++)//row
            {
                fieldWidthAsString = "" + j*n;
                fieldWidth = fieldWidthAsString.length() + 1;
                output += String.format("%"+fieldWidth+"d",(i*j)) + " " + "|";
            }

        }
        return output;
    }
}
