/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class CalcClass {
  /*
   * method calcTax('orderAmount', 'state', 'county')
   *   if 'state' = Wisconsin
   *     'taxRate' = 0.05
   *     if 'county' = Eau Claire
   *       'taxRate' = 0.055
   *     if 'county' = Dunn
   *       'taxRate' = 0.054
   *   if 'state' = Illinois
   *     'taxRate' = 0.08
   *   else
   *     'taxRate' = 0.00
   *   return 'orderAmount' * 'taxRate' rounded up to 2 decimals
   * method calcTotal('orderAmount', 'tax')
   *   return 'orderAmount' + 'tax'
   * method buildOutputString('tax', 'total', 'state')
   *   If state = Wisconsin or illinois
   *     The tax is $'tax'
   *     The total is $'total'"
   *   else
   *     The total is $'total'"
   */

  public double calcTax(double orderAmount, String state, String county) {
    double taxRate = 0;
    if (state.equals("Wisconsin")) {
      taxRate = 0.05;
      if (county.equals("Eau Claire")) {
        taxRate += 0.005;
      } else if (county.equals("Dunn")) {
        taxRate += 0.004;
      }
    } else if (state.equals("Illinois")) {
      taxRate = 0.08;
    }

    return Math.ceil(orderAmount * taxRate * 100) / 100;
  }

  public double calcTotal(double orderAmount, double tax) {
    return orderAmount + tax;
  }

  public String buildOutputString(double tax, double total, String state) {
    if (state.equals("Wisconsin") || state.equals("Illinois")) {
      return "The tax is $" + String.format("%.2f", tax) + "\nThe total is $" + String.format(
          "%.2f", total);
    } else {
      return "The total is $" + String.format("%.2f", total);
    }
  }

}
