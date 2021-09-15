package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class Solution06 {

    /*
    InputClass
     Print "What is your current age?"
     'currentAgeString' = read input from user
     Print "At what age would you like to retire?"
     'retirementAgeString' = read input from user
     'currentYear' = get current year

     CalcClass
     'currentAge' = parse 'currentAgeString' as integer
     'retirementAge' = parse 'retirementAgeString' as integer
     'yearsToRetire' = 'retirementAge' - 'currentAge'
     'retirementYear' = 'currentYear' + 'yearsToRetire'

     OutputClass
     Print "You have 'yearsToRetire' years left until you can retire."
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