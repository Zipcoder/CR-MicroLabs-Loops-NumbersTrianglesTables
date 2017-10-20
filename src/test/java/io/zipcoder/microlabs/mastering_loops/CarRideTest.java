package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void areWeThereYetTest(){
        //: Given
        CarRide carride = new CarRide();


        String yesExpected = "Good!";
        String noExpected = "Are we there yet?";
        String otherExpected = "Are we there yet?";

        //: When

        String yesActual = carride.areWeThereYet("Yes");
        String noActual = carride.areWeThereYet("No");
        String otherActual = carride.areWeThereYet("Spoon");

        //: Then
        Assert.assertEquals("Yes",yesExpected,yesActual);
        Assert.assertEquals("No",noExpected,noActual);
        Assert.assertEquals("Spoons",otherExpected,otherActual);
    }

}
