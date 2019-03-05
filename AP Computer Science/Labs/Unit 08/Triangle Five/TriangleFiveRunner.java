
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 12/12/18
// Class - 10th
// Lab - Triangle 5

import static java.lang.System.*;

public class TriangleFiveRunner
{
    public static void main(String args[]) {
        // Test cases
        TriangleFive run = new TriangleFive('C', 4);
        System.out.println(run);
        System.out.println();

        run.setLetter('A');
        run.setAmount(5);
        System.out.println(run);
        System.out.println();

        run.setLetter('B');
        run.setAmount(7);
        System.out.println(run);
        System.out.println();

        run.setLetter('X');
        run.setAmount(6);
        System.out.println(run);
        System.out.println();

        run.setLetter('Z');
        run.setAmount(8);
        System.out.println(run);
        System.out.println();
    }
}
