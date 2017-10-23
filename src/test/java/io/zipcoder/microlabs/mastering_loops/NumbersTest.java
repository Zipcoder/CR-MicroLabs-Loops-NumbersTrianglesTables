package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

public class NumbersTest {
    Numbers numbers = new Numbers();
    String actual;
    String expected;

    @Test
    public void oneToTenTest(){
        //: Given
        expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        actual = numbers.oneToTen();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);

    }

    @Test
    public void oddNumbersTest(){
        //: Given
        expected = "oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";

        //: When
        actual = numbers.oddNumbers();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void squaresTest(){
        //: Given
        expected = "squares()\n*** Output ***\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";

        //: When
        actual = numbers.squares();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void random4Test(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void evenTest(){
        //: Given
        expected = "even(20)\n*** Output ***\n2\n4\n6\n8\n10\n12\n14\n16\n18";

        //: When
        actual = numbers.even(20);

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void powersTest(){
        //: Given
        expected = "powers(8)\n*** Output ***\n2\n4\n8\n16\n32\n64\n128\n256";

        //: When
        actual = numbers.powers(8);

        //: Then
        Assert.assertEquals("The strings match", expected, actual);
    }

}
