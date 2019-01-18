
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/26/18
// Class - 10th
// Lab - Miles Per Hour

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(in);

    //Input #1
    out.print("Enter the distance :: ");
    int dist = keyboard.nextInt();

    out.print("Enter the hours :: ");
    int hrs = keyboard.nextInt();

    out.print("Enter the minutes :: ");
    int mins = keyboard.nextInt();

    //Instantiation
    MilesPerHour test = new MilesPerHour(dist, hrs, mins);
    test.calcMPH();
    test.print();

    //Input #2
    out.print("Enter the distance :: ");
    dist = keyboard.nextInt();

    out.print("Enter the hours :: ");
    hrs = keyboard.nextInt();

    out.print("Enter the minutes :: ");
    mins = keyboard.nextInt();

    test.setNums(dist, hrs, mins);
    test.calcMPH();
    test.print();

    //Input #3
    out.print("Enter the distance :: ");
    dist = keyboard.nextInt();

    out.print("Enter the hours :: ");
    hrs = keyboard.nextInt();

    out.print("Enter the minutes :: ");
    mins = keyboard.nextInt();

    test.setNums(dist, hrs, mins);
    test.calcMPH();
    test.print();

    //Input #4
    out.print("Enter the distance :: ");
    dist = keyboard.nextInt();

    out.print("Enter the hours :: ");
    hrs = keyboard.nextInt();

    out.print("Enter the minutes :: ");
    mins = keyboard.nextInt();

    test.setNums(dist, hrs, mins);
    test.calcMPH();
    test.print();
  }
}
