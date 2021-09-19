package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class CalcClass {
    /*
    method buildOutputString('age')
       if 16 or older
           "You are old enough to legally drive."
       if under 16
           "You are not old enough to legally drive."
     */

    public String buildOutputString(int age) {
        return (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
    }

}
