package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;


public class CarRideTest {

    @Test
    public void areWeThereYetTest(){
        CarRide notThere = new CarRide();
        boolean expected = false;

        boolean actual = notThere.areWeThereYet("Spoon");

        Assert.assertEquals ("The strings are equal", expected, actual);
    }

    @Test
    public void areWeThereYetTest2(){
        CarRide weHere = new CarRide();
        boolean expected = true;

        boolean actual = weHere.areWeThereYet("Yes");

        Assert.assertEquals("The strings are equal", expected, actual);
    }


}
