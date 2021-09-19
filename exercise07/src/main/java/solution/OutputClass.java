/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class OutputClass {
  /*
   * method ConfirmDimensions()
   *   print "You entered dimensions of 'lengthOfRoom' feet by 'widthOfRoom' feet."
   * method printAreaFeet('areaInFeet')
   *   print 'squareFeet' + "square feet"
   * method printAreaInMeters('areaInMeters')
   *   print 'squareMeters'_(to 3 decimal places) + "square meters"
   * method printAreaInMeters(int 'areaInMeters')
   *   print "The area is"
   *   printAreaFeet('areaInFeet')
   *   printAreaInMeters('areaInMeters')
   */

  public void confirmDimensions(int length, int width) {
    System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
  }

  private void printAreaInSquareFeet(int squareFeet) {
    System.out.println(squareFeet + " square feet");
  }

  private void printAreaInSquareMeters(double squareMeters) {
    System.out.printf("%.3f square meters%n", squareMeters);
  }


  public void printArea(int squareFeet, double squareMeters) {
    System.out.println("The area is");
    printAreaInSquareFeet(squareFeet);
    printAreaInSquareMeters(squareMeters);
  }


}
