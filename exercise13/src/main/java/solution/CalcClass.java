/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class CalcClass {
  /*
   * method calcAmountAccrued('principal', 'interestRate', 'numberOfYears', 'compoundsPerYear')
   *   interestRate /= 100
   *   return 'principal' * (1 + 'interestRate' / 'compoundsPerYear') ^ ('compoundsPerYear' * 'numberOfYears') rounded up to 2 decimal places
   */

  public double calcAmountAccrued(double principal, double interestRate, int numberOfYears,
      int compoundsPerYear) {
    interestRate /= 100;
    double amountAccrued = (principal * Math.pow((1 + interestRate / compoundsPerYear),
        (compoundsPerYear * numberOfYears)));
    return Math.ceil(amountAccrued * 100) / 100;
  }
}
