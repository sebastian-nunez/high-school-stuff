// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/23/18
// Class - 10th
// Lab - Monster

import java.util.Scanner;

import static java.lang.System.out;

public class MonsterRunner
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int size;
        String response;

        do {
            //ask for name and size
            out.print("Enter 1st monster's name :: ");
            name = keyboard.nextLine();
            out.print("Enter 1st monster's size :: ");
            size = keyboard.nextInt();

            out.println();
            keyboard.nextLine();

            //instantiate monster one
            Monster monsterOne = new Monster(name, size);

            //ask for name and size
            out.print("Enter 2nd monster's name :: ");
            name = keyboard.nextLine();
            out.print("Enter 2nd monster's size :: ");
            size = keyboard.nextInt();

            keyboard.nextLine();
            out.println();

            //instantiate monster two
            Monster monsterTwo = new Monster(name, size);

            //compare the two monsters
            out.println(monsterOne.comparedTo(monsterTwo));

            out.println();

            out.print("Do you want to go again? [Y/N] :: ");
            response = keyboard.nextLine();

            out.println();
        } while (response.toUpperCase().equals("Y"));
    }
}
