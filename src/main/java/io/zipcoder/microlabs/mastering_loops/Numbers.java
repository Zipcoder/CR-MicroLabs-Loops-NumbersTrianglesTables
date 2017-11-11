package io.zipcoder.microlabs.mastering_loops;


public class Numbers {


    public String oneToTen() {
        String output = "*** Output ***\noneToTen()\n";
        for (int i = 1; i <= 10; i++) {
            output = output + i + "\n";
        }
        return output;
    }

    public String oddNumbers() {
        String output = "***Output***\n";
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                output = output + i + "\n";
            }
        }
        return output;
    }

    public String squares() {
        String output = "***Output***\n";
        for (int i = 1; i <= 10; i++) {
            output = output + (i * i) + "\n";
        }
        return output;
    }

    public String even(int n) {
        String output = "***Output***\n";
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                output = output + i + "\n";
            }
        }
        return output;
    }

    public String powers(int n) {
        String output = "***Output***\n";
        for (int i = 2; i <= Math.pow(2, 8); i *= 2) {
            output = output + i + "\n";
        }
        return output;
    }
}