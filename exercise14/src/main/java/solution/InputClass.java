/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

import java.util.Scanner;

public class InputClass {
  /*
   * method getOrderAmountFromUser()
   *   print "What is the order amount?"
   *   return user input
   * method getStateFromUser
   *   print "What is the state?"
   *   return user input
   */

  private static final Scanner input = new Scanner(System.in);

  public double getOrderAmountFromUser() {
    System.out.print("What is the order amount? ");
    return Double.parseDouble(input.nextLine());
  }

  public String getStateFromUser() {
    System.out.print("What is the state? ");
    return input.nextLine();
  }
}
