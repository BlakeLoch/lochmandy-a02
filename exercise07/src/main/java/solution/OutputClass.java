package solution;

public class OutputClass {

    public void printAreaInSquareFeet(int squareFeet){
        System.out.println(squareFeet+" square feet");
    }

    public void printAreaInSquareMeters(double squareMeters){
        System.out.printf("%.3f square meters%n", squareMeters);
    }


    public void printArea(int squareFeet, double squareMeters){
        System.out.println("The area is");
        printAreaInSquareFeet(squareFeet);
        printAreaInSquareMeters(squareMeters);
    }



}
