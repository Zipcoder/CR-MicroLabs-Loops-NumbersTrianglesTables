package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;


public class CarRideTest {

    @Test
    public void carRideTest() {
        //: Given
        CarRide carRide = new CarRide();

        String expected = "Good";

        //: When
        String actual = carRide.areWeThereYetTest("Yes");

        //: Then

        Assert.assertEquals("Yes", expected, actual);
    }


    @Test
    public void locationYesTest2(){
        //: Given
        CarRide carRide2 = new CarRide();

        String expected = "*** Output ***\nCarRide\nAre We There Yet?";

        //: When
        String actual = carRide2.areWeThereYetTest( "No");

        //: Then

        Assert.assertEquals("Are we there yet?",expected,actual);


        }
    }

