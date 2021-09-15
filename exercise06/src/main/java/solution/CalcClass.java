package solution;

public class CalcClass {

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
