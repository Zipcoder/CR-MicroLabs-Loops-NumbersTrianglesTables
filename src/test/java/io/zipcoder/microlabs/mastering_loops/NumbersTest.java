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
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\noddNumbers()\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";

        //: When
        String actual = numbers.oddNumbers();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);

    }

    @Test
    public void squaresTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\nsquaresNumbers()\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";

        //: When
        String actual = numbers.squares();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);

    }

    @Test
    public void random4Test(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\nRandom4() 1 < x < 10 ";

        //: When
        String actual = numbers.random4();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);

    }

    @Test
    public void evenTest(){
        //: Given

        Numbers numbers = new Numbers();
        String expected = "*** Output ***\neven()\n2\n4\n6\n8";
        //: When
        String actual = numbers.even( 8);
        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);

    }

    @Test
    public void powersTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\nsquaresNumbers()\n2\n4\n8\n16\n32\n64\n128\n256";
        //: When
        String actual = numbers.powers(8);

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }
    @Test
    public void CarRideTest(){

        Numbers number = new Numbers();
        String expected = "Yes";
        String actual = number.CarRide("Yes");
        Assert.assertEquals("The two strings are equal", expected, actual);

    }

    @Test
    public void trianguleTest(){

        Numbers numbers = new Numbers();
        String expected = "*\n**\n***\n****\n*****\n******\n*******";
        String actual = numbers.triangle();

        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void tableSquareTest(){
        Numbers numbers = new Numbers();
        String expected = "| 1 | 2 | 3 | 4 |\n" +
                          "| 2 | 4 | 6 | 8 |\n" +
                          "| 3 | 6 | 9 |12 |\n" +
                          "| 4 | 8 |12 |16 |";

        String actual = numbers.tableSquare();

        Assert.assertEquals("The two strings are equal", expected, actual);


    }

    @Test
    public void Shapes(){

        Numbers number = new Numbers();
        String expected = "|  1 |  2 |  3 |  4 |  5 |  6 |\n" +
                          "|  2 |  4 |  6 |  8 | 10 | 12 |\n" +
                          "|  3 |  6 |  9 | 12 | 15 | 18 |\n" +
                          "|  4 |  8 | 12 | 16 | 20 | 24 |\n" +
                          "|  5 | 10 | 15 | 20 | 25 | 30 |\n" +
                          "|  6 | 12 | 18 | 24 | 30 | 36 |";
        String actual = number.Shapes();
        Assert.assertEquals("The two strings are equal", expected, actual);

    }

}
