package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {
    @Test
    public void areWeThereTest_InputIsYes_ShouldReturnTrue() {
        //: Given
        CarRide car = new CarRide();

        //: When
        boolean actual = car.areWeThere("Yes");

        //: Then
        Assert.assertTrue(actual);
    }

    @Test
    public void areWeThereTest_InputIsNotYes_ShouldReturnTrue() {
        //: Given
        CarRide car = new CarRide();

        //: When
        boolean actual2 = car.areWeThere("adlf");

        //: Then
        Assert.assertFalse(actual2);
    }
}
