package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        return null;
    }

    public static String getRow(int numberOfStars) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {

          sb.append('*');
        }
        return sb.toString();
    }
    public static String getSmallTriangle() {
        int triangleSize = 4;
        StringBuilder something = new StringBuilder();
        for(int i = 0; i < triangleSize ; i++){
          for(int j =0; j<= i ;j++) {
              something.append('*');

          }
            something.append("\n");
        }

        return something.toString();
    }

    public static String getLargeTriangle() {
        int triangleSize = 9;
        StringBuilder something = new StringBuilder();
        for(int i = 0; i < triangleSize ; i++){
            for(int j =0; j<= i ;j++) {
                something.append('*');

            }
            something.append("\n");
        }

        return something.toString();
    }
}
