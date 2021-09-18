package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */
import java.util.Scanner;

public class InputClass {
    /*
    method getAgeFromUser()
        Print "What is your age?"
        return user input
     */
    private static final Scanner input = new Scanner(System.in);

    public int getAgeFromUser() {
        System.out.print("What is your age? ");
        return Integer.parseInt(input.nextLine());
    }
}
