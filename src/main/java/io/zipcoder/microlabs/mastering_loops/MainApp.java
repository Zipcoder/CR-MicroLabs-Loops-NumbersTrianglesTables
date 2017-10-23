package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarRide carRide = new CarRide();
        String userInput;

        do {
            System.out.println("Are we there yet?");
            userInput = scanner.nextLine();
            String response = carRide.areWeThereYet(userInput);
            System.out.println(response);
        } while(!"Yes".equals(userInput));
    }
}
