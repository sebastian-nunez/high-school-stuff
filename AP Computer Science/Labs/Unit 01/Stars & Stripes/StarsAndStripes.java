
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/09/18
// Class - 10th
// Lab - Stars & Stripes

import static java.lang.System.*;

public class StarsAndStripes {
    public StarsAndStripes() {
        out.println("StarsAndStripes");
    }

    public void printTwentyStars() {
        out.println("********************");
    }

    public void printTwentyDashes() {
        out.print("--------------------\n");
    }

    public void printTwoBlankLines() {
        out.print("\n");
        out.print("\n");
    }

    public void printASmallBox() {
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
    }

    public void printABigBox() {
        printASmallBox();
        printASmallBox();
    }
}
