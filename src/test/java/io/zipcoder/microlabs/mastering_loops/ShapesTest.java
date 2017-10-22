package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {
    Shapes shapes = new Shapes();
    String expected;
    String actual;


    @Test
    public void triangleTest(){
        //: Given
        expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****";

        //: When
        actual = shapes.triangle();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given
        expected = "tableSquare()\n*** Output ***\nA 4x4 table square\n" +
                "| 1| 2| 3| 4|\n" +
                "| 2| 4| 6| 8|\n" +
                "| 3| 6| 9|12|\n" +
                "| 4| 8|12|16|";

        //: When
        actual = shapes.tableSquare();

        //: Then
        Assert.assertEquals("The strings match", expected, actual);
    }

    @Test
    public void tableSquaresTest(){
        //: Given
        expected = "tableSquares(6)\n*** Output ***\nA 6x6 table square\n" +
                "|  1   |  2   |  3   |  4   |  5   |  6   |\n" +
                "|  2   |  4   |  6   |  8   | 10   | 12   |\n" +
                "|  3   |  6   |  9   | 12   | 15   | 18   |\n" +
                "|  4   |  8   | 12   | 16   | 20   | 24   |\n" +
                "|  5   | 10   | 15   | 20   | 25   | 30   |\n" +
                "|  6   | 12   | 18   | 24   | 30   | 36   |";

        //: When
        actual = shapes.tableSquares(6);

        //: Then
        Assert.assertEquals("The table squares match", expected, actual);

    }
}
