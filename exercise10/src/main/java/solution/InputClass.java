/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

import java.util.Scanner;

public class InputClass {
  /*
   * method getPriceFromUser(int itemNumber)
   *   print "Enter the price of item 'itemNumber':"
   *   'itemPrice' = get input from user
   * method getQuantityFromUser(int itemNumber)
   *   print "Enter the quantity of item 'itemNumber':"
   *   'itemQuantity' = get input from user
   */

  private static final Scanner input = new Scanner(System.in);

  public double getPriceFromUser(int itemNumber) {
    System.out.print("Enter the price of item " + itemNumber + ": ");
    return Double.parseDouble(input.nextLine());
  }

  public int getQuantityFromUser(int itemNumber) {
    System.out.print("Enter the quantity of item " + itemNumber + ": ");
    return Integer.parseInt(input.nextLine());
  }

}
