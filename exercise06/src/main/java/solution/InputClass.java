package solution;

import java.util.Scanner;
import java.time.Year;

public class InputClass {

    Scanner input = new Scanner(System.in);
    private String currentAgeString;
    private String retirementAgeString;
    private int currentYear = Year.now().getValue();

    public void currentAgeStringInput() {
        System.out.print("What is your current age? ");
        currentAgeString = input.nextLine();
    }

    public void retirementAgeStringInput() {
        System.out.print("At what age would you like to retire? ");
        retirementAgeString = input.nextLine();
    }

    public String getCurrentAgeString() {
        return currentAgeString;
    }

    public String getRetirementAgeString() {
        return retirementAgeString;
    }

    public int getCurrentYear() {
        return currentYear;
    }
}
