package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {

    @Test
    public void triangleTest() {
        //: Given (expected)
        Shapes triTest = new Shapes();
        String expected = "*** Output ***\ntriangle()\n*\n**\n***\n****\n*****";

        //: When (actual)
        String actual = triTest.triangle();

        //: Then
        Assert.assertEquals("Triangle Built", expected, actual);
    }

    //error
    @Test
    public void tableSquareTest() {
        //: Given
        Shapes shapes = new Shapes();
        String expected = "*** Output ***\nA 4x4 table square\n" +
                "| 1 |  2 |  3 |  4 |\n" +
                "| 2 |  4 |  6 |  8 |\n" +
                "| 3 |  6 |  9 | 12 |\n" +
                "| 4 |  8 | 12 | 16 |";

        //: When
        String actual = shapes.tableSquare();

        //: Then
        Assert.assertEquals("The table square is built", expected, actual);
    }

    @Test
    public void tableSquaresTest() {
        //: Given
        Shapes shapes = new Shapes();
        String expected = "*** Output ***\nA nxn Table Square\n" +
                "| 1 |  2 |  3 |  4 |  5 |  6 |\n" +
                "| 2 |  4 |  6 |  8 | 10 | 12 |\n" +
                "| 3 |  6 |  9 | 12 | 15 | 18 |\n" +
                "| 4 |  8 | 12 | 16 | 20 | 24 |\n" +
                "| 5 | 10 | 15 | 20 | 25 | 30 |\n" +
                "| 6 | 12 | 18 | 24 | 30 | 36 |";

        //: When
        String actual = shapes.tableSquares(6);

        //: Then
        Assert.assertEquals("The table squares is built", expected, actual);
    }
}
