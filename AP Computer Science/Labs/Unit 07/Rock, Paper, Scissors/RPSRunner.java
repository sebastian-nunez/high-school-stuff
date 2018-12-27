//© A+ Computer Science  -  www.apluscompsci.com
//Name -  Sebastian Nunez
//Date - 11/28/18
//Class - 10th
//Lab  - Rock Paper Scissors

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			do {
         String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
         player = keyboard.next();
			
			//read in the player value
			RockPaperScissors game = new RockPaperScissors();
         game.setPlayers(player);
         out.println(game);
         out.println(game.determineWinner() + "\n");
         
         //asks player if he wishes to play again
         out.print("Do you want to play again? [Y/N] ");
         response = keyboard.next().charAt(0);
         out.println();
         
         } while(response == 'y' || response == 'Y');
         		
	}
}



