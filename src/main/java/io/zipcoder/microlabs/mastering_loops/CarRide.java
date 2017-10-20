package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {/*In the class CarRide, complete the class so that it returns
    that outputs "Are we there yet?" and then waits for input.
    If the input is "Yes" the program outputs "Good!" and exits,
    otherwise the program loops. The Unit Tests is not provided
    for you, you must complete it.*/

    public static void main(String[] args) {
        areWeThereYet();
    }

    public static void areWeThereYet() {//Prompt for input, then test it
        Scanner in = new Scanner(System.in);
        do
            System.out.print("Are we there yet? ");
        while (!"Good!".equals(testInput(in.nextLine())));
        System.out.println("Good!");
    }

    public static String testInput(String input)
    {//Compare input to YES and return true or false
        if ("Yes".equalsIgnoreCase(input))
            return "Good!";
        return "";
    }
}
