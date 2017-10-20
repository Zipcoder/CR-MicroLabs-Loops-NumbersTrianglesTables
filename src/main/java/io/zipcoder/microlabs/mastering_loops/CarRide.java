package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {


    public String areWeThereYet(Scanner scan){
        String question = "Are we there yet?";
        String response = "";
        do {
            response = scan.nextLine();
            System.out.println(question);
        } while(!"Yes".equals(response));

        return "Good!";
    }




}
