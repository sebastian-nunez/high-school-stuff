//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 10/22/18
//Class - 10th
//Lab  - Hex to Binary  

import static java.lang.System.*; 

public class HexToBinary
{
	private char hex;

	public HexToBinary()
	{
      hex = '0';
	}

	public HexToBinary(char hexNum)
	{
      setHex(hexNum);
	}

	public void setHex(char hexNum)
	{
      hex = hexNum;
	}

	public String getBinary()
	{
      if (hex == 'A')
         return "1010";
      else if (hex == 'B')
         return "1011";
      else if (hex == 'C')
         return "1100";
      else if (hex == 'D')
         return "1101";
      else if (hex == 'E')
         return "1110";
      else if (hex == 'F')
         return "1111";
		return "ERROR";
	}

	public String toString()
	{
		return hex + " is " + getBinary() + " in binary!\n";
	}
}