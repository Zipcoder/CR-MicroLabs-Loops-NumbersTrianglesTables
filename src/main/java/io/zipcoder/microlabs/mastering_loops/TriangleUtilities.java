package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        String triangleContainer = "";
        for (int row=1; row < numberOfRows; row++)
        {
            for (int column=0; column<row; column++)
            {
               triangleContainer += "*";
            }
            triangleContainer += "\n";
        }
        return triangleContainer;
    }

    public static String getRow(int numberOfStars) {

        String triangleContainer = "";
        for (int row=0; row < 20; row++)
        {
            triangleContainer += "*";
        }
        return triangleContainer;
    }

    public static String getSmallTriangle() {

        String triangleContainer = "";
        for (int row=1; row < 5; row++)
        {
            for (int column=0; column<row; column++)
            {
                triangleContainer += "*";
            }
            triangleContainer += "\n";
        }
        return triangleContainer;
    }

    public static String getLargeTriangle() {

        String triangleContainer = "";
        for (int row=1; row < 10; row++)
        {
            for (int column=0; column<row; column++)
            {
                triangleContainer += "*";
            }
            triangleContainer += "\n";
        }
        return triangleContainer;
    }
}
