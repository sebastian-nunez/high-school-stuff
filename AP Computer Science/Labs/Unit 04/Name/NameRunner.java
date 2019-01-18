
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/28/18
// Class - 10th
// Lab - Name

import static java.lang.System.*;

public class NameRunner
{
  public static void main(String[] args) {
    Name person = new Name("Sally Baker");
    System.out.println(person.getFirst());
    System.out.println(person.getLast());
    System.out.println(person + "\n");

    person.setName("John Doe");
    System.out.println(person.getFirst());
    System.out.println(person.getLast());
    System.out.println(person + "\n");

    person.setName("Sammy Lammy");
    System.out.println(person.getFirst());
    System.out.println(person.getLast());
    System.out.println(person + "\n");

    person.setName("Benny Programmer");
    System.out.println(person.getFirst());
    System.out.println(person.getLast());
    System.out.println(person + "\n");

    person.setName("Sandy Painter");
    System.out.println(person.getFirst());
    System.out.println(person.getLast());
    System.out.println(person + "\n");
  }
}
