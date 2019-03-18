//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.out;

public class NumberAnalyzerRunner
{
    public static void main(String args[]) {
        NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
        out.println(test);
        out.println("odd count = " + test.countOdds());
        out.println("even count = " + test.countEvens());
        out.println("perfect count = " + test.countPerfects() + "\n\n\n");

        //add more test cases

    }
}