package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void areWeThereYetYesTest() {
             //:Given
        CarRide carRide = new CarRide();
        //String expected = "Are we there yet?\nNo\n\"Are we there yet?\nSpoons\nAre we there yet?\nYes\nGood!";
        String expected = "Good!";

        //:When
        String actual = carRide.areWeThereYet("yes");

        //:Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }
    @Test
    public void areWeThereYetNone_YesTest(){
        //:Given

        CarRide carRide = new CarRide();
        String expected = "Are we there yet?";

           //:when
        String actual = carRide.areWeThereYet("No");

        //: Then

        Assert.assertEquals("The two strings are equal", expected, actual);

    }
}
