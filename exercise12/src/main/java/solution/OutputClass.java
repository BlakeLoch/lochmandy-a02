package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class OutputClass {
    /*
    method printOutputStatement(numberOfYears, interestRate, amountAccrued)
        print "After 'numberOfYears' years at 'interestRate'%, the investment will be worth $'amountAccrued'."
     */

    public void printOutputStatement(int numberOfYears, double interestRate, double amountAccrued) {
        System.out.println("After "+numberOfYears+" years at "+interestRate+"%, the investment will be worth $"+String.format("%.2f", amountAccrued)+".");
    }
}