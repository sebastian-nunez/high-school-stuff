
// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
    //instance variables and constructors could be present, but are not necessary

    public static void printTriangle(String word) {
        for (int i = 0; i < word.length(); i++) {
            String output = "";
            for (int j = 0; j <= i; j++) {
                output += word;
            }
            System.out.println(output);
        }
    }
}
