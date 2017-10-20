package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void areWeThereYetTest(){

        //Given
        CarRide carRide = new CarRide();
        String expected1 = "Good!";
        //String expected2 = "Spoons";
        //String expected3 = "Good!";

        //When
        String actual1 = carRide.areWeThereYet("No\nSpoons\nYes");
        //String actual2 = carRide.areWeThereYet("Spoons");
        //String actual3 = carRide.areWeThereYet("Yes");

        //Then
        Assert.assertEquals("The strings are equal", expected1, actual1);
        //Assert.assertEquals("The strings are equal", expected2, actual2);
        //Assert.assertEquals("The strings are equal", expected3, actual3);
    }


}
