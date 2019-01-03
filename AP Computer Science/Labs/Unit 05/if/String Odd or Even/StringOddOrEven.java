
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/10/18
// Class - 10th
// Lab - String - Odd/Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven {
    private String word;

    public StringOddOrEven() {
        word = "";
    }

    public StringOddOrEven(String s) {
        setString(s);
    }

    public void setString(String s) {
        word = s;
    }

    public boolean isEven() {
        int calc = word.length() % 2;

        if (calc == 0)
            return true;

        return false;
    }

    public void print() {
        if (isEven())
            out.println(word + " is even." + "\n");
        else
            out.println(word + " is odd." + "\n");
    }

    public String toString() {
        String output = "word :: " + word;
        return output;
    }
}
