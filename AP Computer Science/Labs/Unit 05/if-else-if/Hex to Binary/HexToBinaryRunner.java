
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/22/18
// Class - 10th
// Lab - Hex to Binary

import static java.lang.System.*;
import java.util.Scanner;

public class HexToBinaryRunner
{
    public static void main(String args[]) {
        //Scanner
        Scanner keyboard = new Scanner(in);

        //add test cases
        HexToBinary test = new HexToBinary();

        out.print("Enter a letter :: ");
        test.setHex(keyboard.next().charAt(0));
        out.println(test);

        out.print("Enter a letter :: ");
        test.setHex(keyboard.next().charAt(0));
        out.println(test);

        out.print("Enter a letter :: ");
        test.setHex(keyboard.next().charAt(0));
        out.println(test);

        out.print("Enter a letter :: ");
        test.setHex(keyboard.next().charAt(0));
        out.println(test);

        out.print("Enter a letter :: ");
        test.setHex(keyboard.next().charAt(0));
        out.println(test);

        out.print("Enter a letter :: ");
        test.setHex(keyboard.next().charAt(0));
        out.println(test);

        out.print("Enter a letter :: ");
        test.setHex(keyboard.next().charAt(0));
        out.println(test);

    }
}
