package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {
    @Test
    public void areWeThereYet() {

        //: Given
        CarRide carRide = new CarRide();
        String expected1 = "No";
        String expected2 = "Spoons";
        String expected3 = "Good!";

        //: When
        String actual1 = carRide.areWeThereYetTest("No");
        String actual2 = carRide.areWeThereYetTest("Spoons");
        String actual3 = carRide.areWeThereYetTest("Yes");

        //: Then
        Assert.assertEquals("The strings are equal", expected1, actual1);
        Assert.assertEquals("The strings are equal", expected2, actual2);
        Assert.assertEquals("The strings are equal", expected3, actual3);
    }

}
