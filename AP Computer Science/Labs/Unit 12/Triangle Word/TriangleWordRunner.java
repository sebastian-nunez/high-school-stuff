
// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String choice = "";
    do {
      out.print("\nEnter the letter for the box :: ");
      String word = keyboard.next();

      //call the printTriangle method
      TriangleWord.printTriangle(word);

      System.out.print("\nDo you want to enter more sample input? ");
      choice = keyboard.next();
    } while (choice.equals("Y") || choice.equals("y"));
  }
}
