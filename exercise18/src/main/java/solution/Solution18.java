package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class Solution18 {
    /*
    'temperatureScale' = F or C (get input from user)
    'inputTemperature' = get input from user

     'outputTemperature' = convertTemperature('inputTemperature', 'temperatureScale')
     'outputString' = buildOutputString('outputTemperature', 'temperatureScale'

     print 'outputString'
     */



    public static void main(String[] args) {

        InputClass userInput = new InputClass();
        CalcClass calculations = new CalcClass();
        OutputClass output = new OutputClass();

        String temperatureScale = userInput.getTemperatureScaleFromUser();
        double inputTemperature = userInput.getInputTemperature(temperatureScale);

        double outputTemperature = calculations.convertTemperature(inputTemperature, temperatureScale);
        String outputString = calculations.buildOutputString(outputTemperature, temperatureScale);

        output.printOutputString(outputString);
    }
}