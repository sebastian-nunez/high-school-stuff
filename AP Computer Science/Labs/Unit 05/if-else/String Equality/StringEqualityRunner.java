
//� A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 10/17/18
//Class - 10th
//Lab  - String Equality

import static java.lang.System.*;

public class StringEqualityRunner {
    public static void main(String args[]) {
        //add test cases
        StringEquality test = new StringEquality();
        test.setWords("hello", "goodbye");
        out.println(test);

        test.setWords("one", "two");
        out.println(test);

        test.setWords("three", "four");
        out.println(test);

        test.setWords("TCEA", "UIL");
        out.println(test);

        test.setWords("State", "Champions");
        out.println(test);

        test.setWords("ABC", "ABC");
        out.println(test);

        test.setWords("ABC", "CBA");
        out.println(test);

        test.setWords("Same", "Same");
        out.println(test);

    }
}
