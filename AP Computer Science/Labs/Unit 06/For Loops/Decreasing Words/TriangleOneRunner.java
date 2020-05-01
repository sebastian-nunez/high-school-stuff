// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/02/18
// Class - 10th
// Lab - Decreasing Word

import static java.lang.System.*;

public class TriangleOneRunner
{
    public static void main(String[] args) {
        //add test cases
        TriangleOne test = new TriangleOne("hippo");
        test.print();
        out.println();

        test.setWord("abcd");
        test.print();
        out.println();

        test.setWord("it");
        test.print();
        out.println();

        test.setWord("a");
        test.print();
        out.println();

        test.setWord("chicken");
        test.print();
        out.println();
    }
}
