
//� A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 09/26/18
//Class - 10th
//Lab  - Quadratic

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner {
    public static void main(String[] args) {
        //Scanner setup
        Scanner keyboard = new Scanner(in);

        //Input #1
        out.print("Enter a :: ");
        int quadA = keyboard.nextInt();

        out.print("Enter b :: ");
        int quadB = keyboard.nextInt();

        out.print("Enter c :: ");
        int quadC = keyboard.nextInt();

        //Instantiation
        Quadratic test = new Quadratic(quadA, quadB, quadC);
        test.calcRoots();
        test.print();

        //Input #2
        out.print("Enter a :: ");
        quadA = keyboard.nextInt();

        out.print("Enter b :: ");
        quadB = keyboard.nextInt();

        out.print("Enter c :: ");
        quadC = keyboard.nextInt();

        test.setEquation(quadA, quadB, quadC);
        test.calcRoots();
        test.print();

        //Input #3
        out.print("Enter a :: ");
        quadA = keyboard.nextInt();

        out.print("Enter b :: ");
        quadB = keyboard.nextInt();

        out.print("Enter c :: ");
        quadC = keyboard.nextInt();

        test.setEquation(quadA, quadB, quadC);
        test.calcRoots();
        test.print();

    }
}
