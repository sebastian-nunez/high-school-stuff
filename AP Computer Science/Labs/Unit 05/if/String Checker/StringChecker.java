
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/11/18
// Class - 10th
// Lab - String Checker

import static java.lang.System.*;

public class StringChecker
{
  private String word;

  public StringChecker() {
    word = "";
  }

  public StringChecker(String s) {
    setString(s);
  }

  public void setString(String s) {
    word = s;
  }

  public boolean findLetter(char c) {
    int index = word.indexOf(c);
    if (index != -1)
      return true;
    return false;
  }

  public boolean findSubString(String s) {
    int index = word.indexOf(s);
    if (index != -1)
      return true;
    return false;
  }

  public String toString() {
    return word + "\n\n";
  }
}
