// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

import java.util.Scanner;

public class MonsterRunner
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int size;

        String reponse;
        do {
            System.out.print("Enter the 1st monster\'s name :: ");
            name = keyboard.nextLine();
            System.out.print("Enter the 1st monster\'s size :: ");
            size = keyboard.nextInt();
            Skeleton monster1 = new Skeleton(name, size);

            keyboard.nextLine();

            System.out.println();

            System.out.print("Enter the 2nd monster\'s name :: ");
            name = keyboard.nextLine();
            System.out.print("Enter the 2nd monster\'s size :: ");
            size = keyboard.nextInt();
            Skeleton monster2 = new Skeleton(name, size);

            System.out.println();

            System.out.println("Monster 1 - " + monster1);
            System.out.println("Monster 2 - " + monster2);

            System.out.println();

            if (monster1.isBigger(monster2)) {
                System.out.println("Monster 1 is bigger than Monster 2");
            } else if (monster1.isSmaller(monster2)) {
                System.out.println("Monster 1 is smaller than Monster 2");
            } else {
                System.out.println("Monster 1 has the same size as Monster 2");
            }

            if (monster1.namesTheSame(monster2)) {
                System.out.println("Monster 1 has the same name as Monster 2");
            } else {
                System.out.println("Monster 1 does not have the same name as Monster 2");
            }

            keyboard.nextLine();
            System.out.println();

            System.out.print("Go again? [Y/N] :: ");
            reponse = keyboard.nextLine();
        } while (reponse.toUpperCase().equals("Y"));
    }
}
