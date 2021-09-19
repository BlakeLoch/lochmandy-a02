/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class CalcClass {
  /*
   * 'CONVERSION_FACTOR' = 350
   *
   * method calcAreaOfCeiling('length', 'width')
   *   return 'length' * 'width'
   * method calcNumberOfGallons('areaOfCeiling')
   *   return ceiling('areaOfCeiling'/'CONVERSION_FACTOR')
   */

  private static final double CONVERSION_FACTOR = 350.0;

  public int calcAreaOfCeiling(int length, int width) {
    return length * width;
  }

  public int calcNumberOfGallons(int areaOfCeiling) {
    return (int) Math.ceil(areaOfCeiling / CONVERSION_FACTOR);
  }
}
