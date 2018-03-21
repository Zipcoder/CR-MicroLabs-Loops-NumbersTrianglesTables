package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }

    public static String getTriangle(int numberOfRows) {
        int rowNumber = 1;
        StringBuilder builder = new StringBuilder();

        while (rowNumber <= numberOfRows)
        {
            builder.append(getRow(rowNumber));
            rowNumber++;
            builder.append('\n');
        }

        return builder.toString();
    }

    public static String getRow(int numberOfStars) {
        int i = 0;
        StringBuilder builder = new StringBuilder();

        while(i < numberOfStars)
        {
            builder.append('*');
            i++;
        }

        return builder.toString();
    }
}
