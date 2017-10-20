package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {



    @Test
    public void triangleTest(){
        //: Given
        Shapes shapes = new Shapes();
        String expected = "*** Output ***\n*\n**\n***\n****\n*****";

        //: When
        String acutal = shapes.triangle();

        //: Then
        Assert.assertEquals(acutal, expected);
    }

    @Test
    public void tableSquareTest(){
        //: Given

        //: When

        //: Then
    }
}
