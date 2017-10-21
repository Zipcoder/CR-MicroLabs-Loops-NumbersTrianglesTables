package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class MainApplication_CarRide {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CarRide ride = new CarRide();

        System.out.println("Are we there yet?");
        String answer = null;

        do{
            String input = scan.nextLine();

            answer = ride.areWeThereYet(input);

            System.out.println(answer);

        } while(!"Good!".equals(answer));


    }



}
