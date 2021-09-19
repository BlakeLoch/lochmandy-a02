package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class InputClass {
    /*
    method getInputFromUser('field')
        print "What is the 'field'? "
        return user input
     */


    private static final Scanner input = new Scanner(System.in);

    public String getInputFromUser(String field) {
        System.out.print("What is the "+field+"? ");
        return input.nextLine();
        }



    }

