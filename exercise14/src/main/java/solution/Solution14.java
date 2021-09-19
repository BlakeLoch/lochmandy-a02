/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class Solution14 {
  /*
   * 'orderAmount' = get input from user
   * 'state' = get input from user
   *
   * 'tax' = calcTax('orderAmount')
   * 'total' = calcTotal('orderAmount', 'tax')
   * 'outputString' = buildOutputString('orderAmount', 'tax', 'total', 'state')
   *
   * print 'outputString'
   */

  public static void main(String[] args) {
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    double orderAmount = userInput.getOrderAmountFromUser();
    String state = userInput.getStateFromUser();

    double tax = calculations.calcTax(orderAmount);
    double total = calculations.calcTotal(orderAmount, tax);
    String outputString = calculations.buildOutputStatement(orderAmount, tax, total, state);

    output.printOutputString(outputString);

  }

}