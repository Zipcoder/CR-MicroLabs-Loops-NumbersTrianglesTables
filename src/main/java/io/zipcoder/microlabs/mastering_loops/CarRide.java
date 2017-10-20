package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYet(String answer) {

       while(!"Yes".equals(answer)){
           String reply = "Are we there yet?";
           return reply;

       }

       String user_said_yes = "Good!";
       return user_said_yes;



    }
}

