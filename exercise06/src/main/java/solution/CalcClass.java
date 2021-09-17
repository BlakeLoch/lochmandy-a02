package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class CalcClass {
    /*
    CalcClass
     'currentAge' = parse 'currentAgeString' as integer
     'retirementAge' = parse 'retirementAgeString' as integer
     'yearsToRetire' = 'retirementAge' - 'currentAge'
     'retirementYear' = 'currentYear' + 'yearsToRetire'
     */

    private int yearsToRetire;
    private int retirementYear;

    public void setYearsToRetire(String nowAge, String retireAge) {
        int currentAge = Integer.parseInt(nowAge);
        int retirementAge = Integer.parseInt(retireAge);

        yearsToRetire = retirementAge - currentAge;
    }

    public int getYearsToRetire() {
        return yearsToRetire;
    }

    public void setRetirementYear(int yearNow ) {
        retirementYear = yearNow + yearsToRetire;
    }

    public int getRetirementYear() {
        return retirementYear;
    }
}
