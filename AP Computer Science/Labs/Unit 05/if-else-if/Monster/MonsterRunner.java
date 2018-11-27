//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 10/23/18
//Class - 10th
//Lab  - Monster 

import java.util.Scanner;
import static java.lang.System.*; 

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
      
		String name;
      int size;
      
		//ask for name and size
      out.print("Enter 1st monster's name :: ");
      name = keyboard.next();
      out.print("Enter 1st monster's size :: ");
      size = keyboard.nextInt();
		
		//instantiate monster one
		Monster monsterOne = new Monster(name, size);
		
		//ask for name and size
		out.print("Enter 2nd monster's name :: ");
      name = keyboard.next();
      out.print("Enter 2nd monster's size :: ");
      size = keyboard.nextInt();
      
		//instantiate monster two
      Monster monsterTwo = new Monster(name, size);
     
      //compare the two monsters 
      out.println(monsterOne.comparedTo(monsterTwo));
      
      //ask for name and size
      out.print("\nEnter 1st monster's name :: ");
      name = keyboard.next();
      out.print("Enter 1st monster's size :: ");
      size = keyboard.nextInt();
		
		//instantiate monster one
		monsterOne = new Monster(name, size);
		
		//ask for name and size
		out.print("Enter 2nd monster's name :: ");
      name = keyboard.next();
      out.print("Enter 2nd monster's size :: ");
      size = keyboard.nextInt();
      
		//instantiate monster two
      monsterTwo = new Monster(name, size);
     
      //compare the two monsters 
      out.println(monsterOne.comparedTo(monsterTwo));

	}
}