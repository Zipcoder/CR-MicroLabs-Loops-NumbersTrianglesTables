package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;
import sun.misc.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class CarRideTest {

    @Test
    public void areWeThereYetTest(){
        //: Given
        CarRide carRide = new CarRide();
        String expected = "Good!";



        String input = "Yes";
        InputStream in = new ByteArrayInputStream(input.getBytes());


        String myString = IOUtils.toString(in, "UTF-8");
        System.setIn(myString);


        //: When
        String actual = carRide.areWeThereYet();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

}
