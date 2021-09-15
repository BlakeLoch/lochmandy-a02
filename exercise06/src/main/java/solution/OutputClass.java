package solution;

public class OutputClass {

    public void yearsToRetirement(int retirementYears) {
        System.out.println("You have " + retirementYears + " years left until you can retire.");
    }

    public void retireWhen(int yearNow, int yearRetire) {
        System.out.println("It's "+yearNow+", so you can retire in "+yearRetire+".");
    }
}
