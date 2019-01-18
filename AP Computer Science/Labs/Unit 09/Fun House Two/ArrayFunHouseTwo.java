
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 12/23/18
// Class - 10th
// Lab - Fun House Two

public class ArrayFunHouseTwo
{
  //goingUp() will return true if all numbers
  //in numArray are in increasing order
  //[1,2,6,9,23] returns true
  //[9, 11, 13, 8]  returns false
  public static boolean goingUp(int[] numArray) {
    int prevNum = 0;
    int count = 0;

    for (int item: numArray) {
      if (prevNum <= item) {
        count++;
      }
      prevNum = item;
    }

    if (count == numArray.length)
      return true;
    else
      return false;
  }

  //goingDown() will return true if all numbers
  //in numArray are in decreasing order
  //[31,12,6,2,1] returns true
  //[31, 20, 10, 15, 9] returns false
  public static boolean goingDown(int[] numArray) {
    int prevNum = numArray[0];
    int count = 0;

    for (int item: numArray) {
      if (prevNum >= item) {
        count++;
      }
      prevNum = item;
    }

    if (count == numArray.length)
      return true;
    else
      return false;

  }

  //getValuesBiggerThanX will return an array that contains
  //count number of values that are larger than parameter x
  //[1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
  public static int[] getCountValuesBiggerThanX(int[] numArray, int count, int x) {
    int[] output = new int[count];

    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] == x) {
        for (int j = 0; j < count; j++) {
          if (numArray[i] <= numArray[i + (j + 1)]) {
            output[j] = numArray[i + (j + 1)];
          }
        }
        break;
      }
    }
    return output;
  }
}
