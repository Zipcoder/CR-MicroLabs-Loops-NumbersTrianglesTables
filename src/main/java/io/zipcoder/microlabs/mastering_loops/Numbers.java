package io.zipcoder.microlabs.mastering_loops;

public class Numbers {

    public String oneToTen() {

        String output = "oneToTen()\n*** Output ***\n";

        for (int i = 1; i <= 10; i++) {

            output += "\n" + i;

        }

        return output;

    }

    public String oddNumbers() {

        String output = "oddNumbers()\n*** Output ***\n";

        for (int i = 1; i <= 20; i += 2) {

            output += "\n" + i;

        }

        return output;

    }

    public String squares() {

        String output = "squares()\n*** Output ***\n";

        for (int i = 1; i <= 10; i++) {

            output += i * i;

        }

        return output;

    }

    //public String random4(){return "";}

    public String even(int n) {

        String output = "even(n)\n*** Output ***\n";

        n = (int) Math.random() * 100;

        for (int i = 2; i <= n; i += 2) {

            output += "\n" + i;

        }

        return output;

    }

    public String powers(int n) {

        String output = "powers(n)\n*** Output ***\n";

        for (n = 1; n < (int) Math.random() * 100; n++) {

            output += 2 ^ n;

        }

        return output;

    }

}
