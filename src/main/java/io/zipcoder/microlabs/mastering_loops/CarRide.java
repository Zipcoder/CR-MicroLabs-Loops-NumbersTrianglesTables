package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public boolean areWeThere(String input) {
        return "Yes".equals(input);
    }

    public String returnAnswer(boolean input) {
        return input ? "Good" : "Are we there yet?";
    }
}
