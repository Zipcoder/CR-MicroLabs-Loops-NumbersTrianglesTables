package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;


public class CarRideTest {


    @Test
    public void areWeThereYet_YES_test() {
        // given
        CarRide carride = new CarRide();
        String expected = "Good";

        // when
        String actual = carride.areWeThereYet();

        // then
        Assert.assertEquals("Yes return works!", expected, actual);
        }
}