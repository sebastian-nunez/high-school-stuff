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
    roman = str;
    number = 0;
  }

  public RomanNumeral(Integer orig) {
    number = orig;
    roman = "";
  }

  //write get methods for number and roman
  public int getNumber() {
    int output = 0;
    String localRoman = roman;

    while (localRoman.length() > 0) {
      int index = 0;
      for (String letter : LETTERS) {
        if (localRoman.length() == 1) {
          String firstRoman = localRoman.substring(0, 1);

          if (firstRoman.equals(letter)) {
            output += NUMBERS[index];
            localRoman = localRoman.substring(1);
          }

          index++;
        } else if (localRoman.length() > 1) {
          String firstRoman = localRoman.substring(0, 1);
          String firstRomanPair = localRoman.substring(0, 2);

          if (firstRoman.equals(letter)) {
            output += NUMBERS[index];
            localRoman = localRoman.substring(1);
          } else if (firstRomanPair.equals(letter)) {
            output += NUMBERS[index];
            localRoman = localRoman.substring(2);
          }

          index++;
        }
      }
    }

    return output;
  }

  //write a set number method
  public void setNumber(Integer num) {
    number = num;
  }

  public String getRoman() {
    return roman;
  }

  //write a set roman method
  public void setRoman(String rom) {
    roman = rom;
  }

  public int compareTo(RomanNumeral r) {
    return getNumber() - r.getNumber();
  }

  //write  toString() method
  public String toString() {
    String output = "";
    int index = 0;
    int localNum = number;

    for (int num : NUMBERS) {
      while (localNum >= num) {
        output += LETTERS[index];
        localNum -= num;
      }
      index++;
    }

    if (number == 0) {
      return roman;
    }

    return output + "\n";
  }

}