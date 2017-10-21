package io.zipcoder.microlabs.mastering_loops;

public class CarRideTest {

    public String testAreWeThereYet1(String userInput) {
        CarRide carRide = new CarRide();
        "yes".equals(carRide.areWeThereYet(userInput));
            return  "Good";

    }

    public String testAreWeThereYet2(String userInput) {
        CarRide carRide = new CarRide();

        if (!"Yes".equals(carRide.areWeThereYet(userInput)));

            return "Are we there yet?";


    }
}
