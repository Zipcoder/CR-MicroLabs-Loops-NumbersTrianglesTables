package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void areWeThereYetTestYes(){
        //: Given
        CarRide carride = new CarRide();
        String expected = "Good!";

        //: When
        String actual = carride.areWeThereYetTest("Yes");


        //: Then
        Assert.assertEquals("The method should return ", expected, actual);
    }

    @Test
    public void areWeThereYetTestOther(){
        //: Given
        CarRide carride = new CarRide();
        String expected = "";

        //: When
        String actual = carride.areWeThereYetTest("No");


        //: Then
        Assert.assertEquals("The method should return ", expected, actual);
    }

}

