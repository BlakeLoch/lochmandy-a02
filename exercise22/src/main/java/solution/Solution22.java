package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class Solution22 {
    /*
    'number1' = get input from user
    'number2' = get input from user
    'number3' = get input from user

    largestNUmber = compareNumbers('number1', 'number2', 'number3')

    printLargestNUmber(largestNUmber)

     */

    public static void main(String[] args) {

        InputClass userInput = new InputClass();
        CalcClass calculations = new CalcClass();
        OutputClass output = new OutputClass();

        int number1 = userInput.getNumberFromUser(1);
        int number2 = userInput.getNumberFromUser(2);
        int number3 = userInput.getNumberFromUser(3);

        int largestNumber = calculations.compareNumbers(number1, number2, number3);

        output.printLargestNUmber(largestNumber);

    }
}
