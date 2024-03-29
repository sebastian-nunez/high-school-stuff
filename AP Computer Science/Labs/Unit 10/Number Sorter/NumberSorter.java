// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 01/28/19
// Class - 10th
// Lab - Number Sorter

import java.util.Arrays;

public class NumberSorter
{
    //instance variables and other methods not shown

    private static int getNumDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] getSortedDigitArray(int number) {
        int[] sorted = new int[getNumDigits(number)];

        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = number % 10;
            number /= 10;
        }

        Arrays.sort(sorted);

        return sorted;
    }
}
