package io.zipcoder.microlabs.mastering_loops;


import java.util.Random;

public class Numbers {

    public int[] numberArray = new int[4];

    public String oneToTen(){
        String numberList = "*** Output ***\noneToTen()";

        for(int num = 1; num <= 10; num++) {
            numberList += "\n" + num;
        }
        return numberList;
    }

    public String oddNumbers(){
        String numberList = "oddNumbers()\n*** Output ***";

        for(int num = 1; num < 20; num += 2) {
            numberList += "\n" + num;
        }
        return numberList;
    }

    public String squares(){
        String numberList = "squares()\n*** Output ***";

        for(int num = 1; num <= 10; num++) {
            int squared = (int) Math.pow(num, 2);
            numberList += "\n" + squared;
        }
        return numberList;
    }

    public String random4(){
        String numberList = "random4()\n*** Output ***";
        Random rand = new Random();

        for(int i = 0; i < 4; i++) {
            int randInt = rand.nextInt(10);
            numberList += "\n" + randInt;
            numberArray[i] = randInt;
        }

        return numberList;
    }

    public String even(int n){
        String numberList = "even(" + n + ")\n*** Output ***";

        for(int num = 2; num < n; num += 2) {
            numberList += "\n" + num;
        }
        return numberList;
    }

    public String powers(int n){
        String numberList = "powers(" + n + ")\n*** Output ***";

        for(int i = 1; i <= n; i++) {
            int twoToTheN = (int) Math.pow(2, i);
            numberList += "\n" + twoToTheN;
        }
        return numberList;
    }

}
