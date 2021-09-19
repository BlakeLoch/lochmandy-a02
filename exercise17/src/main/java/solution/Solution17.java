/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class Solution17 {
  /*
   * gender = get input from user (1 if male, 2 if female)
   * ozOfAlcohol = get input from user
   * weightInPounds = get input from user
   * hoursSinceLastDrink = get input from user
   *
   * bac = calcBAC('gender', 'ozOfAlcohol', 'weightInPounds', 'hoursSinceLastDrink')
   * outputString = buildOutputString('bac')
   *
   * print 'outputString'
   */

  public static void main(String[] args) {

    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    int gender = userInput.getValue(1);
    int ozOfAlcohol = userInput.getValue(2);
    int weightInPounds = userInput.getValue(3);
    int hoursSinceLastDrink = userInput.getValue(4);

    double bac = calculations.calcBAC(gender, ozOfAlcohol, weightInPounds, hoursSinceLastDrink);
    String outputString = calculations.buildOutputString(bac);

    output.printOutputString(outputString);

  }

}