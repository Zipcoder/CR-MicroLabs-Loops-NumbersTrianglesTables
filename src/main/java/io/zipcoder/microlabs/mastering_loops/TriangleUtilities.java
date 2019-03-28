package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {


    public static String getRow(int numberOfStars) {
        StringBuilder aster = new StringBuilder();
        int counter = 0;
        while(counter < numberOfStars) {
            aster.append("*");
            counter++;
        }
        return aster.toString();
    }

    public static String getTriangle(int numberOfRows) {
        StringBuilder builder = new StringBuilder();
        for(int i = 1; i<=numberOfRows; i++){
            builder.append(getRow(i))
                    .append("\n");
        }
        return builder.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
