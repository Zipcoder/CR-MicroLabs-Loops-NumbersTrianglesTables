package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {
    @Test
    public void areWeThereYet() {

        //: Given
        CarRide carRide = new CarRide();
        String expected1 = "Good!";

        //: When
        String actual1 = carRide.areWeThereYetTest("Yes");

        //: Then
        Assert.assertEquals("The two strings are equal", expected1, actual1);

    }

    @Test
    public void areWeThereYet2() {

        //: Given
        CarRide carRide = new CarRide();
        String expected2 = "No";

        //: When
        String actual2 = carRide.areWeThereYetTest("No");

        //: Then
        Assert.assertEquals("The two strings are equal", expected2, actual2);
    }
}