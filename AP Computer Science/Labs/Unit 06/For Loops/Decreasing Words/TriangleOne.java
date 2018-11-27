//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 11/02/18
//Class - 10th
//Lab  - Decreasing Word

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
      setWord(s);
	}

	public void setWord(String s)
	{
      word = s;
	}

	public void print( )
	{
      for (int i = word.length(); i > 0; i--){
         out.println(word.substring(0,i));
      }
	}
}
