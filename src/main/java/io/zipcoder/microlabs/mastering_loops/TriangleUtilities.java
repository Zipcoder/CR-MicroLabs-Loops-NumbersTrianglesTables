package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

            String newTriangle = "*\n";
            String newLine= "*";
            int counter = 1;

            while(counter < numberOfRows - 1){
                 newLine += "*";
                 newTriangle += newLine + "\n";
                 counter++;
          }
         return newTriangle;
    }

    public static String getRow(int numberOfStars) {

            String star = "";
            int counter = 1;

            while(counter <= numberOfStars) {
                star = star + "*";
                counter++;
        }
        return star;
    }

    public static String getSmallTriangle() {

        String newTriangle = "*\n";
        String newLine = "*";
        int counter = 1;

        while(counter < 4){
            newLine += "*";
            newTriangle += newLine + "\n";
            counter++;
        }
        return newTriangle;
    }

    public static String getLargeTriangle() {

            String newTriangle = "*\n";
            String newLine = "*";
            int counter = 1;

            while(counter < 9){
                newLine += "*";
                newTriangle += newLine + "\n";
                counter++;
        }
        return newTriangle;
    }
}

// woo!