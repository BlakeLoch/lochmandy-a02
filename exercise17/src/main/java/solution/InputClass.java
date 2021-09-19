package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class InputClass {

    /*
    method getValue(messageNumber)
        messageNumber 1 = Enter a 1 if you are male or a 2 if you are female:
        messageNumber 2 = How many ounces of alcohol did you have?
        messageNumber 3 = What is your weight, in pounds?
        messageNumber 4 = How many hours has it been since your last drink?
        while input is not an integer
            print "Please enter a number!"
            print message that corresponds to number
            get user input
        if messageNumber = 1
            make odd numbers output 1
            make even numbers output 2
        return user input
     */
    private static final Scanner input = new Scanner(System.in);

    public int getValue(int messageNumber) {
        String inputMessage = "";
        if (messageNumber == 1) {
            inputMessage = "Enter a 1 if you are male or a 2 if you are female: ";
        } else if (messageNumber == 2) {
            inputMessage = "How many ounces of alcohol did you have? ";
        } else if (messageNumber == 3) {
            inputMessage = "What is your weight, in pounds? ";
        } else if (messageNumber == 4) {
            inputMessage = "How many hours has it been since your last drink? ";
        }

        System.out.print(inputMessage);

        while (!input.hasNextInt()) {
            System.out.println("Please enter a number!");
            System.out.print(inputMessage);
                input.nextLine();
        }
        int userValue = Integer.parseInt(input.nextLine());

        if (messageNumber == 1) {
            userValue = (userValue % 2);
            userValue = (userValue == 1) ? 1 : 2;
        }

        return userValue;
    }
}







