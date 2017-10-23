package io.zipcoder.microlabs.mastering_loops;
import java.util.Scanner;

public class CarRide {
    public String areWeThereYetTest(String valueExpected){
        //return the output "Are we there yet?"
        //Wait for input
        //if input is "Yes" the program outputs "Good!" exits
        //otherwise the program loops

        if ("Yes".equals(valueExpected)){
            return "Good!";
        }
        return "";
    }

    public String areWeThereYetTestt() {
        Scanner scanner = new Scanner (System.in);
        CarRide carride = new CarRide();
        String userInput = "";
        String good = "Good!";

        do {
            System.out.println("Are we there yet?");
            userInput = scanner.nextLine();
            carride.areWeThereYetTest(userInput);
        } while (!userInput.equalsIgnoreCase("Yes"));

        return good;
    }

}
