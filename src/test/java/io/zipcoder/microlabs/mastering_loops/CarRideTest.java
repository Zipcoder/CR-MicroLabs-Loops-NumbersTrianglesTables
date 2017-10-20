package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void areWeThereYetYesTest(){
        //: Given
        CarRide carride = new CarRide();
        String yesExpected = "Good!";

        //: When
        String yesActual = carride.areWeThereYet("Yes");

        //: Then
        Assert.assertEquals("Yes",yesExpected,yesActual);


    }
    @Test
    public void areWeThereYetNoTest(){
        //: Given
        CarRide carride = new CarRide();
        String noExpected = "Are we there yet?";


        //: When
        String noActual = carride.areWeThereYet("");


        //: Then
        Assert.assertEquals("No",noExpected,noActual);

    }

}
