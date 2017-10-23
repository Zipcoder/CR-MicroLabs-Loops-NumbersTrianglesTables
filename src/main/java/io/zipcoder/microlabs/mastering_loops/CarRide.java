package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYet(String answer){
        if("Yes".equalsIgnoreCase(answer)) {
            return "Good";
        }
        return "Are we there yet?";
    }
}
