/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

import java.util.Scanner;

public class InputClass {
  /*
   * method getMonthNumberFromUser()
   *   print "Please enter the number of the month:"
   *   'month' = get user input
   *   Loop until integer (Error message: "Enter a number between 1 and 12")
   *   Correct for numbers not between 1 and 12
   *     'month' = abs ('month') % 12
   *     'month' = if 'month' % 12 = 0, change it to 12
   *   return 'month'
   */

  private static final Scanner input = new Scanner(System.in);

  public int getMonthNumberFromUser() {
    System.out.print("Please enter the number of the month: ");

    int month;
    while (!input.hasNextInt()) {
      System.out.println("Please enter a number between 1 and 12");
      input.nextLine();
    }
    month = Integer.parseInt(input.nextLine());
    month = Math.abs(month) % 12;
    month = (month == 0) ? 12 : month;
    return month;
  }

}
