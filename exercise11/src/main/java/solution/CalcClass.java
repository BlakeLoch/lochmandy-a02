package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class CalcClass {
    /*
    method calcDollarAmount(euroAmount, exchangeRate)
        return euroAmount * exchangeRate
    method buildOutputString(euroAmount, exchangeRate, dollarAmount)
        return "'euroAmount' euros at an exchange rate of 'exchangeRate' is (return)
                'dollarAmount' U.S. dollars."
     */

    public double calcDollarAmount(double euroAmount, double exchangeRate) {
        return Math.ceil(euroAmount * exchangeRate * 100) / 100;

    }

    public String buildOutputString(double euroAmount, double exchangeRate, double dollarAmount) {
        return String.format("%.2f", euroAmount)+"  euros at an exchange rate of "+exchangeRate+" is\n"+String.format("%.2f", dollarAmount)+" U.S. dollars.";
    }
}
