package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class CalcClass {
    /*
    method calcBMI('height', 'weight')
        return ('weight' / ('height' * 'height')) * 703

    method buildOutputString('bmi')
        "Your BMI is 'bmi'.\n"+
        if bmi < 18.5
            "You are underweight. You should see your doctor."
        else if bmi > 25
            "You are overweight. You should see your doctor."
        else
            "You are within the ideal weight range."
        return concatenated string
     */

    public double calcBMI(int height, double weight) {
        return (weight / (height * height)) * 703;
    }

    public String buildOutputString(double bmi) {
        String bmiString = "Your BMI is "+String.format("%.1f", bmi)+".\n";
        if (bmi < 18.5){
            bmiString += "You are underweight. You should see your doctor.";
        } else if (bmi > 25) {
            bmiString += "You are overweight. You should see your doctor.";
        } else {
            bmiString += "You are within the ideal weight range.";
        }
        return bmiString;
    }
}
