//� A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 10/17/18
//Class - 10th
//Lab  - Social

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
      socialNum = "";
      sum = 0;
	}

	public Social(String soc)
	{
      setWord(soc);
	}


	public void setWord(String w)
	{
      socialNum = w;
	}

	public void chopAndAdd()
	{
		  int seg1 = Integer.parseInt(socialNum.substring(0,socialNum.indexOf("-")));
      int seg2 = Integer.parseInt(socialNum.substring(socialNum.indexOf("-") + 1,socialNum.lastIndexOf("-")));
      int seg3 = Integer.parseInt(socialNum.substring(socialNum.lastIndexOf("-") + 1, socialNum.length()));
      sum = seg1 + seg2 + seg3;
	}

	public String toString()
	{
      chopAndAdd();
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}
