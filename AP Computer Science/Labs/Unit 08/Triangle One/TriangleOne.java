
//� A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 12/07/18
//Class - 10th
//Lab  - Triangle One

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOne {
    //this lab is setup with a single static method
    //there are no instance variables or additional methods / constructors

    public static String createTriangle(String let, int size) {
        String output = "";

        for (int rows = 1; rows <= size; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                output += let;
            }
            output += "\n";
        }

        return output;
    }
}
