package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYet(String input){
        String output = "Are we there yet?";
        if("yes".equalsIgnoreCase(input)){
            output = "Good!";
        }

        return output;
    }

}
