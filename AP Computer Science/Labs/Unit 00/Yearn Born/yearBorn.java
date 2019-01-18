// (c) A+ Computer Science - www.apluscompsci.com
// Name:: Sebastian Nunez
// Date:: 08/31/18

// yearBorn should ask the user for their name and
// their birth year, calculate their age, and then
// print a greeting that uses their name and age

import java.util.Scanner;

public class yearBorn
{
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);

    //declaration
    String name;
    int birthYear, age;

    //asks for first name
    System.out.println("Enter first name :: ");
    name = keyboard.next();

    //aks for age
    System.out.println("Enter birth year :: ");
    birthYear = keyboard.nextInt();

    //calculates age
    age = (2018 - birthYear);

    //prints greeting
    System.out.print("Hello, " + name + ". From the information provided, you're currently (or will be) " + age
        + " years old. Congratulations! ");

    /*System.out.println("Name: " + name);
    System.out.println("Birth year: " + birthYear);
    System.out.println("Age: " + age);*/

  }
}
