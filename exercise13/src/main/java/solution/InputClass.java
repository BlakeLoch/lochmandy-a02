package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class InputClass {
    /*
    method getPrincipalFromUser()
        print "What is the principal amount?"
        return user input
    method getInterestRateFromUser()
        print "What is the rate?"
        return user input
    method getNumberOfYearsFromUser()
        print "What is the number of years?"
        return user input

        method getCompoundsPerYearFromUser()
        print "What is the number of times the interest is compounded per year?"
        return user input
     */

    private static final Scanner input = new Scanner(System.in);

    public double getPrincipalFromUser() {
        System.out.print("What is the principal amount? ");
        return Double.parseDouble(input.nextLine());
    }


    public double getInterestRateFromUser() {
        System.out.print("What is the rate? ");
        return Double.parseDouble(input.nextLine());
    }

    public int getNumberOfYearsFromUser() {
        System.out.print("What is the number of years? ");
        return Integer.parseInt(input.nextLine());
    }

    public int getCompoundsPerYearFromUser() {
        System.out.print("What is the number of times the interest is compounded per year? ");
        return Integer.parseInt(input.nextLine());
    }
}
