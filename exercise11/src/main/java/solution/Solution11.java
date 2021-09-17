package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class Solution11 {
    /*
        'euroAmount' = get from user input
        'exchangeRate' = get from user input

        'dollarAmount' = calcDollarAmount(euroAmount, exchangeRate)
        'outputString' = calculations.buildOutputString(euroAmount, exchangeRate, dollarAmount)

        print "'euroAmount' euros at an exchange rate of 'exchangeRate' is (return)
                'dollarAmount' U.S. dollars."
     */

    public static void main(String[] args) {

        InputClass userInput = new InputClass();
        CalcClass calculations = new CalcClass();
        OutputClass output = new OutputClass();

        double euroAmount = userInput.getEuroAmount();
        double exchangeRate = userInput.getExchangeRate();

        double dollarAmount = calculations.calcDollarAmount(euroAmount, exchangeRate);
        String outputString = calculations.buildOutputString(euroAmount, exchangeRate, dollarAmount);

        output.printOutputString(outputString);

    }
}
