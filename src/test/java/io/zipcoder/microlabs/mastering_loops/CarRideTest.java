package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void testInputTest() {
        // Given
        String userInput = "Yes";
        String expected = "Good!";
        CarRide carRide = new CarRide();

        // When
        String actual = carRide.testInput(userInput);

        // Then
        Assert.assertEquals("The strings are not the same",expected, actual);
    }
    /*
    @Test
    public void testInputTest()
    {/* Tested method returns true if passed "Yes", otherwise false. /
        //: Given
        boolean inputYes = true;
        String stringYes = "Yes";

        //: When
        boolean returnedYes = CarRide.testInput(stringYes);

        //: Then
        Assert.assertTrue("Other was input", returnedYes);
    }
*/

}
