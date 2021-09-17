package solution;

import java.util.Scanner;

 /*
    InputClass
        method getNumberOfPeople()
            print "How many people?"
            return 'numberOfPeople' = read from user
        method getNumberOfPizzas()
            print "How many pizzas do you have?"
            return 'numberOfPizzas' = read from user
        method getSlicesPerPizza()
            print "How many slices per pizza?"
            return 'slicesPerPizza' = read from user
     */


public class InputClass {

    private static final Scanner input = new Scanner(System.in);

    public int getNumberOfPeople(){
        System.out.print("How many people? ");
        return Integer.parseInt(input.nextLine());
    }

    public int getNumberOfPizzas(){
        System.out.print("How many pizzas do you have? ");
        return Integer.parseInt(input.nextLine());
    }

    public int getSlicesPerPizza(){
        System.out.print("How many slices per pizza? ");
        return Integer.parseInt(input.nextLine());
    }


}