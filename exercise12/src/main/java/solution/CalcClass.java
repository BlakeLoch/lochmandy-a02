package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class CalcClass {
    /*
    method calcAmountAccrued('principal', 'interestRate', 'numberOfYears')
        interestRate /= 100
        return 'principal' * (1 + 'interestRate' * 'numberOfYears') rounded up to 2 decimal places

     */

    public double calcAmountAccrued(double principal, double interestRate, int numberOfYears) {
        interestRate /= 100;
        return Math.ceil(principal * (1 + interestRate * numberOfYears) * 100) / 100;
    }
}