/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class Solution12 {
  /*
   * 'principal' = get user input
   * 'interestRate' = get user input
   * 'numberOfYears' = get user input
   *
   * 'amountAccrued' = calcAmountAccrued('principal', 'interestRate', 'numberOfYears')
   *
   * print "After 'numberOfYears' years at 'interestRate'%, the investment will be worth $'amountAccrued'."
   */

  public static void main(String[] args) {
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    double principal = userInput.getPrincipalFromUser();
    double interestRate = userInput.getInterestRateFromUser();
    int numberOfYears = userInput.getNumberOfYearsFromUser();

    double amountAccrued = calculations.calcAmountAccrued(principal, interestRate, numberOfYears);

    output.printOutputStatement(numberOfYears, interestRate, amountAccrued);
  }

}