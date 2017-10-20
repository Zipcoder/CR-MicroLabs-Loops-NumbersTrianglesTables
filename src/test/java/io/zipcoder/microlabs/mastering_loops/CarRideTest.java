package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class CarRideTest {
    @Test
    public void areWeThereTest_InputIsYes_ShouldReturnTrue() {
        //: Given
        CarRide car = new CarRide();

        //: When
        boolean actual = car.areWeThere("Yes");

        //: Then
        Assert.assertTrue(actual);
    }

    @Test
    public void areWeThereTest_InputIsNotYes_ShouldReturnTrue() {
        //: Given
        CarRide car = new CarRide();

        //: When
        boolean actual1 = car.areWeThere("Spoon");
        boolean actual2 = car.areWeThere("No");

        //: Then
        Assert.assertFalse(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void returnYesAnswerTest() {
        //: Given
        CarRide car = new CarRide();
        String expected = "Good";
        //: When
        String actual = car.returnAnswer(car.areWeThere("Yes"));

        //: Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void returnOtherAnswerTest() {
        //: Given
        CarRide car = new CarRide();
        String expected = "Are we there yet?";
        //: When
        String actual = car.returnAnswer(car.areWeThere("Spoon"));

        //: Then
        Assert.assertEquals(expected,actual);
    }
}
