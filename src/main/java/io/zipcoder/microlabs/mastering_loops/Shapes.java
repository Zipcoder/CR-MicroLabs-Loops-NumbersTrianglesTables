package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){
        String asteriskPicture = "triangle()\n*** Output ***";
        for(int row = 1; row <= 5; row++) {
            asteriskPicture += "\n";
            for(int col = 1; col <= row; col++) {
                asteriskPicture += "*";
            }
        }
        return asteriskPicture;
    }

    public String tableSquare(){
        String fourByFour = "tableSquare()\n*** Output ***\nA 4 x 4 table square";
        for(int row = 1; row <= 4; row++) {
            fourByFour += "\n|";
            for(int col = 1; col <= 4; col++) {
                int spacingWidth = (int) (Math.log10(col * 4) + 2);
                int numToAdd = row * col;
                fourByFour += String.format("%" + spacingWidth + "d |",numToAdd);
            }
        }
        return fourByFour;
    }

    public String tableSquares(int n){
        String nByNSquare = "tableSquares(" + n + ")\n*** Output ***\nA " + n + " x " + n + " table square";
        for(int row = 1; row <= n; row++) {
            nByNSquare += "\n|";
            for(int col = 1; col <= n; col++) {
                int spacingWidth = (int) (Math.log10(col * n) + 2); // I would like to make this calculation more efficient since it calls every time col updates, but spacingWidth updates and changes every entry. Is doing the calculation to get the value less efficient than storing the spacingWidth values in an array and applying the correct index of spacingWidth?
                int numToAdd = row * col;
                nByNSquare += String.format("%" + spacingWidth + "d |",numToAdd);
            }
        }
        return nByNSquare;
    }
}
