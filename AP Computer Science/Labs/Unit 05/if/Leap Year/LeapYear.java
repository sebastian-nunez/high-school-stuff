//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 10/09/18
//Lab  - Leap Year

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYear
{
	public static boolean isLeapYear( int year )
	{
      int calc = year % 4;
      
      if (calc == 0)
         return true;
         
      return false;
	}
   
   public void result(int year)
   {
      if (isLeapYear(year))
         out.println(year + " is a leap year.\n");
      if (isLeapYear(year) == false)
         out.println(year + " NOT a leap year.\n");
   }
}