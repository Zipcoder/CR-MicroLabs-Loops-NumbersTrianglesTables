package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

      public String oneToTen () {
          String output = "*** Output ***\noneToTen()";
          for (int i = 1; i <= 10; i++)
                output += "\n" + i;
          return output;
      }


    public String oddNumbers() {

            String output = "oddNumbers()\n*** Output ***\n";
            for(int i=0; i<=20; i++)
              if (i%2!=0)
                  output = output +=  i + "\n";
            return output;
    }

    public String squares() {

        String output = "squares()\n*** Output ***";
        for(int i=1; i<=10; i++)
                output = output += "\n" + (int)Math.pow(i,2);
        return output;
    }



    public String even(int n) {
        String output = "even(20)\n*** Output ***\n";
        for(int i=1; i<n; i++)
            if (i%2==0)
                output = output +=  i + "\n";
        return output;
    }

    public String powers(int n) {
        String output = "power(8)\n*** Output ***";
        for(int i=1; i<=n; i++)
            output = output += "\n" + (int)Math.pow(2,i);
        return output;
    }


}

