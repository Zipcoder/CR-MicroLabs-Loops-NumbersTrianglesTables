package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen() {
        String output = "*** Output ***\noneToTen()";
        for (int i = 1; i <= 10; i++) {
            output += "\n" + i;
        }
        return output;
    }

    public String oddNumbers() {
        String output = "oddNumbers()\n*** Output ***";
        for (int i = 1; i < 20; i++) {
            if ((i % 2) == 1) {
                output += "\n" + i;
            }
        }
        return output;
    }

    public String squares() {
        String output = "squares()\n*** Output ***";
        for (int i = 1; i <= 10; i++) {
            int squareNum = i * i;
            output += "\n" + squareNum;
        }
        return output;
    }

    public String random4() {
        int randNum;
        String output = "random4()\n*** Output ***";
        for (int i = 0; i < 4; i++) {
            randNum = (int) (Math.random() * 10) + 1;
            output += "\n" + randNum;
        }
        return output;

    }

    public String even(int n) {
        String output = "even(20)\n*** Output ***";
        for (int i = 1; i < n; i++) {
            if ((i % 2) == 0) {
                output += "\n" + i;
            }
        }
        return output;
    }

    public String powers(int n) {
        String output = "power(8)\n*** Output ***";
        for (int i = 1; i <= n; i++) {
            output += "\n" + (int) Math.pow(2, i);
        }
        return output;
    }

}
