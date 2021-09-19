/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

package solution;

public class CalcClass {
  /*
   * method setYearsToRetire()
   *   'currentAge' = parse 'currentAgeString' as integer
   *   'retirementAge' = parse 'retirementAgeString' as integer
   *   'yearsToRetire' = 'retirementAge' - 'currentAge'
   * method getYearsToRetire()
   *   return 'yearsToRetire'
   * method setRetirementYear('currentYear')
   *   'retirementYear' = 'currentYear' + 'yearsToRetire'
   * method getRetirementYear()
   *   return 'retirementYear'
   */

  private int yearsToRetire;
  private int retirementYear;

  public void setYearsToRetire(String currentAgeString, String retirementAgeString) {
    int currentAge = Integer.parseInt(currentAgeString);
    int retirementAge = Integer.parseInt(retirementAgeString);
    yearsToRetire = retirementAge - currentAge;
  }

  public int getYearsToRetire() {
    return yearsToRetire;
  }

  public int getRetirementYear() {
    return retirementYear;
  }

  public void setRetirementYear(int currentYear) {
    retirementYear = currentYear + yearsToRetire;
  }

}
