package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class CarRideTest {

    @Test
    public void areWeThereYetTest(){
        //: Given
        CarRide testCarRide = new CarRide();
        String input = "No\nSpoons\nYes";
        Scanner testScan = new Scanner(input);
        String expected = "Good!";

        //: When
        String actual = testCarRide.areWeThereYet(testScan);

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }



}
