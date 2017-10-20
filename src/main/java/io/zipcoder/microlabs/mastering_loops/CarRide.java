package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYet(){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Are we there yet?");
        String answer = scanner.nextLine();
        while (answer != "Yes") {
            System.out.println(answer);
            System.out.println("Are we there yet?");
            answer = scanner.nextLine();
        }
        return "Good!";
    }

}
