package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;


public class CarRideTest {
    @Test
     public void CarRideTest(){
        //: Given
        CarRide carRide = new CarRide();

        String expected = "Good";

        //: When
        String actual = carRide.areWeThereYetTest("yes");

        //: Then
        Assert.assertEquals( "yes", expected, actual);

    }

    @Test
    public void CarRideTest2(){
        //: Given
        CarRide carRide2 = new CarRide();

        String expected = "*** Output ***\nCarRide()\nAre We There Yet";

        //: When
        String actual = carRide2.areWeThereYetTest("no");

        //: Then
        Assert.assertEquals( "Are we there yet", expected, actual);

    }

}
