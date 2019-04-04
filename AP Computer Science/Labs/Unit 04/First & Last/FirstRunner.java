// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/28/18
// Class - 10th
// Lab - First & Last

import static java.lang.System.*;

public class FirstRunner
{
  public static void main(String[] args) {
    FirstAndLast demo = new FirstAndLast("Hello");
    System.out.println(demo);

    //add more test cases
    demo.setString("World");
    System.out.println(demo);

    demo.setString("JukeBox");
    System.out.println(demo);

    demo.setString("TCEA");
    System.out.println(demo);

    demo.setString("UIL");
    System.out.println(demo);
  }
}
