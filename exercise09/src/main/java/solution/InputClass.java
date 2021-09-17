package solution;

import java.util.Scanner;

public class InputClass {

    /*
    InputClass
        method setDimensionOfCeiling()
            if Length
            print "What is the length of the ceiling in feet?"
            'lengthOfCeiling' = get input from user
            if Width
            print "What is the width of the ceiling in feet?"
            'widthOfCeiling' = get input from user
     */

    private static final Scanner input = new Scanner(System.in);

    public int setDimensionOfCeiling(String dimension) {

        if (dimension.contains("l") || dimension.contains("L")) {
            System.out.print("What is the length of the ceiling in feet? ");
        } else if (dimension.contains("w") || dimension.contains("W")) {
            System.out.print("What is the width of the ceiling in feet? ");
        } else {
            System.out.print("Error: Dimension not specified");
        }

        return Integer.parseInt(input.nextLine());
    }

}
