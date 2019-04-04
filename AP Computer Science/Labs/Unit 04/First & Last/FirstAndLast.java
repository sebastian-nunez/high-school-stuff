// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/28/18
// Class - 10th
// Lab - First & Last

import static java.lang.System.*;

public class FirstAndLast
{
  private String word;

  public FirstAndLast(String s) {
    setString(s);
  }

  public void setString(String s) {
    word = s;
  }

  public String getFirst() {
    return word.substring(0, 1);
  }

  public String getLast() {
    return word.substring(word.length() - 1);
  }

  public String toString() {
    String output = "word " + word + "\nfirst letter :: " + getFirst() + "\nlast letter :: " + getLast() + "\n";
    return output;
  }
}
