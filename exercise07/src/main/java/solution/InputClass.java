package solution;

import java.util.Scanner;

public class InputClass {

    private static final Scanner input = new Scanner(System.in);

    public int setDimensionOfRoom(String dimension) {

        if (dimension.contains("l") || dimension.contains("L")) {
            System.out.print("What is the length of the room in feet? ");
        } else if (dimension.contains("w") || dimension.contains("W")) {
            System.out.print("What is the width of the room in feet? ");
        } else {
            System.out.print("Error: Dimension not specified");
        }

        return Integer.parseInt(input.nextLine());
    }

    public void confirmDimensions(int length, int width) {
        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");
    }




}
