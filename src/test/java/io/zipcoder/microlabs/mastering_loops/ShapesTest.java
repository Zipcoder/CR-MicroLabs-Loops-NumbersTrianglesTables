package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {

    Shapes shape = new Shapes();

    @Test
    public void triangleTest(){
        //: Given
        String expected = "***Output***\n*\n**\n***\n****\n*****\n";

        //: When
        String actual = shape.triangle();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tableSquareTest() {
        //: Given
        String expected = "***Output***\n" +
                "|  1 |  2 |  3 |  4 |\n" +
                "|  2 |  4 |  6 |  8 |\n" +
                "|  3 |  6 |  9 | 12 |\n" +
                "|  4 |  8 | 12 | 16 |";

        String actual = shape.tableSquare();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tableSquaresTest(){
        String expected = "***Output***\n" +
                "|  1 |  2 |  3 |  4 |\n" +
                "|  2 |  4 |  6 |  8 |\n" +
                "|  3 |  6 |  9 | 12 |\n" +
                "|  4 |  8 | 12 | 16 |";

        String actual = shape.tableSquares(4);
        Assert.assertEquals(expected, actual);
    }
}
