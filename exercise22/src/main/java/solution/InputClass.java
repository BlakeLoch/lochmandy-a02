package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class InputClass {
    /*
    method getNumberFromUser('term')
    'place' = switch on ('term')
    case 1 = first
    case 2 = second
    case 3 = third
    default = nth
        print "Please enter the 'place' number:"
            return = get user input
            validate with loop (Error message: "Please enter a number."
     */

    private static final Scanner input = new Scanner(System.in);


    public int getNumberFromUser(int term) {
        String place = switch (term) {
            case 1 -> "first";
            case 2 -> "second";
            case 3 -> "third";
            default -> "nth";
        };
        System.out.print("Please enter the "+place+" number: ");

        while (!input.hasNextInt()){
            System.out.println("Please enter a number.");
            input.nextLine();
        }
        return Integer.parseInt(input.nextLine());
    }
}
