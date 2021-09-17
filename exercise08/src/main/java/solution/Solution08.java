package solution;

public class Solution08 {

    public static void main(String[] args) {

        InputClass userInput = new InputClass();
        CalcClass calculations = new CalcClass();
        OutputClass output = new OutputClass();


        //Get input values
        //'numberOfPeople' = get user input
        //'numberOfPizzas' = get user input
        //'slicesPerPizza' = get user input


        int numberOfPeople = userInput.getNumberOfPeople();
        int numberOfPizzas = userInput.getNumberOfPizzas();
        int slicesPerPizza = userInput.getSlicesPerPizza();

        //Calculate derived values
        //'numberOfSlices' = calcNumberOfSlices('numberOfPizzas', 'slicesPerPizza')
        //'slicesPerPerson' = calcSlicesPerPerson('numberOfPeople', 'numberOfSlices')
        //'leftoverSlices' = calcLeftoverSlices('numberOfSlices', 'slicesPerPerson','numberOfPeople')

        int numberOfSlices = calculations.calcNumberOfSlices(numberOfPizzas, slicesPerPizza);
        int slicesPerPerson = calculations.calcSlicesPerPerson(numberOfPeople, numberOfSlices);
        int leftoverSlices = calculations.calcLeftoverSlices(numberOfSlices, slicesPerPerson, numberOfPeople);

        //Print outputs
        //print "'numberOfPeople' people with 'numberOfPizzas' pizzas ('numberOfSlices' slices)"
        //print "Each person gets 'slicesPerPerson' pieces of pizza."
        //print "There are 0 leftover pieces."

        output.confirmInput(numberOfPeople, numberOfPizzas, numberOfSlices);
        output.printSlicesPerPerson(slicesPerPerson);
        output.printLeftoverSlices(leftoverSlices);

    }
}
