package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen(){
       String output = "*** Output ***\noneToTen()";
       for(int x =1; x <=10; x++){
           output += "\n" +x ;
       }
        return output; }

    public String oddNumbers(){
        String output = "*** Output ***\noddNumbers()";
        for (int x=1; x<=20; x++){
            if(x % 2 ==1){
                output +="\n" +x;
            }
        }
        return output;
    }

    public String squares(){
        String output = "*** Output ***\nsquaresTest()";
        for(int i=1; i<11; i++){
           double x = Math.pow(i,2);
            output +="\n" + Math.round(x);
        }

        return output;
    }

    public String random4(){
        return "";
    }

    public String even(int n){
        String output = "*** Output ***\neven(20)";
        for (int x=1; x<n; x++){
            if(x % 2 ==0){
                output +="\n" +x;
            }
        }

        return output;
    }


    public String powers(int n){
        String output = "*** Output ***\npowers(8)";
               for(int i=1; i<=n; i++){
            double x = Math.pow(2,i);
            output +="\n" + Math.round(x);
        }
        return output;
    }

}
