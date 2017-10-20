package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void areWeThereYetTest_Fail() {
        CarRide carRide = new CarRide();
        boolean expected = false;
        boolean actual = carRide.areWeThereYet("No");
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void areWeThereYetTest_Success() {
        CarRide carRide = new CarRide();
        boolean expected = true;
        boolean actual = carRide.areWeThereYet("Yes");
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

}
