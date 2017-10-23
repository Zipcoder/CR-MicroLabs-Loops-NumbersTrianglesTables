package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class NumbersMain {
    public static  void main(String args[]){
        Numbers randomNumber= new Numbers();
        double num= 0;
        String resultStr= "";
        for(int i=0;i<4;i++){
            num= Math.random()*10;
            //System.out.println(num);
            resultStr+= "\n"+(int) Math.round(num);
        }
        String result = randomNumber.random4(resultStr);
        System.out.println("Four random numbers between 0 & 9 are"+resultStr+"\n"+result);
    }

}
