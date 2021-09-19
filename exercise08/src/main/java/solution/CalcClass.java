/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class CalcClass {
  /*
   * method calcNumberOfSlices(int numberOfPizzas, int slicesPerPizza)
   *   return numberOfPizzas * slicesPerPizza
   * method calcSlicesPerPerson(int numberOfPeople, int numberOfSlices)
   *   return numberOfSlices / numberOfPeople
   * method calcLeftoverSlices(int numberOfSlices, int slicesPerPerson, int numberOfPeople)
   *   return return numberOfSlices - (slicesPerPerson * numberOfPeople)
   */

  public int calcNumberOfSlices(int numberOfPizzas, int slicesPerPizza) {
    return numberOfPizzas * slicesPerPizza;
  }

  public int calcSlicesPerPerson(int numberOfPeople, int numberOfSlices) {
    return numberOfSlices / numberOfPeople;
  }

  public int calcLeftoverSlices(int numberOfSlices, int slicesPerPerson, int numberOfPeople) {
    return numberOfSlices - (slicesPerPerson * numberOfPeople);
  }

}
