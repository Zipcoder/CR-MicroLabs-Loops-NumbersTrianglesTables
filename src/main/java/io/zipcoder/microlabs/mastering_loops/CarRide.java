package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYet(){

        System.out.println("Are we there yet?");
        Scanner scan = new Scanner(System.in);

        String response = scan.nextLine();

        if("Yes".equals(response)){
            response = "Good";


        }return response;



    }
}
