
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/11/18
// Class - 10th
// Lab - String Ends With

import static java.lang.System.*;
import java.util.Scanner;

public class StringUtilities
{
  public static boolean endsWith(String a, String b) {
    int lowerBound = a.length() - b.length();
    int upperBound = a.length();

    if (a.substring(lowerBound, upperBound).equals(b))
      return true;
    return false;
  }
}
