
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 12/23/18
// Class - 10th
// Lab - Odds and Evens

public class OddsAndEvens
{
    private static int countEm(int[] array, boolean odd) {
        int oddCount = 0;
        for (int item: array) {
            if (item % 2 != 0) {
                oddCount++;
            }
        }
        if (odd) {
            return oddCount;
        } else {
            return array.length - oddCount;
        }
    }

    public static int[] getAllEvens(int[] array) {
        int[] output = new int[countEm(array, false)];
        int index = 0;
        for (int item: array) {
            if (item % 2 == 0) {
                output[index] = item;
                index++;
            }

        }
        return output;
    }

    public static int[] getAllOdds(int[] array) {
        int[] output = new int[countEm(array, true)];
        int index = 0;
        for (int item: array) {
            if (item % 2 != 0) {
                output[index] = item;
                index++;
            }

        }
        return output;
    }
}
