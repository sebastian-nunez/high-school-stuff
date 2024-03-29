// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/26/18
// Class - 10th
// Lab - Miles Per Hour

import static java.lang.Math.*;
import static java.lang.System.*;

public class MilesPerHour
{
    private int distance, hours, minutes;
    private double mph;

    public MilesPerHour() {
        setNums(0, 0, 0);
        mph = 0.0;
    }

    public MilesPerHour(int dist, int hrs, int mins) {
        setNums(dist, hrs, mins);
    }

    public void setNums(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public void calcMPH() {
        double time = hours + (minutes / 60.0);
        mph = round(distance / time);

    }

    public void print() {
        out.println();
        out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + (int)mph + " MPH\n\n");
    }
}
