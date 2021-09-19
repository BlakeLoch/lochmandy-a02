/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class Solution10 {
  /*
   * Get 'price1' from user
   * Get 'quantity1' from user
   * Get 'price2' from user
   * Get 'quantity2' from user
   * Get 'price3' from user
   * Get 'quantity3' from user
   *
   * Calculate 'subtotal'
   * Calculate 'tax'
   * Calculate 'total'
   * Build 'subtotalOut' = "Subtotal: $'subtotal"
   * Build 'taxOut' = "Tax: $'tax"
   * Build 'totalOut' = "Total: $'total"
   *
   * Print 'subtotalOut'
   * Print 'taxOut'
   * Print 'totalOut'
   */


  public static void main(String[] args) {

    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    double price1 = userInput.getPriceFromUser(1);
    int quantity1 = userInput.getQuantityFromUser(1);
    double price2 = userInput.getPriceFromUser(2);
    int quantity2 = userInput.getQuantityFromUser(2);
    double price3 = userInput.getPriceFromUser(3);
    int quantity3 = userInput.getQuantityFromUser(3);

    double item1 = calculations.calcItem(price1, quantity1);
    double item2 = calculations.calcItem(price2, quantity2);
    double item3 = calculations.calcItem(price3, quantity3);

    double subtotal = calculations.calcSubtotal(item1, item2, item3);
    double tax = calculations.calcTax(subtotal);
    double total = calculations.calcTotal(subtotal, tax);

    String subtotalOut = calculations.buildSubtotalOut(subtotal);
    String taxOut = calculations.buildTaxOut(tax);
    String totalOut = calculations.buildTotalOut(total);

    output.printOutput(subtotalOut);
    output.printOutput(taxOut);
    output.printOutput(totalOut);
  }

}
