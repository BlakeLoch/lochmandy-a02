/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class Solution21 {
  /*
   * 'monthNumber' = get input from user
   *
   * 'monthName' = chooseMonthName('monthNumber')
   *
   * printNameOfMonth(monthName)
   */

  public static void main(String[] args) {

    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    int monthNumber = userInput.getMonthNumberFromUser();

    String monthName = calculations.chooseMonthName(monthNumber);

    output.printNameOfMonth(monthName);

  }

}
