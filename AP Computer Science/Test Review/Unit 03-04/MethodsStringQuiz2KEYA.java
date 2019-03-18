//© A+ Computer Science  -  www.apluscompsci.com

//methods / strings quiz 2  

import static java.lang.System.*;

class LetterFun
{
   private String word;

   public LetterFun(String s)
   {
      setString(s);
   }	              
 
   public void setString(String s)
   {
		word = s;
   }	              
   
   public char getLastLetter()
   {  
		return word.charAt(word.length()-1);
   }

   public char getFirstLetter()
   {  
		return word.charAt(0);
   }

   public String toString()
   {  
		return word;
   }
}

public class MethodsStringQuiz2KEYA
{
   public static void main(String args[])
   {	
		//code in the main of another class
		LetterFun getIt = new LetterFun("Spider");
		System.out.println(getIt.getFirstLetter());
		System.out.println(getIt.getLastLetter());
		System.out.println(getIt);
   }
}