
// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

import static java.lang.System.*;

public class TenToAnyRunner {
    public static void main(String args[]) {
        //add test cases
        TenToAny test = new TenToAny(234, 9);
        out.println(test + "\n");

        test.setNums(100, 2);
        out.println(test + "\n");

        test.setNums(10, 2);
        out.println(test + "\n");

        test.setNums(15, 2);
        out.println(test + "\n");

        test.setNums(256, 2);
        out.println(test + "\n");

        test.setNums(100, 8);
        out.println(test + "\n");

        test.setNums(250, 16);
        out.println(test + "\n");

        test.setNums(56, 11);
        out.println(test + "\n");

        test.setNums(89, 5);
        out.println(test + "\n");

        test.setNums(23, 3);
        out.println(test + "\n");

        test.setNums(50, 4);
        out.println(test + "\n");

        test.setNums(55, 6);
        out.println(test + "\n");

        test.setNums(2500, 16);
        out.println(test + "\n");

        test.setNums(2500, 13);
        out.println(test + "\n");

    }
}
