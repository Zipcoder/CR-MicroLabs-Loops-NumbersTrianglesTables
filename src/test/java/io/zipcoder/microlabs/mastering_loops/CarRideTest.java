package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {
    @Test
    public  void areWeThereYetTestYes(){
        CarRide carRide= new CarRide();
        String expected= "Good";
        String actual= carRide.areWeThereYetTest("Yes");
        Assert.assertEquals("Sucess",expected,actual);
    }
    @Test
    public  void areWeThereYetTestNo(){
        CarRide carRide= new CarRide();
        String expected= "";
        String actual= carRide.areWeThereYetTest("");
        Assert.assertEquals("Sucess",expected,actual);
    }
}
