package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen(){

        String output = "*** Output ***\noneToTen()";
        for(int i = 1; i <= 10; i++){
            output += "\n" + i;
        }
        return output;
    }

    public String oddNumbers(){

        String oddnumbers = "*** Output *** \noddnumbers()";
        for(int i = 1; i <= 20; i++){
            if(i%2 !=0){
                oddnumbers += "\n" + i;
            }
        }

        return oddnumbers;
    }

    public String squares(){

        String numsquare = "*** Output ***\nsquares()";
        for(int i = 1; i <=10; i++){
            numsquare += "\n" + i*i;
        }

        return numsquare;
    }

    public String random4(){
        return "";
    }

    public String even(int n){
        return "";
    }

    public String powers(int n){
        return "";
    }

}
