package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;
import java.time.Year;

public class InputClass {
    /*
    InputClass
     Print "What is your current age?"
     'currentAgeString' = read input from user
     Print "At what age would you like to retire?"
     'retirementAgeString' = read input from user
     'currentYear' = get current year
     */


    Scanner input = new Scanner(System.in);
    private String currentAgeString;
    private String retirementAgeString;
    private int currentYear = Year.now().getValue();

    public void currentAgeStringInput() {
        System.out.print("What is your current age? ");
        currentAgeString = input.nextLine();
    }

    public void retirementAgeStringInput() {
        System.out.print("At what age would you like to retire? ");
        retirementAgeString = input.nextLine();
    }

    public String getCurrentAgeString() {
        return currentAgeString;
    }

    public String getRetirementAgeString() {
        return retirementAgeString;
    }

    public int getCurrentYear() {
        return currentYear;
    }
}
