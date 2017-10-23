package io.zipcoder.microlabs.mastering_loops;
import static java.lang.Math.*;

public class Numbers {

//"*** Output ***\noneToTen()\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10"
    public String oneToTen(){
        String output = "*** Output ***\noneToTen()";
        for(int x =1; x<=10; x++){
            output += "\n" + x;
        }
        return output;
    }

    public String oddNumbers(){
        String output = "*** Output ***\noddNumbers()";
        for(int x=1; x<=20; x++){
            if(x%2 !=0){
                output += "\n" + x;
            }
        }
        return output;
    }

    public String squares(){
        String output = "*** Output ***\nsquares()";
        for(int x=1;x<=10; x++){
            output += "\n" +x*x;
        }
        return output;
    }

    public String random4(){
        return "";
    }


    public String even(int n){
        String output = "*** Output ***\neven(n)";

        for (int x = 1; x < n; x++){
            if(x % 2 == 0){
                output += "\n" + x;
            }
        }

        return output;
    }


//import static java.lang.Math.* to avoid writing the Math prefix
    public String powers(int n){
        String output = "*** Output ***\npowers(n)";
        for(int a = 1; a <= n; a++ ){

            int powerResult = (int) pow(2,a);
            output += "\n" + powerResult;
        }

        return output;
    }




}
