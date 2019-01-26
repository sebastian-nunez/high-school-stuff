
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 01/25/19
// Class - 10th
// Lab - Lucky 7s

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
  public static int[] makeLucky7Array(int size) {
    int[] output = new int[size];
    for (int i = 0; i < size; i++) {
      output[i] = (int)((Math.random() * 9) + 1);
    }
    return output;
  }

  public static void shiftEm(int[] array) {
    System.out.println(Arrays.toString(array));
    int j = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 7) {
        int temp = array[j];
        array[j] = 7;
        array[i] = temp;
        j++;
      }
    }
    System.out.println(Arrays.toString(array) + "\n");
  }
}
