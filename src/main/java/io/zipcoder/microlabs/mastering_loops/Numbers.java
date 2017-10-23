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

        String random = "*** Output ***\nrandom()";

        for(int i = 1; i <=4; i++) {
            random += "\n";
            random += (int) Math.floor(Math.random() * 10 - 1 + 1);
        }
        return random;
    }

    public String even(int n){

        String evenNum = "*** Output ***\neven(20)";
        for(int i = 1; i < n; i++){
            if(i%2 == 0){
                evenNum += "\n" + i;
            }
        }
        return evenNum;
    }

    public String powers(int n){

        String pow = "*** Output ***\npowers(" + n + ")";

        for(int i = 1; i <= n; i++){
            pow += "\n";
            pow += (int)Math.pow(2,i);
        }

        return pow;
    }

}
