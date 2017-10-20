package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void areWeThereYetResponseTest() {

        //Given this is suppose to happen:
        CarRide carride = new CarRide();
        String userInput = "Yes";
        String expected = "Good!";


        // When it runs this is what happens:
        String actual = carride.areWeThereYet("Yes");

        //Then what actually happens:
        Assert.assertEquals(expected, actual);
    }
}