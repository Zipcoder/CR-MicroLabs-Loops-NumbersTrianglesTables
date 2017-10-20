package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;
import java.util.Scanner;

public class CarRideTest {

    @Test
    public void areWeThereYetTest(){

        //Given
        CarRide carRide = new CarRide();
        Scanner in = new Scanner("No\nSpoons\nYes");
        String expected = "Good!";

        //When
        String actual1 = carRide.areWeThereYet(in);

        //Then
        Assert.assertEquals("The strings are equal", expected, actual1);

    }


}
