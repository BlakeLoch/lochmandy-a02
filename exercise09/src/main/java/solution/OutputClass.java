package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class OutputClass {
    /*
    OutputClass
        method printOutputLine(numberOfGallons, areaOfCeiling)
            print "You will need to purchase 'numberOfGallons' gallons of paint to cover 'areaOfCeiling' square feet."
     */

    public void printOutputLine(int numberOfGallons, int areaOfCeiling) {
        System.out.println("You will need to purchase "+numberOfGallons+" gallons of paint to cover "+areaOfCeiling+" square feet.");
    }

}

