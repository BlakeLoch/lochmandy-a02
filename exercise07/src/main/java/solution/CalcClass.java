/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class CalcClass {
  /*
   * 'conversionFactor' = 0.09290304
   * method CalcAreaInFeet('lengthInFeet', 'widthInFeet')
   *   return 'lengthInFeet' * 'widthInFeet'
   * method CalcAreaInMeters('areaInFeet')
   *   return 'areaFeet' * 'conversionFactor'
   */

  private static final double CONVERSION_FACTOR = 0.09290304;

  public int calcAreaInFeet(int lengthInFeet, int widthInFeet) {
    return lengthInFeet * widthInFeet;
  }

  public double calcAreaInMeters(int areaInFeet) {
    return areaInFeet * CONVERSION_FACTOR;
  }

}
