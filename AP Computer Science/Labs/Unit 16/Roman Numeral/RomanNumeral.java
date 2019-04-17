//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class RomanNumeral implements Comparable<RomanNumeral>
{
  private final static int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
  private final static String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
  private Integer number;
  private String roman;

  public RomanNumeral(String str) {
    setRoman(str);
  }

  public RomanNumeral(Integer orig) {
    setNumber(orig);
  }

  //write get methods for number and roman
  public int getNumber() {
    return number;
  }

  //write a set number method
  public void setNumber(Integer orig) {
    String romanCopy = "";
    int numCopy = orig;

    int index = 0;
    for (int num : NUMBERS) {
      while (numCopy >= num) {
        romanCopy += LETTERS[index];
        numCopy -= num;
      }
      index++;
    }

    number = orig;
    roman = romanCopy;
  }

  public String getRoman() {
    return roman;
  }

  //write a set roman method
  public void setRoman(String str) {
    String romanCopy = str;
    int numberCopy = 0;

    while (romanCopy.length() > 0) {
      int index = 0;

      for (String letter : LETTERS) {
        if (romanCopy.length() == 1) {
          String firstRoman = romanCopy.substring(0, 1);

          if (firstRoman.equals(letter)) {
            numberCopy += NUMBERS[index];
            romanCopy = romanCopy.substring(1);
          }

          index++;
        } else if (romanCopy.length() > 1) {
          String firstRoman = romanCopy.substring(0, 1);
          String firstRomanPair = romanCopy.substring(0, 2);

          if (firstRoman.equals(letter)) {
            numberCopy += NUMBERS[index];
            romanCopy = romanCopy.substring(1);
          } else if (firstRomanPair.equals(letter)) {
            numberCopy += NUMBERS[index];
            romanCopy = romanCopy.substring(2);
          }

          index++;
        }
      }
    }

    roman = str;
    number = numberCopy;
  }

  public int compareTo(RomanNumeral r) {
    return getNumber() - r.getNumber();
  }

  //write  toString() method
  public String toString() {
    return roman + "\n";
  }
}