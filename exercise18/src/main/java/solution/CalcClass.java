/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class CalcClass {
  /*
   * method convertTemperature('inputTemperature', 'temperatureScale')
   *   if 'temperatureScale' = C or c
   *     return ('inputTemperature' - 32) * 5 / 9
   *   if 'temperatureScale' = F or f
   *     return ('inputTemperature' * 9 / 5) + 32
   */

  public double convertTemperature(double inputTemperature, String temperatureScale) {
    if (temperatureScale.equalsIgnoreCase("C")) {
      return (inputTemperature - 32) * 5 / 9;
    } else if (temperatureScale.equalsIgnoreCase("F")) {
      return (inputTemperature * 9 / 5) + 32;
    } else {
      return 0;
    }

  }

  public String buildOutputString(double outputTemperature, String temperatureScale) {
    String makeOutput = "The temperature in ";
    if (temperatureScale.equalsIgnoreCase("C")) {
      makeOutput += "Celsius is ";
    } else if (temperatureScale.equalsIgnoreCase("F")) {
      makeOutput += "Fahrenheit is ";
    } else {
      makeOutput += "Errors is ";
    }
    makeOutput += outputTemperature;
    return makeOutput;
  }
}
