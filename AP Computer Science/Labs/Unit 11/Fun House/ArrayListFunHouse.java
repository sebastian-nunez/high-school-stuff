// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 02/12/19
// Class - 10th
// Lab - ArrayList Fun House

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class ArrayListFunHouse
{
    public static ArrayList<Integer> getListOfFactors(int number) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                output.add(i);
            }
        }

        return output;
    }

    public static void keepOnlyCompositeNumbers(List<Integer> nums) {
        int index = nums.size() - 1;
        while (index >= 0) {
            ArrayList<Integer> temp = ArrayListFunHouse.getListOfFactors(nums.get(index));

            if (temp.size() == 0) {
                nums.remove(index);
            }

            index--;
        }
    }
}
