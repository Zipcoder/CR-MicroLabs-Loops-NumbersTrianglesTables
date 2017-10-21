package io.zipcoder.microlabs.mastering_loops;


import com.sun.tools.internal.ws.wsdl.document.Output;
import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {
    @Test
    public void CarRideTest_fail(){
        //: Given
        CarRide carRide = new CarRide();
        boolean expected = false;
        //: When
        boolean actual = carRide.isValid("No");
        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CarRideTest_pass() {
        //:Given
        CarRide carRide = new CarRide();
        boolean expected = true;
        //: When
        boolean actual = carRide.isValid("Yes");
        //: Then
        Assert.assertEquals(expected, actual);
    }
}
