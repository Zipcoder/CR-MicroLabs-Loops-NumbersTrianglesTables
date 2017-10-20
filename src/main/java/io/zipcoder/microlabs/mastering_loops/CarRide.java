package io.zipcoder.microlabs.mastering_loops;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;


public class CarRide {

    public String areWeThereYet(String arrival) {

        System.out.println("Are we there yet?");

            if ("Yes".equalsIgnoreCase(arrival)) {
                return "Good!";
            }
            else return arrival;
    }
}
