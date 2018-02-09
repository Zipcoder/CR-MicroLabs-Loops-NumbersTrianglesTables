package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder myTri = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                myTri.append("*");
            }
                myTri.append("\n");
        }

        return myTri.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder newRow = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++){
            newRow.append("*");
        }
        return newRow.toString();
    }

    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
