package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("triangle()\n*** Output ***\n");


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString().trim();

    }


    public String tableSquare() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tableSquare(6)\n*** Output ***\nA 4 x 4 table square\n");

        for (int i = 1; i <= 4; i++) {
            stringBuilder.append("|");

            for (int j = 1; j <= 4; j++) {
                if (i * j < 10)
                    stringBuilder.append(" ");
                stringBuilder.append(j * i);
                stringBuilder.append(" | ");
            }

            stringBuilder.append("\n");

            stringBuilder.toString().trim();

        }
        return stringBuilder.toString().trim();


    }

    public String tableSquares(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tableSquares(6)\n*** Output ***\nA 6 x 6 table square\n");

        for (int i = 1; i <= 6; i++) {
            stringBuilder.append("|");
            for (int j = 1; j <= 6; j++) {
                if (i * j < 10 && j!=1)
                    stringBuilder.append(" ");
                stringBuilder.append(" ");
                stringBuilder.append(j * i);
                stringBuilder.append(" ");
                stringBuilder.append("|");

                stringBuilder.toString().trim();

            }

            stringBuilder.append("\n");

        }
        return stringBuilder.toString().trim();
    }
}
