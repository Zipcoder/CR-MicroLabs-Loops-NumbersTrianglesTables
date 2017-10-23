package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {/*In the class CarRide, complete the class so that it returns
    that outputs "Are we there yet?" and then waits for input.
    If the input is "Yes" the program outputs "Good!" and exits,
    otherwise the program loops. The Unit Tests is not provided
    for you, you must complete it.*/

    public static String areWeThereYet(String input) {//Prompt for input, then test it
        if ("Yes".equals(input)) {
            return ("Good!");
        }
        return "";
    }

}
