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

        //: When

        //: Then
    }
}
