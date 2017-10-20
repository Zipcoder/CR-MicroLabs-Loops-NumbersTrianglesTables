package io.zipcoder.microlabs.mastering_loops;

//import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        CarRide carRide= new CarRide();
        Scanner scanner= new Scanner(System.in);
        String userInput;


        do{
            System.out.println("Are we there yet?...");
            userInput= scanner.next();
            carRide.areWeThereYetTest(userInput);
        }while(!userInput.equalsIgnoreCase("Yes"));
    }
}
