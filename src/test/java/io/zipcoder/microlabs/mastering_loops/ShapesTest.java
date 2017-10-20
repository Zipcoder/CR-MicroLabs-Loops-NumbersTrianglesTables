package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {



    @Test
    public void triangleTest(){
        //: Given
        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****";
        Shapes shape = new Shapes();
        //: When
        String actual = shape.triangle();
        //: Then
        Assert.assertEquals("These strings are not equal", expected, actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given
        String expected = "tableSquare()\n*** Output ***\n|  1 |  2 |  3 |  4 |\n|  2 |  4 |  6 |  8 |\n|  3 |  6 |  9 | 12 |\n|  4 |  8 | 12 | 16 |";
        Shapes shape = new Shapes();
        //: When
        String actual = shape.tableSquare();
        //: Then
        Assert.assertEquals("These strings are not equal", expected, actual);
    }
}
