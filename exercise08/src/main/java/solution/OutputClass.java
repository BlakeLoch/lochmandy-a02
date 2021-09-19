/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class OutputClass {
  /*
   * method confirmInput(int numberOfPeople, int numberOfPizzas, int numberOfSlices)
   *   print 'numberOfPeople'+" people with "+'numberOfPizzas'+" pizzas ("+'numberOfSlices'+" slices)"
   * method printSlicesPerPerson(int slicesPerPerson)
   *   print "Each person gets "+'slicesPerPerson'+" pieces of pizza."
   * method printLeftoverSlices(int leftoverSlices)
   *   print "There are "+'leftoverSlices'+" leftover pieces."
   */

  public void confirmInput(int numberOfPeople, int numberOfPizzas, int numberOfSlices) {
    System.out.println(
        numberOfPeople + " people with " + numberOfPizzas + " pizzas (" + numberOfSlices
            + " slices)");
  }

  public void printSlicesPerPerson(int slicesPerPerson) {
    System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
  }

  public void printLeftoverSlices(int leftoverSlices) {
    System.out.println("There are " + leftoverSlices + " leftover pieces.");
  }

}
