
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/23/18
// Class - 10th
// Lab - Monster

import static java.lang.System.*;

public class Monster
{
    private String name;
    private int howBig;

    public Monster() {
        name = "";
        howBig = 0;
    }

    public Monster(String n, int size) {
        name = n;
        howBig = size;
    }

    public String getName() {
        return name;
    }

    public int getHowBig() {
        return howBig;
    }
    
    public String comparedTo(Monster other) {
      out.println("\nMonster 1 - " + name);
      out.println("Monster 2 - " + other.getName());
      
      return "\n" + compareSize(other) + "\n" + compareName(other);
    }

    private boolean isBigger(Monster other) {
        if (other.getHowBig() > howBig)
            return true;
        return false;
    }

    private boolean isSmaller(Monster other) {
        //call isBigger() use !
        if (!isBigger(other))
            return true;
        return false;
    }

    private String compareName(Monster other) {
        if (namesTheSame(other))
            return name + " has the same name as " + other.getName();
        else
            return name + " does not have the same name as " + other.getName();
    }
    
    private boolean namesTheSame(Monster other) {
      if (other.getName().equals(name))
        return true;
      return false;
    }

    private String compareSize(Monster other) {
        if (howBig == other.getHowBig())
            return name + " is equal to " + other.getName();
        else if (isBigger(other))
            return name + " is smaller than " + other.getName();
        else if (isSmaller(other))
            return name + " is bigger than " + other.getName(); 
        return "ERROR...?"; 
    }

    public String toString() {
        return name + " " + howBig;
    }
}
