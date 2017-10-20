package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public static void main(String[] args) {
        CarRide car = new CarRide();
        Scanner sc = new Scanner(System.in);
        String answer = null;

        do {
            System.out.println("Are we there yet?");
            answer = sc.next();

        } while (!car.areWeThere(answer));

        System.out.println(returnAnswer(car.areWeThere(answer)));
    }

    public static boolean areWeThere(String input) {
        return "Yes".equals(input);
    }

    public static String returnAnswer(boolean input) {
        return input ? "Good" : "Are we there yet?";
    }
}
