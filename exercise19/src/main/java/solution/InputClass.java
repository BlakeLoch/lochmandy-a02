package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class InputClass {
    /*
    method getHeightFromUser()
        print "Enter your height (in):"
            while input is not an integer
            print "Please enter a number!"
            get user input
        return user input

        method getWeightFromUser()
        print "Enter your weight (lbs):"
            while input is not a double
            print "Please enter a number!"
            get user input
        return user input
     */

    private static final Scanner input = new Scanner(System.in);


    public int getHeightFromUser() {
        System.out.print("Enter your height (in): ");
        while (!input.hasNextInt()) {
            System.out.println("Please enter a number!");
            System.out.print("Enter your height (in): ");
            input.nextLine();
        }
        return Integer.parseInt(input.nextLine());

    }

    public double getWeightFromUser() {
        System.out.print("Enter your weight (lbs): ");
        while (!input.hasNextDouble()) {
            System.out.println("Please enter a number!");
            System.out.print("Enter your weight (lbs): ");
            input.nextLine();
        }
        return Double.parseDouble(input.nextLine());
    }
}
