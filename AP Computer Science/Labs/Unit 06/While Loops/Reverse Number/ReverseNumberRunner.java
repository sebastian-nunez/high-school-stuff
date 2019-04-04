// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

import static java.lang.System.*;

public class ReverseNumberRunner
{
  public static void main(String args[]) {
    //add test cases
    ReverseNumber test = new ReverseNumber(234);
    out.println(test + "\n");

    test.setNum(10000);
    out.println(test + "\n");

    test.setNum(111);
    out.println(test + "\n");

    test.setNum(9005);
    out.println(test + "\n");

    test.setNum(84645);
    out.println(test + "\n");

    test.setNum(8547);
    out.println(test + "\n");

    test.setNum(123456789);
    out.println(test + "\n");
  }
}
