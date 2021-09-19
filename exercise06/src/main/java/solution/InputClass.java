/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

import java.time.Year;
import java.util.Scanner;

public class InputClass {
  /*
   * 'currentYear' = get current year
   * method currentAgeStringInput()
   *   Print "What is your current age?"
   *   'currentAgeString' = read input from user
   * method retirementAgeStringInput()
   *   Print "At what age would you like to retire?"
   *   'retirementAgeString' = read input from user
   * method getCurrentAgeString()
   *   return 'currentAgeString'
   * method getRetirementAgeString()
   *   return 'retirementAgeString'
   * method getCurrentYear()
   *   return 'currentYear'
   */


  private final int currentYear = Year.now().getValue();
  Scanner input = new Scanner(System.in);
  private String currentAgeString;
  private String retirementAgeString;

  public void currentAgeStringInput() {
    System.out.print("What is your current age? ");
    currentAgeString = input.nextLine();
  }

  public void retirementAgeStringInput() {
    System.out.print("At what age would you like to retire? ");
    retirementAgeString = input.nextLine();
  }

  public String getCurrentAgeString() {
    return currentAgeString;
  }

  public String getRetirementAgeString() {
    return retirementAgeString;
  }

  public int getCurrentYear() {
    return currentYear;
  }
}
