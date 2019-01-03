
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/28/18
// Class - 10th
// Lab - Adding Strings

import static java.lang.System.*;

public class AddStrings {
    private String first, last;
    private String sum;

    public AddStrings() {
        first = "";
        last = "";
        sum = "";
    }

    public AddStrings(String one, String two) {
        setStrings(one, two);
    }

    public void setStrings(String one, String two) {
        first = one;
        last = two;
    }

    public void add() {
        sum = first + " " + last;
    }

    public String toString() {
        return "first :: " + first + "\nlast :: " + last + "\nsum :: " + sum + "\n";
    }
}
