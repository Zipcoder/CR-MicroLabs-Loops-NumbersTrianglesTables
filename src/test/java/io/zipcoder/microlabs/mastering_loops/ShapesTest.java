package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {



    @Test
    public void triangleTest(){
        //: Given
        Shapes tri = new Shapes();
        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****";

        //: When
        String actual = tri.triangle();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given
        Shapes square = new Shapes();
        String expected = "tablesSquare()\n*** Output ***\nA 4 x 4 table square\n" +
                "|  1 |  2 |  3 |  4 |\n"+
                "|  2 |  4 |  6 |  8 |\n"+
                "|  3 |  6 |  9 | 12 |\n"+
                "|  4 |  8 | 12 | 16 |\n";

        //: When
        String actual = square.tableSquare();

        //: Then
        Assert.assertEquals("The two strings are equal", expected,actual);
    }
    @Test
    public void tableSquaresTest(){
        //: Given
        Shapes square = new Shapes();
        String expected = "tablesSquare(6)\n*** Output ***\nA 6 x 6 table square\n" +
                "|  1 |  2 |  3 |  4 |  5 |  6 |\n"+
                "|  2 |  4 |  6 |  8 | 10 | 12 |\n"+
                "|  3 |  6 |  9 | 12 | 15 | 18 |\n"+
                "|  4 |  8 | 12 | 16 | 20 | 24 |\n"+
                "|  5 | 10 | 15 | 20 | 25 | 30 |\n"+
                "|  6 | 12 | 18 | 24 | 30 | 36 |\n";

        //: When
        String actual = square.tableSquares(6);

        //: Then
        Assert.assertEquals("The two strings are equal", expected,actual);
    }
}
