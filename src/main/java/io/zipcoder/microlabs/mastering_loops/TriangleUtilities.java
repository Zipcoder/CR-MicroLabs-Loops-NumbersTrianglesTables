package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        String getTriangle = "";

        for (int row = 1; row < numberOfRows; row++){

            for (int column = 0; column < row; column++){

                getTriangle += "*";
            }
            getTriangle += "\n";
        }

        return getTriangle;
    }

    public static String getRow(int numberOfStars) {

        String getRow = "";

        for (int row = 0; row < numberOfStars; row++){

            getRow += "*";
        }

        return getRow;
        
    }

    public static String getSmallTriangle() {

        String triangle = "";

        for (int row = 1; row <= 4; row++){

            for (int column = 0; column < row; column++){

                triangle += "*";
            }
            triangle += "\n";
        }

        return triangle;
    }

    public static String getLargeTriangle() {

        String largeTriangle = "";

        for (int row = 1; row <= 9; row++){

            for (int column = 0; column < row; column++){

                largeTriangle += "*";
            }
            largeTriangle += "\n";
        }

        return largeTriangle;
    }
}
