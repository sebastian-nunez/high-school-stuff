//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Sebastian Nunez
//Date - 08/31/18
//Class - 10th
//Lab  - Inputs Lab

import static java.lang.System.*;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        double doubleOne, doubleTwo;
        float floatOne, floatTwo;
        short shortOne, shortTwo;

        // add in input for all variables

        // interger inputs
        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        // doubles inputs
        System.out.print("Enter a double   :: ");
        doubleOne = keyboard.nextDouble();
        System.out.print("Enter a double   :: ");
        doubleTwo = keyboard.nextDouble();

        // float inputs
        System.out.print("Enter a float   :: ");
        floatOne = keyboard.nextFloat();
        System.out.print("Enter a float   :: ");
        floatTwo = keyboard.nextFloat();

        // short inputs
        System.out.print("Enter a short   :: ");
        shortOne = keyboard.nextShort();
        System.out.print("Enter a short   :: ");
        shortTwo = keyboard.nextShort();

        // add in output for all variables

        // interger outputs
        System.out.println();
        System.out.println("integer one = " + intOne);
        System.out.println("integer two = " + intTwo);

        // doubles outputs
        System.out.println();
        System.out.println("double one = " + doubleOne);
        System.out.println("double two = " + doubleTwo);

        // doubles outputs
        System.out.println();
        System.out.println("float one = " + floatOne);
        System.out.println("float two = " + floatTwo);

        // doubles outputs
        System.out.println();
        System.out.println("short one = " + shortOne);
        System.out.println("short two = " + shortTwo);

    }
}
