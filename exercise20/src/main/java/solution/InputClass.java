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
   * method getLocationFromUser(location)
   *   print "What 'location' do you live in?"
   *   return user input
   */

  private static final Scanner input = new Scanner(System.in);

  public double getOrderAmountFromUser() {
    System.out.print("What is the order amount? ");
    return Double.parseDouble(input.nextLine());
  }

  public String getStateFromUser() {
    System.out.print("What state do you live in? ");
    return input.nextLine();
  }

  public String getCountyFromUser(String state) {
    if (state.equals("Wisconsin")) {
      System.out.print("What county do you live in? ");
      return input.nextLine();
    } else {
      return "";
    }
  }

}


