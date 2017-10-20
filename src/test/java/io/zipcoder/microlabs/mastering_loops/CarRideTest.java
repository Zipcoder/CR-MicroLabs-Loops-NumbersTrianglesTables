package io.zipcoder.microlabs.mastering_loops;


import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void AreWeThereYetTest_Fail() {
        //: Given
        CarRide carRide = new CarRide();
        boolean expected = false;

        //: When
        boolean actual = carRide.areWeThereYet("No");

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AreWeThereYetTest_Pass() {
        //: Given
        CarRide carRide = new CarRide();
        boolean expected = true;

        //: When
        boolean actual = carRide.areWeThereYet("Yes");

        //: Then
        Assert.assertEquals(expected, actual);
    }
}
