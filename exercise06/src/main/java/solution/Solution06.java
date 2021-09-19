/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class Solution06 {
  /*
   * Get 'currentAgeString' from user
   * Get 'currentAgeString' from user
   *
   * Calculate 'yearsToRetire'
   * Calculate 'retirementYear'
   *
   * Print "You have 'yearsToRetire' years left until you can retire."
   * Print "It's 'currentYear', so you can retire in 'retirementYear'."
   */

  public static void main(String[] args) {

    InputClass userInfo = new InputClass();

    userInfo.currentAgeStringInput();
    userInfo.retirementAgeStringInput();

    CalcClass calculations = new CalcClass();

    calculations.setYearsToRetire(userInfo.getCurrentAgeString(),
        userInfo.getRetirementAgeString());
    calculations.setRetirementYear(userInfo.getCurrentYear());

    OutputClass output = new OutputClass();

    output.yearsToRetirement(calculations.getYearsToRetire());
    output.retireWhen(userInfo.getCurrentYear(), calculations.getRetirementYear());

  }

}