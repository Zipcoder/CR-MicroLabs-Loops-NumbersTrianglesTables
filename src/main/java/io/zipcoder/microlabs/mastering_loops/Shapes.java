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

                String cellToFormat = Integer.toString(rows * columns);
                String paddedCell = stringMethods.padLeft(cellToFormat, 2, 2);
                x4table += "|" + paddedCell;
            }
            x4table += "|\n";
        }
        x4table = x4table.trim();
        return x4table;
    }

    public String tableSquares(int n){
        /*: spacesToPad must be >= the number of digits in n^2
            looking for ways to fix this
        */

        String x6table = "tableSquares(" + n + ")\n*** Output ***\nA " + n + "x" + n + " table square\n";

        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= n; columns++) {

                String cellToFormat = Integer.toString(rows * columns);
                int digitsInMaxCell = Integer.toString(n*n).length();
                String paddedCell = stringMethods.padLeftAndRight(cellToFormat, 2, 1, digitsInMaxCell);

                if (paddedCell == null) {
                    return "spacesToPadLeft must be >= digitsInMaxCell(" + digitsInMaxCell + "). Change arguments.";
                }

                x6table += "|" + paddedCell;
            }
            x6table += "|\n";
        }
        x6table = x6table.trim();
        return x6table;
    }
}
