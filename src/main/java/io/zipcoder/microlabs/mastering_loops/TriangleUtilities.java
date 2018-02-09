package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder newTri = new StringBuilder();

        for (int i = 1; i < numberOfRows; i++) {
            for (int m = 0; m < i; m++) {
                newTri.append("*");
            }
            newTri.append("\n");
        }
        return newTri.toString();
    }

    public static String getRow(int numberOfStars) {
        String newRow = "";
        for (int i = 0; i < numberOfStars; i++) {
            newRow += "*";
        }
        return newRow;
    }

    public static String getSmallTriangle() {
        StringBuilder smallTri = new StringBuilder();
        for (int i = 1; i <= 4; i++) {
            for (int m = 0; m < i; m++) {
                smallTri.append("*");
            }
            smallTri.append("\n");
        }
        return smallTri.toString();
    }


        public static String getLargeTriangle () {
            StringBuilder largeTri = new StringBuilder();
            for(int i = 1; i <= 9; i++){
                for(int m = 0; m < i; m++){
                    largeTri.append("*");
                }
                largeTri.append("\n");
            }
            return largeTri.toString();
        }
    }

