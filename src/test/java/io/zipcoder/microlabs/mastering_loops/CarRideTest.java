package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    //remember annotation and not returning anything
    //need two tests
    @Test
    public void areWeThereYetTest1() {
        //Given:
        CarRide carRide = new CarRide();
        String expectedYes = "Good!";

        //When:
        String actualYes = carRide.areWeThereYet("Yes");

        //Then:
        Assert.assertEquals("The strings are equal!", expectedYes, actualYes);
    }

    @Test
    public void areWeThereYetTest2() {
        //Given:
        CarRide carRide = new CarRide();
        String expectedNo = "No";
        String expectedOther = "Spoon";

        //When:
        String actualNo = carRide.areWeThereYet("No");
        String actualOther = carRide.areWeThereYet("Spoon");

        //Then:
        Assert.assertEquals("The strings are equal!", expectedNo, actualNo);
        Assert.assertEquals("The strings are equal", expectedOther, actualOther);
    }
}