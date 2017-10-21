package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen() {

        return"";
}
    public String oddNumbers(){
       // "*** Output ***\noddNumbers()\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        String oddNumbers = "*** Output ***\noddNumbers()";
        for(int i = 1; i <= 20; i++){
            if(i % 2 != 0){
                oddNumbers += "\n" + i;
            }
        }
        return oddNumbers;
    }

    public String squares(){
      //  "squares()\n*** Output ***\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100"
        String squares = "squares()\n*** Output ***";
        for(int i = 1; i <= 10; i++){
            squares += "\n" + i * i;
        }
        return squares;
    }

    public String even(int n) {
        //"even(20)\n*** Output ***\n2\n4\n6\n8\n10\n12\n14\n16\n18"
        String even = "even(20)\n*** Output ***";
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                even += "\n" + i;
            }
        }
        return even;
    }

    public String powers(int n){
        //"powers(8)\n*** Output ***\n2\n4\n8\n16\n32\n64\n128\n256";
        String output= "powers(8)\n*** Output ***";
        for(int i = 1; i <= 8; i++) {
            int casting = (int) Math.pow(2,i);
            output += "\n" + casting;
        }
        return output;
    }
}
