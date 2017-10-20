package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYet(Scanner input) {
        //String input="No\nSpoons\nYes";

        //Scanner in=new Scanner(input);
        String line;
        do{
            System.out.println("Are we there yet?");
            line=input.nextLine();
        }while(!"yes".equalsIgnoreCase(line));

        return "Good!";
    }

}
