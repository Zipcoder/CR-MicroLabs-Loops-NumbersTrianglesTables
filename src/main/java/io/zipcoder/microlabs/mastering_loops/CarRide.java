package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYetRide(boolean areWeThereYetInput){

        do {

            if (areWeThereYetInput){

                return "Good!";

            } else {return "Are we there yet?";}

        } while (!areWeThereYetInput);

    }

    boolean areWeThereYetInput(Scanner input){
        String answer = input.nextLine();
        return "Yes".equalsIgnoreCase(answer);
    }

}
