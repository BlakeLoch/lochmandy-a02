package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

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

        InputClass userInfo = new InputClass();

        userInfo.currentAgeStringInput();
        userInfo.retirementAgeStringInput();

        CalcClass calculations = new CalcClass();

        calculations.setYearsToRetire(userInfo.getCurrentAgeString(), userInfo.getRetirementAgeString());
        calculations.setRetirementYear(userInfo.getCurrentYear());

        OutputClass systemOut = new OutputClass();

        systemOut.yearsToRetirement(calculations.getYearsToRetire());
        systemOut.retireWhen(userInfo.getCurrentYear(), calculations.getRetirementYear());


    }

}