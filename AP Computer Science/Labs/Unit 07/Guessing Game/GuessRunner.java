
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/29/18
// Class - 10th
// Lab - Guessing Game

import java.util.Scanner;

public class GuessRunner
{
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    char response;

    do {
      System.out.print("Guessing Game - how many numbers? :: ");
      int input = keyboard.nextInt();

      GuessingGame run = new GuessingGame(input);

      run.playGame();

      System.out.print("Do you want to play again? [Y/N] :: ");
      response = keyboard.next().charAt(0);
      System.out.println();

    } while (Character.toUpperCase(response) == 'Y');
  }
}
