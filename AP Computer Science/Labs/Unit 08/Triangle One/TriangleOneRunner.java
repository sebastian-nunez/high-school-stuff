// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 12/07/18
// Class - 10th
// Lab - Triangle One

import java.util.Scanner;

import static java.lang.System.*;

public class TriangleOneRunner
{

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    String choice = "";

    do {
      out.print("Enter the size of the triangle : ");
      int big = keyboard.nextInt();
      out.print("Enter a letter : ");
      String value = keyboard.next();

      // static methods can be called using the class name
      System.out.println(TriangleOne.createTriangle(value, big));

      System.out.print("Do you want to enter more data? ");
      choice = keyboard.next();
    } while (choice.equals("Y") || choice.equals("y"));
  }

}
