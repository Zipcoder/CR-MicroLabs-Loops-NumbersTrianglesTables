package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Numbers {

    public String oneToTen() {

        String numbers = "*** Output ***\noneToTen()";

        for (int i = 1; i <= 10; i++) {

            numbers += "\n" + i;

        }

        return numbers;
    }

    public String oddNumbers() {

        String numbers = "*** Output ***\noddNumbers()";

        for (int i = 1; i <= 20; i++) {

            if (i % 2 != 0) {
                numbers += "\n" + i;
            }
        }

        return numbers;
    }

    public String squares() {

        String numbers = "*** Output ***\nsquaresNumbers()";

        for (int i = 1; i <= 10; i++) {

            numbers += "\n" + i * i;


        }

        return numbers;

    }

    public String random4() {

        String numbers = "*** Output ***\nRandom4()";

        for (int i = 0; i < 4; i++) {

            numbers += "\n" + (int) (Math.random() * 10);

        }

        return numbers;
    }

    public String even(int n) {

        String numbers = "*** Output ***\neven()";

        for (int i = 1; i <= 8; i++) {

            if (i % 2 == 0) {
                numbers += "\n" + i;
            }
        }

        return numbers;

    }

    public String powers(int n) {

        String numbers = "*** Output ***\nsquaresNumbers()";


        for (int i = 1; i <= 8; i++) {

            numbers += "\n" + (int) Math.pow(2, i);
        }
        return numbers;
    }

    public void powersTest() {


    }

    public String CarRide(String userInput) {


        System.out.println();

        if (userInput.equalsIgnoreCase("yes")) {

        }


        return userInput;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numbers numbers = new Numbers();


        System.out.println("Are we there?");
        String userIput = scanner.nextLine();
        numbers.CarRide(userIput);

        while (!numbers.CarRide(userIput).equalsIgnoreCase("Yes")){
            System.out.println("Are we there?");
             userIput = scanner.nextLine();
            numbers.CarRide(userIput);

        }
        System.out.println("Good");
    }

    public String triangle(){

        String asterisks = "";
        String outPut = "";

        for(int i=0; i<=7; i++) {
            asterisks = "";

            for(int j=1; j<=i; j++) {

                asterisks +=  "*";
            }
           outPut += (i>0)? "\n" + asterisks: asterisks;
        }

        return outPut.trim();
    }

    public String tableSquare(){

        String outPut = "";

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=4; j++) {

                outPut +=  "|" + String.format("%2d" ,(i*j)) + " ";
            }
            outPut += "|\n";
        }

        return outPut.trim();
    }

    public String Shapes(){

        String outPut = "";
        int numberToLoop = 6;

        for(int i=1; i<=numberToLoop; i++) {
            for(int j=1; j<=numberToLoop; j++) {

                outPut +=  "|" + String.format("%3d" ,(i*j)) + " ";
            }
            outPut += "|\n";
        }

        return outPut.trim();

    }

}