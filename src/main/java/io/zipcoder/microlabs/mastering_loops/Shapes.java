package io.zipcoder.microlabs.mastering_loops;


public class Shapes {
    StringMethods stringMethods = new StringMethods();

    public String triangle(){
        String triangle = "triangle()\n*** Output ***\n";

        for (int rows = 1; rows <= 5; rows++) {
            for (int columns = 1; columns<= rows; columns++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        triangle = triangle.trim();
        return triangle;
    }

    public String tableSquare(){
        String x4table = "tableSquare()\n*** Output ***\nA 4x4 table square\n";

        for (int rows = 1; rows <= 4; rows++) {
            for (int columns = 1; columns <= 4; columns++) {
                x4table += "|" + stringMethods.padleft(rows * columns, 2);
            }
            x4table += "|\n";
        }
        x4table = x4table.trim();
        return x4table;
    }

    public String tableSquares(int n){
        String x6table = "tableSquares(" + n + ")\n*** Output ***\nA " + n + "x" + n + " table square\n";

        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= n; columns++) {
                x6table += "|" + stringMethods.padleft(rows * columns, 2);
            }
            x6table += "|\n";
        }
        x6table = x6table.trim();
        return x6table;
    }
}
