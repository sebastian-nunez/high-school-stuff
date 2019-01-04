
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/02/18
// Class - 10th
// Lab - Greatest Common Divisor

import static java.lang.System.*;

public class GCDRunner
{
    public static void main(String[] args) {
        //add test cases
        GCD test = new GCD(5, 25);
        out.println(test);

        test.setNums(4, 400);
        out.println(test);

        test.setNums(8, 80);
        out.println(test);

        test.setNums(15, 45);
        out.println(test);

        test.setNums(9, 9);
        out.println(test);

        test.setNums(3, 543);
        out.println(test);
    }
}
