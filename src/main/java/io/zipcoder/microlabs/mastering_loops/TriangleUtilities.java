package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder triangle = new StringBuilder();
        for(int i = 1; i < numberOfRows; i++) {
            for(int j = 0; j < i; j++){
                triangle.append("*");
            }
            triangle.append("\n");
        }
        return triangle.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder rowOfStars = new StringBuilder();
        for(int i = 0; i < numberOfStars; i++){
           rowOfStars.append("*");
        }
        return rowOfStars.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder triangle = new StringBuilder();
        for(int i = 1; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                triangle.append("*");
            }
            triangle.append("\n");
        }
        return triangle.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder triangle = new StringBuilder();
        for(int i = 1; i < 10; i++) {
            for(int j = 0; j < i; j++) {
                triangle.append("*");
            }
            triangle.append("\n");
        }
        return triangle.toString();
    }
}
