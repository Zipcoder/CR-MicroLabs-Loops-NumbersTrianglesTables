package io.zipcoder.microlabs.mastering_loops;

//import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        CarRide carRide= new CarRide();
        Scanner scanner= new Scanner(System.in);
        String userInput,carRideInput;


        do{
            System.out.println("Are we there yet?...");
             userInput= scanner.next();
             carRideInput= carRide.areWeThereYetTest(userInput);
        }while(carRideInput!= "yes");
    }
}
