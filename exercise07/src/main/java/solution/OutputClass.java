package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class OutputClass {
    /*
    OutputClass
        method ConfirmDimensions()
            print "You entered dimensions of 'lengthOfRoom' feet by 'widthOfRoom' feet."
        print "The area is"
        method printAreaFeet(int 'areaInFeet')
            print 'squareFeet' + "square feet"
        method printAreaInMeters(int 'areaInMeters')
            print 'squareMeters'_(to 3 decimal places) + "square meters"
     */

    public void confirmDimensions(int length, int width) {
        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");
    }

    private void printAreaInSquareFeet(int squareFeet){
        System.out.println(squareFeet+" square feet");
    }

    private void printAreaInSquareMeters(double squareMeters){
        System.out.printf("%.3f square meters%n", squareMeters);
    }


    public void printArea(int squareFeet, double squareMeters){
        System.out.println("The area is");
        printAreaInSquareFeet(squareFeet);
        printAreaInSquareMeters(squareMeters);
    }



}
