package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYet(String input) {

        Scanner in=new Scanner(input);
        String line;
        do{
            System.out.println("Are we there yet?");
            line=in.nextLine();
            System.out.println(line);
        }while(!"yes".equalsIgnoreCase(line));

        System.out.println("Good!");

        return "Good!";
    }

}
