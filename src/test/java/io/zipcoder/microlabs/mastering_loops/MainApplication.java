package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //String arrival;
        CarRide car = new CarRide();
        String response = "";


        while (!"Good!".equals(response)) {
            System.out.println("Are we there yet?");
            String arrival = sc.nextLine();
            response = car.areWeThereYet(arrival);
        }

        System.out.println(response);

    }

}
