
//� A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 10/17/18
//Class - 10th
//Lab  - Number Compare

import static java.lang.System.*;

public class NumberCompare {
    private int one, two;

    public NumberCompare() {
        one = 0;
        two = 0;
    }

    public NumberCompare(int n1, int n2) {
        setNums(n1, n2);
    }

    public void setNums(int n1, int n2) {
        one = n1;
        two = n2;
    }

    public int getLargest() {
        if (one > two)
            return one;
        else
            return two;
    }

    public int getSmallest() {
        if (one < two)
            return one;
        else
            return two;
    }

    public String toString() {
        return getSmallest() + " -- " + getLargest();
    }
}
