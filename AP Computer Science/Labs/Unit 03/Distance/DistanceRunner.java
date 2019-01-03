
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/26/18
// Class - 10th
// Lab - Distance

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner {
    public static void main(String[] args) {
        //Scanner setup
        Scanner keyboard = new Scanner(in);

        //Input #1
        out.print("Enter X1 :: ");
        int x1 = keyboard.nextInt();

        out.print("Enter Y1 :: ");
        int y1 = keyboard.nextInt();

        out.print("Enter X2 :: ");
        int x2 = keyboard.nextInt();

        out.print("Enter Y2 :: ");
        int y2 = keyboard.nextInt();

        //Instantiation
        Distance test = new Distance(x1, y1, x2, y2);
        test.calcDistance();
        test.print();

        //Input #2
        out.print("Enter X1 :: ");
        x1 = keyboard.nextInt();

        out.print("Enter Y1 :: ");
        y1 = keyboard.nextInt();

        out.print("Enter X2 :: ");
        x2 = keyboard.nextInt();

        out.print("Enter Y2 :: ");
        y2 = keyboard.nextInt();

        test.setCoordinates(x1, y1, x2, y2);
        test.calcDistance();
        test.print();

        //Input #3
        out.print("Enter X1 :: ");
        x1 = keyboard.nextInt();

        out.print("Enter Y1 :: ");
        y1 = keyboard.nextInt();

        out.print("Enter X2 :: ");
        x2 = keyboard.nextInt();

        out.print("Enter Y2 :: ");
        y2 = keyboard.nextInt();

        test.setCoordinates(x1, y1, x2, y2);
        test.calcDistance();
        test.print();

    }
}
