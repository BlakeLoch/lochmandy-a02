package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class OutputClass {
    /*
    OutputClass
     print "You have 'yearsToRetire' years left until you can retire."
     print "It's 'currentYear', so you can retire in 'retirementYear'."
     */

    public void yearsToRetirement(int retirementYears) {
        System.out.println("You have " + retirementYears + " years left until you can retire.");
    }

    public void retireWhen(int yearNow, int yearRetire) {
        System.out.println("It's "+yearNow+", so you can retire in "+yearRetire+".");
    }
}
