package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYet(Scanner scan){
        String question = "Are we there yet?";
        String response = "";
        String conversation = question;
        while(!"Yes".equals(response)) {
            response = scan.nextLine();
            conversation += "\n" + response;
            if ("Yes".equals(response)) {
                conversation += "\nGood!";
            } else {
                conversation += "\n" + question;
            }
        }
        return conversation;
    }



}
