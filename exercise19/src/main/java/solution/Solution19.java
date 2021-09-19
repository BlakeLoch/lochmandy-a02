package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class Solution19 {
    /*
    'height' = get input from user
    'weight' = get input from user

    'bmi' = calcBMI(height, weight)
    'outputString' = buildOutputString(bmi)

    print 'outputString'
     */

    public static void main(String[] args) {

        InputClass userInput = new InputClass();
        CalcClass calculations = new CalcClass();
        OutputClass output = new OutputClass();

        int height = userInput.getHeightFromUser();
        double weight = userInput.getWeightFromUser();

        double bmi = calculations.calcBMI(height, weight);
        String outputString = calculations.buildOutputString(bmi);

        output.printOutputString(outputString);

    }


}
