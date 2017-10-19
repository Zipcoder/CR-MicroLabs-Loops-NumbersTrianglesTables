package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen()
    {
        String output = "*** Output ***\noneToTen()";
        for(int x = 1 ; x<=10; x++){
            output += "\n" + x ;

        }
        return output;
    }


    public String oddNumbers()
    {
        String output = "oddNumbers()\n*** Output ***";
        for (int i=1; i<20; i+=2)
        {
            output += "\n" + i;
        }
        return output;
    }

    public String squares(){
        return "";
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
