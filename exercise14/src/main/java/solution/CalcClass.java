/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class CalcClass {
  /*
   * method calcTax('orderAmount')
   *   return 'orderAmount' * 'TAX_RATE' rounded up to 2 decimal places
   * method calcTotal('orderAmount', 'tax')
   *   return 'orderAmount' + 'tax'
   * method buildOutputStatement('orderAmount', 'tax', 'total', 'state')
   *   create 'string'
   *   if 'state' = WI
   *     add to 'string' "The subtotal is 'orderAmount' \n The tax is 'tax'
   *     add to 'string' "The total is "+('total' (if wisconsin) or  'orderAmount' (if not))
   *  return 'string'
    */

  private static final double TAX_RATE = 0.055;

  public double calcTax(double orderAmount) {
    double tax = (int) (orderAmount * TAX_RATE * 10000) / 100.0;
    return Math.ceil(tax) / 100;
  }

  public double calcTotal(double orderAmount, double tax) {
    return orderAmount + tax;
  }

  public String buildOutputStatement(double orderAmount, double tax, double total, String state) {
    String string = "";
    double finalTotal = orderAmount;
    if (state.equals("WI")) {
      string += "The subtotal is $" + String.format("%.2f", orderAmount) + "\nThe tax is $"
          + String.format("%.2f", tax);
      finalTotal = total;
    }
    string += "\n The total is $" + String.format("%.2f", finalTotal);

    return string;
  }
}
