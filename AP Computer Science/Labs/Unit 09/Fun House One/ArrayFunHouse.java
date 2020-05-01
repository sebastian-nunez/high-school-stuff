// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 12/20/18
// Class - Fun House One
// Lab - 10th

public class ArrayFunHouse
{
    //instance variables and constructors could be used, but are not really needed

    //getSum() will return the sum of the numbers from start to stop, not including stop
    public static int getSum(int[] numArray, int start, int stop) {
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    //getCount() will return number of times val is present
    public static int getCount(int[] numArray, int val) {
        int count = 0;
        for (int item: numArray) {
            if (item == val) {
                count++;
            }
        }
        return count;
    }

    public static int[] removeVal(int[] numArray, int val) {
        int[] output = new int[numArray.length - getCount(numArray, val)];
        int index = 0;
        for (int item: numArray) {
            if (item != val) {
                output[index] = item;
                index++;
            }
        }
        return output;
    }
}
