package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class InputClass {

    private static final Scanner input = new Scanner(System.in);

    public double GetOrderAmountFromUser() {
        System.out.print("What is the order amount? ");
        return Double.parseDouble(input.nextLine());
    }

    public String GetStateFromUser() {
        System.out.print("What is the state? ");
        return input.nextLine();
    }
}
