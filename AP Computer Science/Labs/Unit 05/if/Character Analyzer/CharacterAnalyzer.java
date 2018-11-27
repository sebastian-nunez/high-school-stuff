//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 10/11/18
//Class - 10th
//Lab  - Character Analyzer 

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
      theChar = 0;
	}

	public CharacterAnalyzer(char c)
	{
      setChar(c);
	}

	public void setChar(char c)
	{
      theChar = c;
	}

	public char getChar()
	{
      char output = theChar;
		return output;
	}

	public boolean isUpper( )
	{
      if (theChar >= 65 && theChar <= 90)
         return true;
		return false;
	}

	public boolean isLower( )
	{
      if (theChar >= 97 && theChar <= 122)
         return true;
		return false;
	}
	
	public boolean isNumber( )
	{
      if (theChar >= 0 && theChar <= 127)
         return true;
		return false;
	}	

	public int getASCII( )
	{
      int output = theChar;
		return output;
	}

	public String toString()
	{
      if (isLower())
		   return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	
      if (isUpper())
         return ""+getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";
      if (isNumber())
         return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
      return "Try again...";
	}
}