package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void areWeThereYetTest(){

        //: Given
        CarRide Ride = new CarRide();


        String yesExpected = "Good!";
        String noExpected = "Are we there yet?";
        String otherExpected = "Are we there yet?";

        //: When
        String yesActual = Ride.areWeThereYet("yes");
        String noActual = Ride.areWeThereYet("no");
        String otherActual = Ride.areWeThereYet("spoon");


        //: Then
        Assert.assertEquals("Yes answer", yesExpected, yesActual);
        Assert.assertEquals("no answer",noExpected,noActual);
        Assert.assertEquals("other answer",otherExpected,otherActual);
    }


}
