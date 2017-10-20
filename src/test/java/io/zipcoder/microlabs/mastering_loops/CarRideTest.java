package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {


    @Test
    public void areWeThereYetTest() {
        //: Given
        CarRide carRide = new CarRide();
        String expected = "Good!";

        //: When
        String actual = carRide.areWeThereYetTest("Yes");

        //: Then
        Assert.assertEquals(expected, actual);

    }


}
