package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen(){

        String output = "*** Output ***\noneToTen()";
        for(int i = 1 ; i <= 10; i++){
            output += "\n" + i ;

        }
        return output;
    }

    public String oddNumbers(){

        String output = "oddNumbers()\n*** Output ***";
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                output += "\n" + i;

            }

        }

        return output;

    }

    public String squares(){

        String output = "squares()\n*** Output ***";
        for (int i = 1; i <= 10; i++){

            output += "\n" + (i * i);

        }


        return output;
    }

    /*
    public String random4() {

        String output = "random4Test()\n*** Output ***" ;
        int randomNum = 0;

        for (int i = 1; i <= 4; i++) {

            randomNum = (int) (Math.random() * 10);
            output += "\n" + randomNum;
        }


        return output;
    }

    */

    public String even(int n){

        String output = "even()\n*** Output ***";

        for (int i = 1; i < n; i++){
            if(i % 2 == 0){
                output += "\n" + i;
            }
        }

        return output;
    }

    public String powers(int n){

        String output = "powers()\n*** Output ***";

        for (int i = 1; i <= n; i++){

              int result = (int) Math.pow(2,i);
              output += "\n" + result;

        }
        return output;
    }

}
