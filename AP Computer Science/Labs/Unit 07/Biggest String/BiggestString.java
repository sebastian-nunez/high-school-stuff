// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/28/18
// Class - 10th
// Lab - Biggest String

import static java.lang.System.*;

public class BiggestString
{
  private String one, two, three;

  public BiggestString() {
    this("", "", "");
  }

  public BiggestString(String a, String b, String c) {
    setStrings(a, b, c);
  }

  public void setStrings(String a, String b, String c) {
    one = a;
    two = b;
    three = c;
  }

  public String getBiggest() {
    if (one.compareTo(two) > 0 && one.compareTo(three) > 0) {
      return "biggest = " + one;
    } else if (two.compareTo(three) > 0) {
      return "biggest = " + two;
    } else {
      return "biggest = " + three;
    }
  }

  public String toString() {
    return "" + one + " " + two + " " + three;
  }
}
