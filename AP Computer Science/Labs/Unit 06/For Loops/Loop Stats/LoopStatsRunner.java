// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/02/18
// Class - 10th
// Lab - Loop Stats

import static java.lang.System.*;

public class LoopStatsRunner
{
    public static void main(String[] args) {
        //add test cases
        LoopStats test = new LoopStats(1, 5);
        out.println(test);

        test.setNums(2, 8);
        out.println(test);

        test.setNums(5, 15);
        out.println(test);
    }
}
