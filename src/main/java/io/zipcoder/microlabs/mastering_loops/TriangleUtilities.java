package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder Tree = new StringBuilder();

        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                Tree.append("*");
            }
            Tree.append("\n");
        }

        return Tree.toString();

    }

    public static String getRow(int numberOfStars) {

        StringBuilder row = new StringBuilder();

        for (int i = 1; i <= numberOfStars; i++ ){
            row.append("*");
        }

        return row.toString();
    }

    public static String getSmallTriangle() {

        StringBuilder smallTree = new StringBuilder();

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                smallTree.append("*");
            }
            smallTree.append("\n");
        }

        return smallTree.toString();
    }

    public static String getLargeTriangle() {

        StringBuilder largeTree = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                largeTree.append("*");
            }
            largeTree.append("\n");
        }

        return largeTree.toString();
    }
}
