package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen(){
        String output = "*** Output ***\noneToTen()";
        for(int x = 1 ; x<=10; x++){
            output += "\n" + x;
        }
        return output;
    }

    public String oddNumbers(){
        String output = "oddNumbers()\n*** Output ***";
        for(int x = 1 ; x<=19; x+=2){
            output += "\n" + x;
        }
        return output;
    }

    public String squares(){
        String output = "squares()\n*** Output ***";
        for (int x = 1; x<=10; x++){
            output += "\n" + (int)Math.pow(x,2);
        }
        return output;
    }

    public String random4(){
        return "";
    }

    public String even(int n){
        String output = "even("+n+")\n*** Output ***";
        for(int x = 2; x<n; x+=2){
            output += "\n" + x;
        }
        return output;
    }

    public String powers(int n) {
        String output = "powers(" + n + ")\n*** Output ***";
        for (int x = 1; x <= n; x++){
            output += "\n" + (int)Math.pow(2,x);
        }
        return output;
    }

}
