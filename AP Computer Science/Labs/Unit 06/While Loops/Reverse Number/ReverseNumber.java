//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sebastian Nunez

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

	//add constructors
	public ReverseNumber()
   {
      number = 0;
   }
   
   public ReverseNumber(int num)
   {
      setNum(num);
   }
	
	//add a set method
   public void setNum(int num)
   {
      number = num;
   }

	public int getReverse()
	{
		int rev=0;	
      String revString = "";
      
      while(number > 0)
      {
         revString += number % 10;
         number /= 10;
      }
      	
      rev = Integer.parseInt(revString);
		return rev;
	}

	//add  a toString	
   public String toString()
   {
      return number + " reversed is " + getReverse();
   }
	
}