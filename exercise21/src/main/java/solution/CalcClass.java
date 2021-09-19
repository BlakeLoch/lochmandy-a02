/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class CalcClass {
  /*
   * method chooseMonthName(monthNumber)
   *   switch monthNumber
   *   case 1 = January
   *   case 2 = February
   *   case 3 = March
   *   case 4 = April
   *   case 5 = May
   *   case 6 = June
   *   case 7 = July
   *   case 8 = August
   *   case 9 = September
   *   case 10 = October
   *   case 11 = November
   *   case 12 = December
   *   default = Invalid
   */

  public String chooseMonthName(int monthNumber) {
    return switch (monthNumber) {
      case 1 -> "January";
      case 2 -> "February";
      case 3 -> "March";
      case 4 -> "April";
      case 5 -> "May";
      case 6 -> "June";
      case 7 -> "July";
      case 8 -> "August";
      case 9 -> "September";
      case 10 -> "October";
      case 11 -> "November";
      case 12 -> "December";
      default -> "Invalid";
    };
  }

}
