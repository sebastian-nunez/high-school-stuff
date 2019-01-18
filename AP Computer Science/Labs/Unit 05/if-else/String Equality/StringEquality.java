
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/17/18
// Class - 10th
// Lab - String Equality

import static java.lang.System.*;

public class StringEquality
{
  private String wordOne, wordTwo;

  public StringEquality() {
    wordOne = "";
    wordTwo = "";
  }

  public StringEquality(String one, String two) {
    setWords(one, two);
  }

  public void setWords(String one, String two) {
    wordOne = one;
    wordTwo = two;
  }

  public boolean checkEquality() {
    if (wordOne.equals(wordTwo))
      return true;
    else
      return false;
  }

  public String toString() {
    if (checkEquality() == false)
      return wordOne + " does not have the same letters as " + wordTwo + "\n";
    else
      return wordOne + " has the same letters as " + wordTwo + "\n";
  }
}
