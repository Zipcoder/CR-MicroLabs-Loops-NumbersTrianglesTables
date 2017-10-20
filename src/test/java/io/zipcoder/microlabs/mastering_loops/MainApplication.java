package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarRide carRide = new CarRide();
        String response = "";

        while(!"Good!".equals(response)){
            System.out.println("Are we there yet?");
            String arrive = scanner.nextLine();
            response = carRide.areWeThereYetTest(arrive);
        }
        System.out.println(response);
    }
}
