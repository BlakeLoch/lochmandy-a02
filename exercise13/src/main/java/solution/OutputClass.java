/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class OutputClass {
  /*
   * method printOutputString('principal', 'interestRate', 'numberOfYears', 'compoundsPerYear', 'amountAccrued')
   *   "$'principal' invested at 'interestRate'% for 'numberOfYears' years compounded 'compoundsPerYear' times per year is $'amountAccrued'."
   */

  public void printOutputString(double principal, double interestRate, int numberOfYears,
      int compoundsPerYear, double amountAccrued) {
    System.out.println(
        "$" + String.format("%.2f", principal) + " invested at " + interestRate + "% for "
            + numberOfYears + " years compounded " + compoundsPerYear + " times per year is $"
            + String.format("%.2f", amountAccrued) + ".");
  }
}