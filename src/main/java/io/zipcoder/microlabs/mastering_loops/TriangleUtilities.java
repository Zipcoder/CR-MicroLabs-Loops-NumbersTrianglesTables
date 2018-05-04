package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        int counter = 1;
        String aTri= "*\n";
        String aLine= "*";
        while(counter < numberOfRows-1){
            aLine += "*";
            aTri += aLine + "\n";
            counter++;
        }
        return aTri;
    }

    public static String getRow(int numberOfStars) {
        String aster = "";
        int counter = 1;
        while(counter <= numberOfStars) {
            aster += "*";
            counter++;
        }
        return aster;
    }

    public static String getSmallTriangle() {
        int counter = 1;
        String aTri= "*\n";
        String aLine= "*";
        while(counter < 4){
            aLine += "*";
            aTri += aLine + "\n";
            counter++;
        }
        return aTri;
    }

    public static String getLargeTriangle() {
        int counter = 1;
        String aTri= "*\n";
        String aLine= "*";
        while(counter < 9){
            aLine += "*";
            aTri += aLine + "\n";
            counter++;
        }
        return aTri;
    }
}
