package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class CalcClass {
    /*
    method calcBAC('gender', 'ozOfAlcohol', 'weightInPounds', 'hoursSinceLastDrink')
        'alcoholDistributionRatio' = 0.73 if 'gender' is 1, 0.66 if 'gender' is 2
        return ('ozOfAlcohol' * 5.14 / 'weightInPounds' * 'alcoholDistributionRatio') - 0.015 * 'hoursSinceLastDrink'

    method buildOutputString('bac')
        "Your BAC is 'bac'\n" +
        if BAC < 0.08
        "It is legal for you to drive."
        if BAC >= 0.08
        "It is not legal for you to drive."


     */

    public double calcBAC(int gender, int ozOfAlcohol, int weightInPounds, int hoursSinceLastDrink) {
        double alcoholDistributionRatio = (gender == 1) ? 0.73 : 0.66;
        return (ozOfAlcohol * 5.14 / weightInPounds * alcoholDistributionRatio) - 0.015 * hoursSinceLastDrink;
    }

    public String buildOutputString(double bac) {
        String output = "Your BAC is "+String.format("%.6f", bac)+"\n";
        output += (bac < 0.08) ? "It is legal for you to drive." : "It is not legal for you to drive.";
        return output;
    }
}
