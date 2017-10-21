package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class MainApplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarRide carRide = new CarRide();
        String input = "";
        String areWeThereYetReturn = "";

        while (!"Good!".equals (areWeThereYetReturn)){
            System.out.println("Are we there yet: ");
            input = scanner.nextLine();
            areWeThereYetReturn= carRide.areWeThereYet(input);}
        System.out.println(carRide.areWeThereYet(input));
    }
    }

