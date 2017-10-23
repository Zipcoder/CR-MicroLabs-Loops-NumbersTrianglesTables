package io.zipcoder.microlabs.mastering_loops;

import java.util.*;

public class CarRide {
    public String areWeThereYetTest(String userInput) {
        //if input is yes, program outputs "Good!"
        if ("yes".equals(userInput)) {
            return "Good!";
        }
        return "";
    }


    public void areWeThereYetTestt() {
        //prints out "Are we there yet?"
        String input = "";
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Are we there yet?");

            //takes in input
            input = in.nextLine();

            String response = areWeThereYetTest(input);

            System.out.println(response);
            //if input is something else, run the loop until you get the answer

        } while (!input.equals("yes"));

    }
}

