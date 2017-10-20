package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen(){
        String output = "*** Output ***\noneToTen()\n";
        for (int i = 1; i <= 10; i++) {
            output += i + "\n";
        }
        output = output.trim();
        return output;
    }

    public String oddNumbers(){
        String output = "oddNumbers()\n*** Output ***\n";
        for (int i = 1; i < 20; i += 2) {
            output += i + "\n";
        }
        output = output.trim();
        return output;
    }

    public String squares(){
        String output = "squares()\n*** Output ***\n";
        for (int i = 1; i <= 10; i++) {
            output += i * i + "\n";
        }
        output = output.trim();
        return output;
    }

    public String random4(){
        String output = "random4()\n*** Output ***\n";
        return output;
    }

    public String even(int n){
        String output = "even(" + n + ")\n*** Output ***\n";
        for (int i = 2; i < n; i += 2) {
            output += i + "\n";
        }
        output = output.trim();
        return output;
    }

    public String powers(int n){
        String output = "powers(" + n + ")\n*** Output ***\n";
        for (int i = 1; i <= n; i++) {
            double dExponentiation = Math.pow(2, i);
            int iExponentiation = (int) dExponentiation;
            output +=  iExponentiation + "\n";
        }
        output = output.trim();
        return output;
    }

}
