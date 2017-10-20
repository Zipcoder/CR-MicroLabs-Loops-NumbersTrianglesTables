package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {

    @Test
    public void triangleTest() {
        //: Given
        Shapes triangle = new Shapes();
        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****";

        //: When
        String actual = triangle.triangle();

        //: Then
        Assert.assertEquals("Same string", expected, actual);
    }

    @Test
    public void tableSquareTest() {
        //: Given
        Shapes square = new Shapes();
        String expected = "tableSquare()\n*** Output ***\n" +
                "| 1 |  2 |  3 |  4 |\n" +
                "| 2 |  4 |  6 |  8 |\n" +
                "| 3 |  6 |  9 | 12 |\n" +
                "| 4 |  8 | 12 | 16 |";

        //: When
        String actual = square.tableSquare();

        //: Then
        Assert.assertEquals("Same string", expected, actual);
    }

    @Test
    public void tableSquareNumTest() {
        //: Given
        Shapes squareNum = new Shapes();
        String expected = "tableSquares(6)\n*** Output ***\n" +
                "| 1 |  2 |  3 |  4 |  5 |  6 |\n" +
                "| 2 |  4 |  6 |  8 | 10 | 12 |\n" +
                "| 3 |  6 |  9 | 12 | 15 | 18 |\n" +
                "| 4 |  8 | 12 | 16 | 20 | 24 |\n" +
                "| 5 | 10 | 15 | 20 | 25 | 30 |\n" +
                "| 6 | 12 | 18 | 24 | 30 | 36 |";
        //: When
        String actual = squareNum.tableSquares(6);

        //: Then
        Assert.assertEquals("Same string", expected, actual);
    }
}
