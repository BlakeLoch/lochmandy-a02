package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class InputClass {
    /*
    method getPrincipalFromUser()
        print "Enter the principal:"
        return user input

    method getInterestRateFromUser()
        print "Enter the rate of interest:"
        return user input

    method getNumberOfYearsFromUser()
        print "Enter the number of years:"
        return user input
     */

    private static final Scanner input = new Scanner(System.in);

    public double getPrincipalFromUser() {
        System.out.print("Enter the principal: ");
        return Double.parseDouble(input.nextLine());
    }


    public double getInterestRateFromUser() {
        System.out.print("Enter the rate of interest: ");
        return Double.parseDouble(input.nextLine());
    }

    public int getNumberOfYearsFromUser() {
        System.out.print("Enter the number of years: ");
        return Integer.parseInt(input.nextLine());
    }
}