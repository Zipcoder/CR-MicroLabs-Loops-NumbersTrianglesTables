package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void areWeThereYetTestYes() {
        //: Given
        CarRide Ride = new CarRide();

        String expected = "Good!";

        //: When
        String actual = Ride.areWeThereYet("yes");

        //: Then
        Assert.assertEquals("Yes answer", expected, actual);

    }

    @Test
    public void areWeThereYetTestOther() {

        //: Given
        CarRide Ride = new CarRide();
        String expected = "Are we there yet?";

        //: When

        String actual = Ride.areWeThereYet("");

        //: Then
        Assert.assertEquals("other answer", expected, actual);
    }


}
