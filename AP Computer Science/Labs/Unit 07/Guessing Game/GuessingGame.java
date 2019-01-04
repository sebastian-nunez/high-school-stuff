
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/29/18
// Class - 10th
// Lab - Guessing Game

import java.util.Scanner;

public class GuessingGame
{
    private int upperBound;

    public GuessingGame(int stop) {
        upperBound = stop;
    }

    public void playGame() {
        try {
            Scanner keyboard = new Scanner(System.in);

            int randNum = (int)(Math.random() * upperBound) + 1;
            int numGuess = 0;
            int guess = -1;

            do {
                System.out.print("Enter a number between 1 and " + upperBound + " :: ");
                guess = keyboard.nextInt();

                if ((guess < 1) || (guess > upperBound)) {
                    System.out.println("The number is out of range!");
                } else if (randNum == guess) {
                    numGuess++;
                    System.out.println("\nIt took you " + numGuess + " guesses to guess " + randNum + "\n");
                } else {
                    numGuess++;
                }

            } while (guess != randNum);
        } finally {
            keyboard.close();
        }

    }

    public String toString() {
        String output = "Wa'chu lookin' faux?";
        return output;
    }
}
