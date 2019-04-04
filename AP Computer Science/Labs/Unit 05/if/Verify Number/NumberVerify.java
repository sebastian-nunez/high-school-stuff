// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/09/18
// Class - 10th
// Lab - Number Verify

public class NumberVerify
{
  public static boolean isOdd(int num) {
    int calc = num % 2;

    if (calc != 0)
      return true;

    return false;
  }

  public static boolean isEven(int num) {
    int calc = num % 2;

    if (calc == 0)
      return true;

    return false;
  }
}
