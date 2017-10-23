package io.zipcoder.microlabs.mastering_loops;


import java.util.Scanner;

public class MainApplication {

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        CarRide myRide = new CarRide();
        String userInput="";
        String returnedString="";
        do {
            System.out.print("Are we there yet? ");
            userInput=in.nextLine();
        }while (! ("Yes".equals(userInput)));
        System.out.println(myRide.areWeThereYet(userInput));
    }
}
