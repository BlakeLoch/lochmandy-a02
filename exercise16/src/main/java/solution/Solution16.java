/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class Solution16 {
  /*
   * 'age' = get user input
   *
   * 'outputString' = buildOutputString('age')
   *
   * Print 'outputString'
   */

  public static void main(String[] args) {

    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    int age = userInput.getAgeFromUser();

    String outputString = calculations.buildOutputString(age);

    output.printOutputString(outputString);
  }


}
