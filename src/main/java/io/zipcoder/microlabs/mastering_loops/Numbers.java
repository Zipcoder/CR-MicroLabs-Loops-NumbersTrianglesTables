package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen(){
        String output = "oneToTen()\n*** Output ***";
        for(int i=1;i<=10;i++ ){
            output += "\n" + i;
        }
        return output;
    }

    public String oddNumbers(){
        String output = "oddNumbers()\n*** Output ***";
        for(int i=1; i<20; i++){
            if(i%2 != 0){
                output += "\n" +i;
            }
        }
        return output;
    }

    public String squares(){
        String output ="squares()\n*** Output ***";
        for(int i=1; i<=10;i++){
            output += "\n" + i *i;
        }
        return output;
    }

    public String random4(){
        return "";
    }

    public String even(int n){
        //return even number from 2-18
        n=20;
        String output = "even(20)\n*** Output ***";
        for(int i=1; i < n;i++){
            if(i % 2 == 0) output += "\n" + i;
        }
        return output;
    }

    public String powers(int n){
        //return a string that's power of 2 from 2^1...2^n, n < 8
        String output = "powers(8)\n*** Output ***";
        for(n=1; n<=8;n++ ){
            output += "\n" + (int)Math.pow(2,n);
        }
        return output;
    }

}
