// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/02/18
// Class - 10th
// Lab - Backwards String

import static java.lang.System.*;

public class Word
{
  private String word;

  public Word() {
    word = "";
  }

  public Word(String s) {
    setString(s);
  }

  public void setString(String s) {
    word = s;
  }

  public char getFirstChar() {
    return word.charAt(0);
  }

  public char getLastChar() {
    return word.charAt(word.length() - 1);
  }

  public String getBackWards() {
    String back = "";
    for (int i = word.length() - 1; i > -1; i--) {
      back += word.substring(i, i + 1);
    }
    return back;
  }

  public String toString() {
    return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word + "\n";
  }
}
