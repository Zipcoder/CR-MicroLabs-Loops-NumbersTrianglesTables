package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen()
    {
        String output = "*** Output ***\noneToTen()";
        for (int i = 1; i <= 10; i++) {
            output += "\n" + i;
        }
        return output;
    }

    public String oddNumbers(){
        String output = "oddNumbers()\n*** Output ***";
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 1) {
                output += "\n" + i;
            }
        }
        return output;
    }

    public String squares(){
        String output = "squares()\n*** Output ***";
        for (int i = 1; i <= 10; i++) {
            output += "\n" + (int)Math.pow(i, 2);
        }
        return output;
    }

    public String random4(){
        String output = "random4()\n*** Output ***";
        for (int i = 0; i < 4; i++) {
            output += "\n" + (int)(Math.random() * 10);
        }
        return output;
    }

    public String even(int n) {
        String output = "even(20)\n*** Output ***";
        if (n % 2 == 1) {
            n--;
        }
        for (int i = 2; i < n; i+=2) {
            output += "\n" + i;
        }
        return output;
    }

    public String powers(int n){
        String output = "powers(8)\n*** Output ***";
        for (int i = 1; i <= 8; i++) {
            output += "\n" + (int)Math.pow(2,i);
        }
        return output;
    }

}
