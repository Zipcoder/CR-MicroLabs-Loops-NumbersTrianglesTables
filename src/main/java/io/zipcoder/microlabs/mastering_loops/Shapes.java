package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

// This way is better... just saying -______-

//    Version 0.1 - Single for loop
//    public String triangle(){
//        String output = "triangle()\n*** Output ***";
//
//        String star = "*";
//
//        for (int x = 0; x < 5; x++) {
//            output += "\n" + star;
//            star+="*";
//        }
//
//        return output;
//    }

    // Version 0.2 - basically a fake nested for loop
//    public String triangle(){
//        String output = "triangle()\n*** Output ***";
//
//        String star = "*";
//
//        for (int x = 0; x < 5; x++) {
//            output += "\n" + star;
//            for (int y = 0; y < 1; y ++) {
//                //output += "\n" + star;
//                star+="*";
//            }
//
//
//        }
//
//        return output;
//    }

    // Real nested for loop
    public String triangle(){
        String output = "triangle()\n*** Output ***";

        String star = "*";

        for (int row = 0; row < 5; row++) {
            output += "\n";

            for (int column = 0; column <= row; column ++) {
                output += star;
                //star+="*";
            }
        }

        return output;
    }

    public String tableSquare(){
        String output = "A 4 x 4 table square";
        for (int row = 1; row <= 4; row++) {
            output += "\n|";
            for (int column = 1; column <= 4; column++) {
                output += String.format("%3d |", row*column);
            }
        }

        return output;
    }

    public String tableSquares(int n){
        String output = "A 6 x 6 table square";
        for (int row = 1; row <= n; row++) {
            output += "\n|";
            for (int column = 1; column <= n; column++) {
                output += String.format("%3d |", row*column);
            }
        }

        return output;
    }
}
