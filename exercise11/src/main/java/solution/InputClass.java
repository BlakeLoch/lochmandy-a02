/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

import java.util.Scanner;

public class InputClass {
  /*
   * method GetEuroAmount
   *   print "How many euros are you exchanging?"
   *   return user input
   * method GetExchangeRate
   *   print "What is the exchange rate?"
   *   return user input
   */

  private static final Scanner input = new Scanner(System.in);

  public double getEuroAmount() {
    System.out.print("How many euros are you exchanging? ");
    return Double.parseDouble(input.nextLine());
  }

  public double getExchangeRate() {
    System.out.print("What is the exchange rate? ");
    return Double.parseDouble(input.nextLine());
  }
}
