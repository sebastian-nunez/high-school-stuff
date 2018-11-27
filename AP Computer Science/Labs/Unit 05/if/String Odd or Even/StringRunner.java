//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 10/10/18
//Class - 10th
//Lab  - String - Odd/Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
      //instantiation 
      Scanner keyboard = new Scanner(in);
      StringOddOrEven test = new StringOddOrEven();
      
      //inputs
      out.print("Enter a word :: ");
      test.setString(keyboard.next());
      test.print();
      
      out.print("Enter a word :: ");
      test.setString(keyboard.next());
      test.print();
      
      out.print("Enter a word :: ");
      test.setString(keyboard.next());
      test.print();
      
      out.print("Enter a word :: ");
      test.setString(keyboard.next());
      test.print();
      
      out.print("Enter a word :: ");
      test.setString(keyboard.next());
      test.print();
      
      out.print("Enter a word :: ");
      test.setString(keyboard.next());
      test.print();
      
      out.print("Enter a word :: ");
      test.setString(keyboard.next());
      test.print();
      
      out.print("Enter a word :: ");
      test.setString(keyboard.next());
      test.print();
	}
}