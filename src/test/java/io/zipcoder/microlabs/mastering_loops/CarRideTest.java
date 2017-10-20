package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;


public class CarRideTest {
    @Test
    public void areWeThereYetNoTest_InputIsNo_ShouldEqualFalse() {
        //: Given
        CarRide carRide = new CarRide();
        String input = "No";

        //: When
        boolean actual = carRide.areWeThereYet(input);

        //: Then
        Assert.assertFalse(actual);

    }

    @Test
    public void areWeThereYetNoTest_InputIsYes_ShouldEqualTrue() {
        //: Given
        CarRide carRide = new CarRide();
        String input = "Yes";

        //: When
        boolean actual = carRide.areWeThereYet(input);

        //: Then
        Assert.assertTrue(actual);

    }
}
