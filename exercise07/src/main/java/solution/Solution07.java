package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */




public class Solution07 {

    /*
    InputClass
        method setDimensionOfRoom()
            if Length
            print "What is the length of the room in feet?"
            'lengthOfRoom' = get input from user
            if Width
            print "What is the width of the room in feet?"
            'widthOfRoom' = get input from user

        method ConfirmDimensions()
            print "You entered dimensions of 'lengthOfRoom' feet by 'widthOfRoom' feet."

    CalcClass
       double 'conversionFactor' = 0.09290304
        method CalcAreaInFeet(int 'lengthInFeet', int 'widthInFeet')
            return 'lengthInFeet' * 'widthInFeet'
        method CalcAreaInMeters(int 'areaInFeet')
            return 'areaFeet' * 'conversionFactor'

    OutputClass
        print "The area is"
        method printAreaFeet(int 'areaInFeet')
            print 'squareFeet' + "square feet"
        method printAreaInMeters(int 'areaInMeters')
            print 'squareMeters'_(to 3 decimal places) + "square meters"
     */

    public static void main(String[] args) {

        InputClass userInput = new InputClass();
        CalcClass calculations = new CalcClass();
        OutputClass output = new OutputClass();

        int lengthOfRoom = userInput.setDimensionOfRoom("L");
        int widthOfRoom = userInput.setDimensionOfRoom("W");

        userInput.confirmDimensions(lengthOfRoom, widthOfRoom);

        int areaInSquareFeet = calculations.calcAreaInFeet(lengthOfRoom, widthOfRoom);
        double areaInSquareMeters = calculations.calcAreaInMeters(areaInSquareFeet);

        output.printArea(areaInSquareFeet, areaInSquareMeters);




    }

}