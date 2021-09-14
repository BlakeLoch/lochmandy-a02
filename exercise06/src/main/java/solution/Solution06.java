package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;
import java.time.Year;

public class Solution06 {

    /*

     Print "What is your current age?"
     'currentAgeString' = read input from user
     Print "At what age would you like to retire?"
     'retirementAgeString' = read input from user
     'currentAge' = parse 'currentAgeString' as integer
     'retirementAge' = parse 'retirementAgeString' as integer
     'yearsToRetire' = 'retirementAge' - 'currentAge'
     Print "You have 'yearsToRetire' years left until you can retire."
     'currentYear' = get current year
     'retirementYear' = 'currentYear' + 'yearsToRetire'
     print "It's 'currentYear', so you can retire in 'retirementYear'."
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String currentAgeString = input.nextLine();
        System.out.print("At what age would you like to retire? ");
        String retirementAgeString = input.nextLine();

        int currentAge = Integer.parseInt(currentAgeString);
        int retirementAge = Integer.parseInt(retirementAgeString);

        int yearsToRetire = retirementAge - currentAge;

        System.out.println("You have "+yearsToRetire+" years left until you can retire.");

        int currentYear = Year.now().getValue();
        int retirementYear = currentYear + yearsToRetire;

        System.out.println("It's "+currentYear+", so you can retire in "+retirementYear+".");



    }

}