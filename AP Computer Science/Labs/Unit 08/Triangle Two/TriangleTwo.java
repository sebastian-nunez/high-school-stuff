
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 12/07/18
// Class - 10th
// Lab - Tringle Two

import static java.lang.System.*;

public class TriangleTwo {
    private int size;

    private String letter;

    public TriangleTwo() {
        size = 0;
        letter = "";
    }

    public TriangleTwo(String let, int sz) {
        setTriangle(sz, let);
    }

    public void setTriangle(int count, String let) {
        size = count;
        letter = let;
    }

    public String getLetter() {
        String output = "";

        for (int rows = size; rows > 0; rows--) {
            for (int cols = 1; cols <= rows; cols++) {
                output += letter;
            }
            output += "\n";
        }

        return output;
    }

    public String toString() {
        String output = getLetter();
        return output + "\n";
    }
}
