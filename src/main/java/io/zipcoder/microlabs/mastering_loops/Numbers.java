package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen(){
        String output = "oneToTen()\n*** Output ***";

        for(int x=1;x<=10;x++){
            output += "\n" + x;
        }
        return output;
    }

    public String oddNumbers(){
        String output = "oddNumbers()\n*** Output ***";
        for (int x = 1;x<=20;x++){
            if((x%2) == 1)
            output += "\n" + x;
        }
        return output;
    }

    public String squares(){
        String output = "squares()\n*** Output ***";
        for(int x=1;x<=10;x++){
            output += "\n" + x*x;
        }
        return output;
    }

    public String random4(){
        /*String output = "random4()\n*** Output ***";
        for(int x = 1;x<=4;x++){
            output += "\n" + Math.floor(Math.random()*10);
        }
        */
        return "";
    }

    public String even(int n){
        String output = "even(20)\n*** Output ***";
        for (int x=1;x<n;x++){
            if((x%2)==0){
                output += "\n" + x;
            }
        }
        return output;
    }

    public String powers(int n){
        String output = "powers(8)\n*** Output ***";
        for(int x=1;x<=n;x++){
            output += "\n" + (int)Math.pow(2,x);
        }


        return output;
    }

}
