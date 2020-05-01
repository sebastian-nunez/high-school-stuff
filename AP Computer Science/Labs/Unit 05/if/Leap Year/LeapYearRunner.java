// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/09/18
// Lab - Leap Year

import java.util.Scanner;

import static java.lang.System.*;

public class LeapYearRunner
{
    public static void main(String args[]) {
        //instantiation
        Scanner keyboard = new Scanner(System.in);
        LeapYear test = new LeapYear();

        //inputs
        out.print("Enter a year :: ");
        int year = keyboard.nextInt();
        test.result(year);

        out.print("Enter a year :: ");
        year = keyboard.nextInt();
        test.result(year);

        out.print("Enter a year :: ");
        year = keyboard.nextInt();
        test.result(year);

        out.print("Enter a year :: ");
        year = keyboard.nextInt();
        test.result(year);

        out.print("Enter a year :: ");
        year = keyboard.nextInt();
        test.result(year);

        out.print("Enter a year :: ");
        year = keyboard.nextInt();
        test.result(year);

        out.print("Enter a year :: ");
        year = keyboard.nextInt();
        test.result(year);

        out.print("Enter a year :: ");
        year = keyboard.nextInt();
        test.result(year);
    }
}
