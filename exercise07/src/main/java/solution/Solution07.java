package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */




public class Solution07 {

    /*
    Get 'lengthOfRoom' from user
    Get 'widthOfRoom' from user

    Print "You entered dimensions of 'lengthOfRoom' feet by 'widthOfRoom' feet."

    Calculate 'areaInSquareFeet'
    Calculate 'areaInSquareMeters'

    Print "The area is"
          "'squareFeet' square feet"
          "'squareMeters' square meters"
     */

    public static void main(String[] args) {

        InputClass userInput = new InputClass();
        CalcClass calculations = new CalcClass();
        OutputClass output = new OutputClass();

        int lengthOfRoom = userInput.setDimensionOfRoom("L");
        int widthOfRoom = userInput.setDimensionOfRoom("W");

        output.confirmDimensions(lengthOfRoom, widthOfRoom);

        int areaInSquareFeet = calculations.calcAreaInFeet(lengthOfRoom, widthOfRoom);
        double areaInSquareMeters = calculations.calcAreaInMeters(areaInSquareFeet);

        output.printArea(areaInSquareFeet, areaInSquareMeters);




    }

}