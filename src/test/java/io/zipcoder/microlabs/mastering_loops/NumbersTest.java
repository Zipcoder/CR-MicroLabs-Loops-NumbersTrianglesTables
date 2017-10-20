package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

public class NumbersTest {

    @Test
    public void oneToTenTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\noneToTen()\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void oddNumbersTest(){
        //: Given
        Numbers oddNumbers = new Numbers();
        String expected =  "oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";

        //: When
        String actual = oddNumbers.oddNumbers();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void squaresTest(){
        //: Given
        Numbers sqrNumbers = new Numbers();
        String expected = "squares()\n*** Output ***\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";

        //: When
        String actual = sqrNumbers.squares();

        //: Then
        Assert.assertEquals("The two strings are equal",expected,actual);
    }

    @Test
    public void random4Test(){
        //: Given
        Numbers randNum = new Numbers();
        String ExpectedString = "random4()\n*** Output ***";
        int startExpectedStirngLength = ExpectedString.length();
        boolean[] numInRangeExpected = {true,true,true,true};
        for(int i =0;i<4;i++){
            ExpectedString+="\n" +numInRangeExpected[i];
        }

        //: When
        String actualString = randNum.random4();
        String newActualString = actualString.substring(0,startExpectedStirngLength);
        boolean[] numInRangeActual = new boolean[4];
        int num;
        int place;
        char letter;
        for(int i =0;i<4;i++){
            place = i+startExpectedStirngLength;
            letter = actualString.charAt(place);
            num = Character.getNumericValue(letter);
            if(0 < num && num <= 10){
                numInRangeActual[i] = true;
            }
            newActualString += "\n" + numInRangeActual[i];
        }


        //: Then
        Assert.assertEquals("Strings are same",ExpectedString,newActualString);


    }

    @Test
    public void evenTest(){
        //: Given
        Numbers evenNums = new Numbers();
        String expected = "even(20)\n*** Output ***\n2\n4\n6\n8\n10\n12\n14\n16\n18";

        //: When
        String actual = evenNums.even(20);

        //: Then
        Assert.assertEquals("Strings are equals",expected,actual);
    }

    @Test
    public void powersTest(){
        //: Given
        Numbers powerNum = new Numbers();
        String expected = "power(8)\n*** Output ***\n2\n4\n8\n16\n32\n64\n128\n256";

        //: When
        String actual = powerNum.powers(8);

        //: Then
        Assert.assertEquals("Strings are the same",expected,actual);
    }

}
