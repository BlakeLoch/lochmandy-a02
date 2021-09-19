package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class CalcClass {
    /*
    method compareNumbers('number1', 'number2', 'number3')
        'largerNumber' = 0
        if 'number1' > 'number2'
        'largerNumber' = 'number1'
        else
        'largerNumber' = 'number2'

        if 'number3' > 'largerNumber'
        return 'number3'
        else
        return 'largerNumber'



     */

    public int compareNumbers(int number1, int number2, int number3) {
        int largerNumber;
        if (number1 > number2){
            largerNumber = number1;
        } else {
            largerNumber = number2;
        }

        if (number3 > largerNumber){
            return number3;
        } else {
            return largerNumber;
        }

    }
}
