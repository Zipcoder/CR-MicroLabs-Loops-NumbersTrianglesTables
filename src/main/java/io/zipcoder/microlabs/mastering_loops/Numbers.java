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

    public String squares()
    {/*In the class Numbers, complete the method called squares()
    so that it returns a string of the square numbers up to 100.
    The Unit Test is not provided for you, you must complete it.*/
        String output = "squares()\n*** Output ***";
        for (int i=1; i<=10; i++)
        {
            output+= "\n" + (i*i);
        }
        return output;
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
