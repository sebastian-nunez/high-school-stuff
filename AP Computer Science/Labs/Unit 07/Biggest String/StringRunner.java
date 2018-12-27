//© A+ Computer Science  -  www.apluscompsci.com
//Name -  Sebastian Nunez
//Date - 11/28/18
//Class - 10th 
//Lab  - Biggest String

import static java.lang.System.*;

public class StringRunner
{
	public static void main(String args[])
	{
		//add test cases
      BiggestString test = new BiggestString();
      
      test.setStrings("abc", "cba", "bca");
      out.println(test);
      out.println(test.getBiggest()+ "\n");
            
      test.setStrings("one" ,"fourteen" ,"twenty");
      out.println(test);
      out.println(test.getBiggest()+ "\n");
            
      test.setStrings("124323" ,"20009" ,"3434");
      out.println(test);
      out.println(test.getBiggest()+ "\n");
            
      test.setStrings("abcde", "ABCDE", "1234234324");
      out.println(test);
      out.println(test.getBiggest()+ "\n");

	}
}