// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

import static java.lang.System.*;

public class DigitMathRunner
{
  public static void main(String args[]) {
    //add test cases
    out.printf("234 has an average of %.1f\n\n", DigitMath.averageDigits(234));

    out.printf("10000 has an average of %.1f\n\n", DigitMath.averageDigits(10000));

    out.printf("111 has an average of %.1f\n\n", DigitMath.averageDigits(111));

    out.printf("9005 has an average of %.1f\n\n", DigitMath.averageDigits(9005));

    out.printf("84645 has an average of %.1f\n\n", DigitMath.averageDigits(84645));

    out.printf("8547 has an average of %.1f\n\n", DigitMath.averageDigits(8547));

    out.printf("123456789 has an average of %.1f\n\n", DigitMath.averageDigits(123456789));
  }
}
