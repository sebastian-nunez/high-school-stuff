// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/01/2018
// Class - 10th
// Lab - String Ripper

import static java.lang.System.*;

public class StringRipper
{
  private String word;

  public StringRipper() {
    word = "";
  }

  public StringRipper(String s) {
    setString(s);
  }

  public void setString(String s) {
    word = s;
  }

  public String ripString(int x, int y) {
    return word.substring(x, y);
  }

  public String toString() {
    return word + "\n\n";
  }
}
