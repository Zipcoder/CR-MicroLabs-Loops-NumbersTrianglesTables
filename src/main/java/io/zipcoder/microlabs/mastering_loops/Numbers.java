package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen() {
        String output = "*** Output ***\noneToTen()";
        for (int i=1; i<=10; i++) {
            output += "\n" + i;
        }
        return output;
    }

    public String oddNumbers() {
        String oddnums = "*** Output ***\noddNumbers()";
        for (int i=1; i<=20; i++) {
            if (!(i % 2 == 0)) {
                oddnums += "\n" + i;
            }
        }
        return oddnums;
    }

    public String squares() {
        String squareNums = "*** Output ***\nsquares()";
        for (int i=1; i<=10; i++) {
            squareNums += "\n" + i*i;
        }
        return squareNums;
    }

    //Skip
    public String random4(){
        return "";
    }

    public String even(int n) {
        String evenNums = "*** Output ***\neven()";
        for (int i=1; i<20; i++) {
            if (i % 2 == 0 ) {
                evenNums += "\n" + i;
            }
        }
        return evenNums;
    }

    public String powers(int n) {
        String powerNums = "*** Output ***\npowers()";
        for (int i=1; i<=8; i++) {
            powerNums += "\n" + (int) Math.pow(2, i);
        }
        return powerNums;
    }

}
