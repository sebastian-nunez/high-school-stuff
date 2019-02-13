
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 02/12/19
// Class - 10th
// Lab - ArrayList Fun House

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
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
    System.out.println("Original List \n" + nums + "\n");

    ArrayList<Integer> output = new ArrayList<Integer>();

    for (Integer num: nums) {
      ArrayList<Integer> temp = ArrayListFunHouse.getListOfFactors(num);

      if (temp.size() > 0) {
        output.add(num);
      }
    }

    System.out.println("Composite List \n" + output);
  }
}
