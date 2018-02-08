package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder builder = new StringBuilder();
        for (int row = 1; row < numberOfRows; row++) {
            for (int col = 0; col < row; col++) {
                builder.append("*");
            }
            builder.append("\n");
        }

        return builder.toString();

    }

    public static String getRow(int numberOfStars) {
        String asterisk = "";
        for (int i = 0; i < numberOfStars; i++) {
            asterisk += "*";
        }
        return asterisk;
    }

    public static String getSmallTriangle() {
        StringBuilder builder = new StringBuilder();
        for (int row = 1; row <= 4; row++) {
            for (int col = 0; col < row; col++) {
                builder.append("*");
            }
            builder.append("\n");
        }

        return builder.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder builder = new StringBuilder();
        for (int row = 1; row <= 9; row++) {
            for (int col = 0; col < row; col++) {
                builder.append("*");
            }
            builder.append("\n");
        }

        return builder.toString();
    }
}
