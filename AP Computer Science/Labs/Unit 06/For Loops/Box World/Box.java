
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/02/18
// Class - 10th
// Lab - Box World

import static java.lang.System.*;

public class Box
{
  private String word;

  public Box() {
    word = "";
  }

  public Box(String s) {
    setWord(s);
  }

  public void setWord(String s) {
    word = s;
  }

  public void print() {
    for (int i = 0; i <= word.length() - 1; i++) {
      out.println(word);
    }
    out.println();
  }
}
