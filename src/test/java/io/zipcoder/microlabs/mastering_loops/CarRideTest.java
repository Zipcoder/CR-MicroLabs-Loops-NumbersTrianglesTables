package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;


public class CarRideTest {
    CarRide carRide = new CarRide();
    String userInput;
    String expected;
    String actual;

    @Test
    public void areWeThereYetTestPass(){
        //: Given
        userInput = "yes";
        expected = "Good";

        //: When
        actual = carRide.areWeThereYet(userInput);

        //: Then
        Assert.assertEquals("the strings match", expected, actual);
    }

    @Test
    public void areWeThereYetTestFail(){
        //: Given
        userInput = "No";
        expected = "Are we there yet?";

        //: When
        actual = carRide.areWeThereYet(userInput);

        //: Then
        Assert.assertEquals("the strings match", expected, actual);
    }

}
