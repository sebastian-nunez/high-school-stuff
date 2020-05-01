// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 12/26/18
// Class - 10th
// Lab - Roman Numeral

public class RomanNumeral
{
    private Integer number;
    private String roman;

    private final static int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    private final static String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public RomanNumeral(String str) {
        roman = str;
    }

    public RomanNumeral(Integer orig) {
        number = orig;
    }

    public void setNumber(Integer num) {
        number = num;
    }

    public void setRoman(String rom) {
        roman = rom;
    }

    public Integer getNumber() {
        Integer output = 0;

        while (roman.length() > 0) {
            int index = 0;
            for (String letter: LETTERS) {
                if (roman.length() == 1) {
                    String firstRoman = roman.substring(0, 1);
                    if (firstRoman.equals(letter)) {
                        output += NUMBERS[index];
                        roman = roman.substring(1);
                    }
                    index++;
                } else if (roman.length() > 1) {
                    String firstRoman = roman.substring(0, 1);
                    String firstRomanPair = roman.substring(0, 2);

                    if (firstRoman.equals(letter)) {
                        output += NUMBERS[index];
                        roman = roman.substring(1);
                    } else if (firstRomanPair.equals(letter)) {
                        output += NUMBERS[index];
                        roman = roman.substring(2);
                    }
                    index++;
                }

            }

        }
        return output;
    }

    public String toString() {
        String output = "";
        int index = 0;

        for (int num: NUMBERS) {
            while (number >= num) {
                output += LETTERS[index];
                number -= num;
            }
            index++;
        }

        return output + "\n";
    }
}
