//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 01/28/19
//Class - 10th
//Lab  - Find Next Num

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
    for (int num: numArray) {
      System.out.print(num + " ");
    }
    System.out.println();
    Arrays.sort(numArray);
    
    int numIndexFound = Arrays.binarySearch(numArray, searchNum + 1);
    
    if (numIndexFound >= 0) {
      return numArray[numIndexFound];
    } else {
      while (numIndexFound < 0) {
        searchNum++;
        numIndexFound = Arrays.binarySearch(numArray, searchNum);
      }
      return numArray[numIndexFound];
    }
	}
}