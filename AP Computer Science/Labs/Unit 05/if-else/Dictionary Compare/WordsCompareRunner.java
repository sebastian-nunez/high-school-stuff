// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/17/18
// Class - 10th
// Lab - Dictionary Compare

import static java.lang.System.*;

public class WordsCompareRunner
{
    public static void main(String args[]) {
        //add test cases
        WordsCompare test = new WordsCompare();
        test.setWords("abe", "ape");
        out.println(test);

        test.setWords("giraffe", "gorilla");
        out.println(test);

        test.setWords("one", "two");
        out.println(test);

        test.setWords("fun", "funny");
        out.println(test);

        test.setWords("123", "19");
        out.println(test);

        test.setWords("193", "1910");
        out.println(test);

        test.setWords("goofy", "godfather");
        out.println(test);

        test.setWords("funnel", "fun");
        out.println(test);
    }
}
