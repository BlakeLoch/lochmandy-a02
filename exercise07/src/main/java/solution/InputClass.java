package solution;

import java.util.Scanner;

public class InputClass {

    /*
    InputClass
        method setDimensionOfRoom()
            if Length
            print "What is the length of the room in feet?"
            'lengthOfRoom' = get input from user
            if Width
            print "What is the width of the room in feet?"
            'widthOfRoom' = get input from user

     */

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






}
