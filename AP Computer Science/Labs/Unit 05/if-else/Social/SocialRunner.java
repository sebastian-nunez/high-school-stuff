
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/17/18
// Class - 10th
// Lab - Social

import static java.lang.System.*;

public class SocialRunner {
    public static void main(String args[]) {
        //add test cases
        Social test = new Social();
        test.setWord("456-56-234");
        out.println(test);

        test.setWord("1-1-1");
        out.println(test);

        test.setWord("102-2-12");
        out.println(test);

        test.setWord("0-0-0");
        out.println(test);

    }
}
