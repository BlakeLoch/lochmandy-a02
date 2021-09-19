package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class InputClass {
    /*
    method getTemperatureScaleFromUser()
        print "Press C to convert from Fahrenheit to Celsius.\n
               Press F to convert from Celsius to Fahrenheit.\n
               Your choice:"
           get user input and make sure its c, C, f, or F
                if not, loop (Feedback message: "Please enter C or F")
            return user input

        method getInputTemperature('temperatureScale')
            if 'temperatureScale' = C or c
                print "Please enter the temperature in Fahrenheit:"
            if 'temperatureScale' =F or f
                print "Please enter the temperature in Celsius:"
            return user input
     */
    private static final Scanner input = new Scanner(System.in);

    public String getTemperatureScaleFromUser() {
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String scale = input.nextLine();

        while (!scale.equalsIgnoreCase("C") && !scale.equalsIgnoreCase("F")) {
            System.out.println("Please enter C or F");
            scale = input.nextLine();
        }
        return scale;

    }

    public double getInputTemperature(String temperatureScale) {
        String getInput = "Please enter temperature in ";
        if (temperatureScale.equalsIgnoreCase("C")){
            getInput += "Fahrenheit: ";
        } else if (temperatureScale.equalsIgnoreCase("F")){
            getInput += "Celsius: ";
        } else {
            getInput += "Errors: ";
        }
        System.out.print(getInput);
        return Double.parseDouble(input.nextLine());

    }
}
