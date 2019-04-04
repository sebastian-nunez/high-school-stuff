// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/23/18
// Class - 10th
// Lab - Morse Code

import static java.lang.System.*;

public class MorseCode
{
  private char letter;

  public MorseCode() {
    letter = 0;
  }

  public MorseCode(char let) {
    setChar(let);
  }

  public void setChar(char let) {
    letter = let;
  }

  public String getMorseCode() {
    switch (letter) {
      case 'A':
        return ".-";
      case 'B':
        return "-...";
      case 'C':
        return "-.-.";
      case 'D':
        return "-..";
      case 'E':
        return ".";
      case 'F':
        return "..-.";
      case 'G':
        return "--.";
      case 'H':
        return "....";
      case 'I':
        return "..";
      case 'J':
        return ".---";
      case 'K':
        return "-.-";
      case 'L':
        return ".-..";
      case 'M':
        return "--";
      case 'N':
        return "-.";
      case 'O':
        return "---";
      case 'P':
        return ".--.";
      case 'Q':
        return "--.-";
      case 'R':
        return ".-.";
      case 'S':
        return "...";
      case 'T':
        return "-";
      case 'U':
        return ".--";
      case 'V':
        return "...-";
      case 'W':
        return ".--";
      case 'X':
        return "-..-";
      case 'Y':
        return "-.--";
      case 'Z':
        return "--..";
      case '0':
        return "-----";
      case '1':
        return ".----";
      case '2':
        return "..---";
      case '3':
        return "...--";
      case '4':
        return "....-";
      case '5':
        return ".....";
      case '6':
        return "-....";
      case '7':
        return "--...";
      case '8':
        return "---..";
      case '9':
        return "----.";

    }

    return "ERORR...?";
  }

  public String toString() {
    return getMorseCode() + "\n" + letter + " is " + getMorseCode() + " in morse!\n\n";
  }
}
