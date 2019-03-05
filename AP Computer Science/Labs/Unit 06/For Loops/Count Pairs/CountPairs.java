
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/31/18
// Class - 10th
// Lab - Count Pairs

import static java.lang.System.*;

public class CountPairs
{
    public static int pairCounter(String str) {
        int count = 0;
        char prevLetter = str.charAt(0);

        for (int i = 1; i <= str.length() - 1; i++) {
            if (prevLetter == str.charAt(i))
                count++;
            prevLetter = str.charAt(i);
        }
        return count;
    }
}
