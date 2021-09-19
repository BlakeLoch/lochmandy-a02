package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class Solution13 {
    /*
    'principal' = get user input
    'interestRate' = get user input
    'numberOfYears' = get user input
    'compoundsPerYear' = get user input
    'amountAccrued' = calcAmountAccrued('principal', 'interestRate', 'numberOfYears', 'compoundsPerYear')
     print "$'principal' invested at 'interestRate'% for 'numberOfYears' years compounded 'compoundsPerYear' times per year is $'amountAccrued'."
     */

    public static void main(String[] args) {
        InputClass userInput = new InputClass();
        CalcClass calculations = new CalcClass();
        OutputClass output = new OutputClass();

        double principal = userInput.getPrincipalFromUser();
        double interestRate = userInput.getInterestRateFromUser();
        int numberOfYears = userInput.getNumberOfYearsFromUser();
        int compoundsPerYear = userInput.getCompoundsPerYearFromUser();

        double amountAccrued = calculations.calcAmountAccrued(principal, interestRate, numberOfYears, compoundsPerYear);

        output.printOutputString(principal, interestRate, numberOfYears, compoundsPerYear, amountAccrued);
    }

}