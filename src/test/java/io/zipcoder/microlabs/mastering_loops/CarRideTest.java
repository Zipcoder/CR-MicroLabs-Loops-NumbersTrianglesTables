package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;


public class CarRideTest {
    @Test
    public void areWeThereYetInputNoTest_InputIsNo_ShouldEqualFalse() {
        //: Given
        CarRide carRide = new CarRide();
        Scanner scanner = new Scanner("No");

        //: When
        boolean actual = carRide.areWeThereYetInput(scanner);

        //: Then
        Assert.assertFalse(actual);

    }

    @Test
    public void areWeThereYetInputNoTest_InputIsYes_ShouldEqualTrue() {
        //: Given
        CarRide carRide = new CarRide();
        Scanner scanner = new Scanner("Yes");

        //: When
        boolean actual = carRide.areWeThereYetInput(scanner);

        //: Then
        Assert.assertTrue(actual);

    }

    @Test
    public void areWeThereYetRideTest_InputIsTrue_ShouldEqualGood(){
        //: Given
        CarRide carRide = new CarRide();
        boolean bool = true;
        String expected = "Good!";

        //: When
        String actual = carRide.areWeThereYetRide(bool);

        //: Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void areWeThereYetRideTest_InputIsNo_ShouldEqualLoopLoopGood(){
        //: Given
        CarRide carRide = new CarRide();
        Scanner scanner  = new Scanner("No");
        String expected = "Are we there yet?";

        //: When
        String actual = carRide.areWeThereYetRide(carRide.areWeThereYetInput(scanner));

        //: Then
        Assert.assertEquals(actual, expected);
    }
}
