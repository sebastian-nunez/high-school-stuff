
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/01/18
// Class - 10th
// Lab - Vowel Counter

import static java.lang.System.*;

public class VowelCounter
{
  public static String getNumberString(String s) {
    int count = 0;
    String finalString = "";

    for (int i = 0; i <= s.length() - 1; i++) {
      if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i'
          || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u'
          || s.charAt(i) == 'U') {
        if (count > 9) {
          count = 0;
        }
        finalString += count;
        count++;
      } else {
        finalString += s.substring(i, i + 1);
      }
    }
    return finalString;
  }
}
