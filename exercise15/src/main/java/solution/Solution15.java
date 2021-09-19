/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class Solution15 {
  /*
   * Prompt user for 'username'
   * Prompt user for 'password'
   *
   * If 'username' and 'password' match stored values
   *   Print "Welcome!"
   * If 'username' and 'password' don't match stored values
   *   Print "I don't know you."
   */

  public static void main(String[] args) {
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    String username = userInput.getInputFromUser("username");
    String password = userInput.getInputFromUser("password");

    String outputString = calculations.validateUser(username, password);

    output.printOutputString(outputString);

  }

}
