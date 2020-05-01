// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 01/25/19
// Class - 10th
// Lab - Word Sorter

import static java.lang.System.*;

public class WordSortRunner
{
    public static void main(String args[]) {
        //add test cases
        WordSort test = new WordSort("abc ABC 12321 fred alexander");
        test.sort();
        System.out.println(test);

        test.setList("a zebra friendly acrobatics 435 TONER PRinTeR");
        test.sort();
        System.out.println(test);

        test.setList("123 ABC abc 034 dog cat sally sue bob 2a2");
        test.sort();
        System.out.println(test);
    }
}
