package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    CarRide ride = new CarRide();

    @Test
    public void areWeThereYetTest(){
        String expected = "Good!";
        String actual = ride.areWeThereYet();
        Assert.assertEquals(expected, actual );

    }
}


