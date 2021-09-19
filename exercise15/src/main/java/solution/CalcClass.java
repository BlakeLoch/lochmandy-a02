package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class CalcClass {

    /*
    method validateUser('username', 'password')
        if 'username' and 'password' match stored values
            return "Welcome"
        if they don't
            return "I don't know you."
     */

    private static final String STORED_USERNAME = "MyUsername";
    private static final String STORED_PASSWORD = "12345";


    public String validateUser(String username, String password) {
        if (username.equals(STORED_USERNAME) && password.equals(STORED_PASSWORD)) {
            return "Welcome!";
        } else {
            return "I don't know you.";
        }
    }
}
