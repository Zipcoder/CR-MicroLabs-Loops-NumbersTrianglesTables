package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;


public class CarRideTest {

    @Test
    public void thereYetTest() {

        // Given
        CarRide carRide = new CarRide();
        String expected = "Good!";

        //When
        String actual = carRide.thereYet("Yes");

        //Then
        Assert.assertEquals(expected, actual);

    }


    }

