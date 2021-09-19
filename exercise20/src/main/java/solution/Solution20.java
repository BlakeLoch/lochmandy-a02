package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class Solution20 {
    /*
    'orderAmount' = get input from user
    'state' = get input from user
    'county' = get input from user

    'tax' = calcTax('orderAmount', 'state', 'county')
    'total' = calcTotal('orderAmount', 'tax')

    'outputString' = buildOutputString('tax', 'total', 'state')
    print 'outputString'
     */

    public static void main(String[] args) {
        InputClass userInput = new InputClass();
        CalcClass calculations = new CalcClass();
        OutputClass output = new OutputClass();

        double orderAmount = userInput.getOrderAmountFromUser();
        String state = userInput.getStateFromUser();
        String county = userInput.getCountyFromUser(state);

        double tax = calculations.calcTax(orderAmount, state, county);
        double total = calculations.calcTotal(orderAmount, tax);
        String outputString = calculations.buildOutputString(tax, total, state);

        output.printOutputString(outputString);


    }
}
