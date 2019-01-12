
// © A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 04/01/19
// Class - 10th
// Lab - Group Counter

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats
{
    //instance variable
    private int[] array;

    //constructor
    public ArrayStats(int[] arr) {
        setArray(arr);
    }

    //set method
    public void setArray(int[] arr) {
        array = arr;
    }

    public int getCount(int groupSize) {
        int cnt = 0;
        int baseNumIndex = 0;
        int index = 0;
        int subGroupSize = 0;
        do {
            subGroupSize++;
            index++;
            if (index == array.length) {
                if (array[index - 1] == array[baseNumIndex]) {
                    if (subGroupSize >= groupSize) {
                        cnt++;
                    }
                }
                break;
            } else if (array[baseNumIndex] != array[index]) {
                if (subGroupSize >= groupSize) {
                    cnt++;
                }
                baseNumIndex = index;
                subGroupSize = 0;
            }
        } while (array[baseNumIndex] == array[index]);
        return cnt;
    }

    public String toString() {
        return Arrays.toString(array);
    }
}
