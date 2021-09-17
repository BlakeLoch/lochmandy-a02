package solution;

public class Solution09 {

    /*
    Get 'lengthOfCeiling' from user
    Get 'widthOfCeiling' from user

    Calculate 'areaOfCeiling'
    Calculate 'numberOfGallons'

    Print "You will need to purchase 'numberOfGallons' gallons of paint to cover 'areaOfCeiling' square feet."
     */

    public static void main(String[] args) {

        InputClass userInput = new InputClass();
        CalcClass calculations = new CalcClass();
        OutputClass output = new OutputClass();

        int lengthOfCeiling = userInput.setDimensionOfCeiling("L");
        int widthOfCeiling = userInput.setDimensionOfCeiling("W");

        int areaOfCeiling = calculations.calcAreaOfCeiling(lengthOfCeiling, widthOfCeiling);
        int numberOfGallons = calculations.calcNumberOfGallons(areaOfCeiling);

        output.printOutputLine(numberOfGallons, areaOfCeiling);

    }

}
