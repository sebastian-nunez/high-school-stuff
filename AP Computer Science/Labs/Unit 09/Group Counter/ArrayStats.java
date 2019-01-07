
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
        int tempCnt = 0;
        int baseNum = array[0];
        int indexOfBaseNum = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == baseNum) {
                tempCnt++;
                if (tempCnt % groupSize == 0) {
                    cnt++;
                    tempCnt = 0;
                    for (int nextDifNum = index + 1; nextDifNum < array.length; nextDifNum++) {
                        if (array[index] != array[nextDifNum]) {
                            index = nextDifNum - 1;
                            baseNum = array[nextDifNum];
                            indexOfBaseNum = nextDifNum;
                            break;
                        } else if (nextDifNum == array.length - 1) {
                            index = array.length - 1;
                            indexOfBaseNum = array.length - 1;
                            break;
                        }
                    }
                }
            } else if (index - indexOfBaseNum == 1) {
                baseNum = array[index];
                tempCnt = 0;
            } else {
                baseNum = array[index - 1];
                tempCnt = 0;
            }
        }
        return cnt;
    }

    public String toString() {
        return Arrays.toString(array);
    }
}
