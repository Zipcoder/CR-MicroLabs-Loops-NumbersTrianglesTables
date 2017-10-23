package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen() {
        String output = "*** Output ***\noneToTen()";
        for(int x = 1; x<=10; x++){
            output += "\n" + x;
    }return output;
    }

    public String oddNumbers() {
        String output = "*** Output ***\noddNumbers()";
        int limit = 15;
        for(int i=1; i <= 20; i++) {
            if(i % 2 != 0){
                output += "\n" + i;
            }
    }
       return output;
    }

    public String squares(){
        String output = "*** Output ***\nsquareNumbers()";
         int squares =0;

        for(int i=1; i<= 10; i++)
             {
           squares = (int) Math.pow(i, 2);
           output += "\n" + squares;
          }
        return output;
            }

    public String even(){
        String output = "*** Output ***\nevenNumbers()";
        int n = 18 ;
        for(int i=1; i <= n; i++) {
            if(i % 2 == 0){
                output += "\n" + i;
            }
        }
        return output;
    }

    public String powers(int n) {
        String output = "*** Output ***\npowersNumbers()";
        int result =1;

        for(int i=1; i<= 8; i++)
        {
           result = result+ result;
            output += "\n" + result;

    }
        return output;
    }

}
