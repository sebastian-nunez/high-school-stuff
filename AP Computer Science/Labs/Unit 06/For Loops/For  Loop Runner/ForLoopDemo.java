// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/02/18
// Class - 10th
// Lab - For Loop Runner

import static java.lang.System.out;

public class ForLoopDemo
{
    //instance variables and constructors could be used, but are not really needed

    //runForLoop() will run a for loop from start to stop going up by increment
    public static void runForLoop(int start, int stop, int increment) {
        out.print("start " + start + " : stop " + stop + " : increment " + increment + "\n");
        for (int i = start; i < stop; i += increment) {
            out.print(i + " ");
        }
        out.println();
    }
}
