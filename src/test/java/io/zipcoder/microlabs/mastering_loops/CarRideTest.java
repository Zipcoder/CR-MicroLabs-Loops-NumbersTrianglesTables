package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;


public class CarRideTest {

    @Test
    public void areWeThereYetRideTest_InputIsTrue_ShouldEqualGood(){
        //: Given
        CarRide carRide = new CarRide();
        String expected = "Good!";

        //: When
        String actual = carRide.areWeThereYetRide("Yes");

        //: Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void areWeThereYetRideTest_InputIsNo_ShouldEqualLoopLoopGood(){
        //: Given
        CarRide carRide = new CarRide();
        String expected = "Are we there yet?";

        //: When
        String actual = carRide.areWeThereYetRide("No");

        //: Then
        Assert.assertEquals(actual, expected);
    }
}
