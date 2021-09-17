package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class Solution08 {

    /*
        Get 'numberOfPeople' from user
        Get 'numberOfPizzas' from user
        Get 'slicesPerPizza' from user

        Calculate 'numberOfSlices'
        Calculate 'slicesPerPerson'
        Calculate 'leftoverSlices'

        Print "'numberOfPeople' people with 'numberOfPizzas' pizzas ('numberOfSlices' slices)"
        Print "Each person gets 'slicesPerPerson' pieces of pizza."
        Print "There are 0 leftover pieces."
     */

    public static void main(String[] args) {

        InputClass userInput = new InputClass();
        CalcClass calculations = new CalcClass();
        OutputClass output = new OutputClass();

        int numberOfPeople = userInput.getNumberOfPeople();
        int numberOfPizzas = userInput.getNumberOfPizzas();
        int slicesPerPizza = userInput.getSlicesPerPizza();

        int numberOfSlices = calculations.calcNumberOfSlices(numberOfPizzas, slicesPerPizza);
        int slicesPerPerson = calculations.calcSlicesPerPerson(numberOfPeople, numberOfSlices);
        int leftoverSlices = calculations.calcLeftoverSlices(numberOfSlices, slicesPerPerson, numberOfPeople);

        output.confirmInput(numberOfPeople, numberOfPizzas, numberOfSlices);
        output.printSlicesPerPerson(slicesPerPerson);
        output.printLeftoverSlices(leftoverSlices);

    }
}
