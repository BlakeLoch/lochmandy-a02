package solution;

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
