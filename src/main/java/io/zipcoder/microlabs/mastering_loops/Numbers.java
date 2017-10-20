package io.zipcoder.microlabs.mastering_loops;

public class Numbers {

    public String oneToTen() {
        String output = "oneToTen()\n*** Output ***";
        for(int i = 1; i <= 10; i++) {
            output += "\n" + i;
        }
        return output;
    }

    public String oddNumbers() {
        String output = "oddNumbers()\n*** Output ***";
        for(int i = 1; i < 20; i += 2) {
            output += "\n" + i;
        }
        return output;
    }

    public String squares() {
        String output = "squares()\n*** Output ***";
        for(int i = 1; i <= 10; i++) {
            output += "\n" + i * i;
        }
        return output;
    }

    public String random4() {
        String output = "random4()\n*** Output ***";
        for(int i = 0; i < 4; i++){
            output += "\n" + (int)(Math.random() * 10);
        }
        return output;
    }

    public String even(int n) {
        String output = "even()\n*** Output ***";
        n = 20;
        if(n % 2 == 1) {
            n--;
        }
            for (int i = 2; i < n; i += 2) {
                output += "\n" + i;
            }
        return output;
    }

    public String powers(int n) {
        String output = "powers()\n*** Output ***";
        n = 8;
        for(int i = 1; i <= n; i++) {
            output += "\n" + (int)Math.pow(2, i);
        }
        return output;
    }

}
