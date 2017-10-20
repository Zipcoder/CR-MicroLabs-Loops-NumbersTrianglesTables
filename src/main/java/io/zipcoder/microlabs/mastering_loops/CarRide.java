package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {
    /*
    public String areWeThereYetFull() {
        String prompt = "Are we there yet?";
        String answer;
        String output = "";
        boolean there = false;

        Scanner keyboard = new Scanner(System.in);

        do{
            System.out.print(prompt);
            answer = keyboard.nextLine();
            output += prompt + "\n" + answer;
            if("Yes".equalsIgnoreCase(answer)) {
                there = true;
            }
        }while(there == false);
        return output;
    }
    */

    public boolean areWeThereYet(String str) {
        boolean valid = false;
        if ("Yes".equalsIgnoreCase(str)) {
            valid = true;
        }
        return valid;
    }

}
