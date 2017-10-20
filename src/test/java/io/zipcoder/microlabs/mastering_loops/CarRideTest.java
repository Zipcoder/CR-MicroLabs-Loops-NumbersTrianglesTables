package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;


public class CarRideTest {


    @Test
    public void areWeThereYet_YES_test() {
        // given
        CarRide carride = new CarRide();
        String expected = "Good";

        // when
        String actual = carride.areWeThereYet("Yes");

        // then
        Assert.assertEquals("Yes return check", expected, actual);
        }

    @Test
    public void areWeThereYet_REPEATTHEQUESTION_test() {
        // given
        CarRide carride = new CarRide();
        String expected = "Are we there yet?";

        // when
        String actual = carride.areWeThereYet("No" );
        String actual_alternate_case = carride.areWeThereYet("Spoon");


        // then
        Assert.assertEquals("Looping return check", expected, actual);
        Assert.assertEquals("Looping return check", expected, actual_alternate_case);
    }

}