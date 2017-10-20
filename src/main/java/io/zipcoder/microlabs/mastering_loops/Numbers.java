package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;

public class Numbers {

    public String oneToTen(){

        String numbers = "*** Output ***\noneToTen()";

        for(int i = 1;i<=10;i++){

        numbers += "\n" +i;

        }

        return numbers;
    }

    public String oddNumbers(){

        String numbers = "*** Output ***\noddNumbers()";

        for(int i = 1;i<=20;i++){

            if(i%2 != 0){
                numbers +=  "\n" +i;
            }
        }

        return numbers;
    }

    public String squares(){

        String numbers = "*** Output ***\nsquaresNumbers()";

        for(int i = 1;i<=10;i++){

                numbers +=  "\n" + i * i;


        }

        return numbers;

    }

    public String random4(){

        String numbers = "*** Output ***\nRandom4()";

        for(int i = 0;i<4;i++){

                numbers +=  "\n" + (int)(Math.random()*10);

        }

        return numbers;
    }

    public String even(int n){

        String numbers = "*** Output ***\neven()";

        for(int i = 1;i<=8;i++){

            if(i%2 == 0){
                numbers +=  "\n" +i;
            }
        }

        return numbers;

    }

    public String powers(int n){

        String numbers = "*** Output ***\nsquaresNumbers()";


        for(int i = 1;i<=8;i++){

                numbers += "\n" + (int)Math.pow(2,i);
        }
        return numbers;
    }

    public void powersTest(){


    }
}
