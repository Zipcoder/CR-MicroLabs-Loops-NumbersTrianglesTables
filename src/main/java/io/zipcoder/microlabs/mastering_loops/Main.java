package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CarRide carRide = new CarRide();
        Scanner scanner = new Scanner(System.in);
        String response;

        System.out.println("Are we there yet?");
        do {
            String userInput = scanner.nextLine();
            response = carRide.areWeThereYetRide(userInput);
            System.out.println(response);
        } while(!"Good!".equals(response));

    }

}
