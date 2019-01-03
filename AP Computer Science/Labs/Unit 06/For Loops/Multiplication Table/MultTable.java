
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/02/18
// Class - 10th
// Lab - Multiplication Table

import static java.lang.System.*;

public class MultTable {
    private int number;
    private int stop;

    public MultTable() {
        number = stop = 0;
    }

    public MultTable(int num, int end) {
        setTable(num, end);
    }

    public void setTable(int num, int end) {
        number = num;
        stop = end;
    }

    public void printTable() {
        out.println("The multiplication table for " + number);
        for (int i = 1; i <= stop; i++) {
            out.println("" + i + "       " + number * i);
        }
    }
}
