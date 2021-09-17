package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class CalcClass {
    /*
    CalcClass
       double 'conversionFactor' = 0.09290304
        method CalcAreaInFeet(int 'lengthInFeet', int 'widthInFeet')
            return 'lengthInFeet' * 'widthInFeet'
        method CalcAreaInMeters(int 'areaInFeet')
            return 'areaFeet' * 'conversionFactor'
     */

    private static final double conversionFactor = 0.09290304;

    public int calcAreaInFeet(int lengthInFeet, int widthInFeet) {
        return lengthInFeet * widthInFeet;
    }

    public double calcAreaInMeters(int areaInFeet) {
        return areaInFeet * conversionFactor;
    }

}
