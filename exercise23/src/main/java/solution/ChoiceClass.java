/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

import java.util.Scanner;

public class ChoiceClass {
  /*
   * method boolInput()
   *  get input from user
   *  verify that it is y, Y, n, or N
   *  if not, loop until valid (Error message: "Please enter Y or N.")
   *  convert y or Y to true and n or N to false
   * method hasFuelInjection()
   *   print "Does you car have fuel injection?"
   *   'choice' = get user input with boolInput()
   *   if 'choice' = Y
   *     print "Get it in for service."
   *   If 'choice' =N
   *     print "Check to ensure the choke is opening and closing."
   * method startAndDie()
   *   print "Does the engine start and then die?"
   *   'choice' = boolInput()
   *   if 'choice' = Y
   *     hasFuelInjection()
   *   If 'choice' = N
   *     print "This should not be possible."
   * method crankUpButNotStart()
   *   print "Does the car crank up but fail to start?"
   *   'choice' = boolInput()
   *   if 'choice' = Y
   *     print "Check spark plug connections."
   *   if 'choice' = N
   *     startAndDie()
   * method slickingNoise()
   *   print "Does the car make a slicking noise?"
   *   'choice' = boolInput()
   *   if 'choice' = Y
   *     print "Replace the battery."
   *   if 'choice' = N
   *     crankUpButNotStart()
   * method batteryTerminalsCorroded()
   *   print "Are the battery terminals corroded?"
   *   'choice' = boolInput()
   *   if 'choice' = Y
   *     print"Clean terminals and try starting again."
   *   if 'choice' = N
   *     print "Replace cables and try again."
   * method isSilent()
   *   print "Is the car silent when you turn the key?"
   *   'choice' = boolInput()
   *   if 'choice' = Y
   *     batteryTerminalsCorroded()
   *   if 'choice' = N
   *     slickingNoise()
   */


  private static final Scanner input = new Scanner(System.in);
  OutputClass output = new OutputClass();
  boolean choice;

  private boolean boolInput() {
    String userInput = input.nextLine();
    while (!userInput.equalsIgnoreCase("Y") && !userInput.equalsIgnoreCase("N")) {
      System.out.println("Please enter Y or N.");
      userInput = input.nextLine();
    }
    return userInput.equalsIgnoreCase("Y");
  }

  private void hasFuelInjection() {
    output.print("Does you car have fuel injection? ");
    choice = boolInput();
    if (choice) {
      output.print("Get it in for service.");
    } else {
      output.print("Check to ensure the choke is opening and closing.");
    }
  }

  private void startAndDie() {
    output.print("Does the engine start and then die? ");
    choice = boolInput();

    if (choice) {
      hasFuelInjection();
    } else {
      output.print("This should not be possible.");
    }
  }

  private void crankUpButNotStart() {
    output.print("Does the car crank up but fail to start? ");
    choice = boolInput();

    if (choice) {
      output.print("Check spark plug connections.");
    } else {
      startAndDie();
    }
  }

  private void slickingNoise() {
    output.print("Does the car make a slicking noise? ");
    choice = boolInput();

    if (choice) {
      output.print("Replace the battery.");
    } else {
      crankUpButNotStart();
    }
  }

  private void batteryTerminalsCorroded() {
    output.print("Are the battery terminals corroded? ");
    choice = boolInput();

    if (choice) {
      output.print("Clean terminals and try starting again.");
    } else {
      output.print("Replace cables and try again.");
    }
  }

  public void isSilent() {
    output.print("Is the car silent when you turn the key? ");
    choice = boolInput();

    if (choice) {
      batteryTerminalsCorroded();
    } else {
      slickingNoise();
    }
  }

}
