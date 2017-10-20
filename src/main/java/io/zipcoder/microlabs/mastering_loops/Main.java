package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner in =new Scanner(System.in);

        Numbers nums=new Numbers();
        Shapes shapes=new Shapes();
        CarRide rides=new CarRide();

        System.out.println(nums.oneToTen());
        System.out.println(nums.oddNumbers());
        System.out.println(nums.squares());
        System.out.println(nums.random4());
        System.out.println(nums.even(20));
        System.out.println(nums.powers(8));
        System.out.println(shapes.triangle());
        System.out.println(shapes.tableSquare());
        System.out.println(shapes.tableSquares(6));
        System.out.println(rides.areWeThereYet(in));


    }
}
