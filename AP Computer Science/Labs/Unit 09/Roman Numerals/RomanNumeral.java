
//� A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 12/26/18
//Class - 10th
//Lab  - Roman Numeral

import static java.lang.System.*;

public class RomanNumeral {
    private Integer number;
    private String roman;

    private final static int[] NUMBERS = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

    private final static String[] LETTERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

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
        String firstRoman = roman.substring(roman.length() - 1);
        return Integer.valueOf(firstRoman);
    }

    public String toString() {
        String output = "";
        int index = 0;

        for (int num : NUMBERS) {
            while (number >= num) {
                output += LETTERS[index];
                number -= num;
            }
            index++;
        }

        return output + "\n";
    }
}
