// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/02/18
// Class - 10th
// Lab - Binary to Ten

import static java.lang.System.*;

public class TwoToTenRunner
{
  public static void main(String[] args) {
    //add test cases
    TwoToTen test = new TwoToTen("1010");
    out.println(test);

    test.setTwo("1100");
    out.println(test);

    test.setTwo("1110");
    out.println(test);

    test.setTwo("1111");
    out.println(test);

    test.setTwo("11111");
    out.println(test);

    test.setTwo("111111");
    out.println(test);

    test.setTwo("1110101");
    out.println(test);

    test.setTwo("10101010101");
    out.println(test);

    test.setTwo("1010101010110");
    out.println(test);

    test.setTwo("111111111111111111");
    out.println(test);

  }
}
