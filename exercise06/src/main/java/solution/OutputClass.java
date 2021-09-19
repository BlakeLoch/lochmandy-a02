/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class OutputClass {
  /*
   * method yearsToRetirement('yearsToRetire')
   *   print "You have 'yearsToRetire' years left until you can retire."
   * method retireWhen('currentYear', 'retirementYear')
   *   print "It's 'currentYear', so you can retire in 'retirementYear'."
   */

  public void yearsToRetirement(int yearsToRetire) {
    System.out.println("You have " + yearsToRetire + " years left until you can retire.");
  }

  public void retireWhen(int currentYear, int retirementYear) {
    System.out.println("It's " + currentYear + ", so you can retire in " + retirementYear + ".");
  }
}
