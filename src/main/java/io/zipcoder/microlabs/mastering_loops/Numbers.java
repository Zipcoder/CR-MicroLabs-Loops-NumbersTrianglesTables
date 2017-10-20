package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen(){
        String output = "*** Output ***\noneToTen()";
        for(int i = 1; i< 11; i++){
            output += "\n"+ i;
        }

        return output;

    }

    public String oddNumbers(){
        String output = "oddNumbers()\n*** Output ***";
        for(int i = 1; i<21; i++){
            if(i%2 != 0){
                output += "\n" + i;
            }

        }
        return output;
    }

    public String squares(){
        String output = "squares()\n*** Output ***";
        for(int i = 1; i<11; i++){
            output += "\n" + i*i;


        }
        return output;
    }

    public String random4(){
        String output = "random4()\n*** Output ***";
        for(int i = 0; i<4; i++){
            output += "\n" + (int)((Math.random()*9)+1);


        }
        return output;
    }

    public String even(int n){
        String output = "even(" + n + ")\n*** Output ***";
        for(int i = 1; i<n; i++){
            if(i%2 == 0) {
                output += "\n" + i;
            }
        }
        return output;
    }

    public String powers(int n) {
        String output = "powers("+n+")\n*** Output ***";
        for (int i = 1; i <= n; i++) {
            output += "\n" + (int) Math.pow(2, i);
        }
        return output;
    }
}
