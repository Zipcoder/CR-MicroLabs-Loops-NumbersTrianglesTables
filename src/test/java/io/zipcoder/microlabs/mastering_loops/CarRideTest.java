package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;


public class CarRideTest {

    @Test
    public void areWeThereYetTestYes() {
        //given
        CarRide car = new CarRide();
        String expected = "Good!";
        //when
        String actual = car.areWeThereYetTest("yes");
        //then
        Assert.assertEquals("The two strings equals", expected, actual);
    }
    @Test
    public void areWeThereYetTestOther() {
        //given
        CarRide car = new CarRide();
        String expected = "";
        //when
        String actual = car.areWeThereYetTest("no");
        //then
        Assert.assertEquals("The two strings equals", expected, actual);
    }
}
