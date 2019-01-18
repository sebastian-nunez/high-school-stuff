
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/02/18
// Class - 10th
// Lab - Factorial

import static java.lang.System.*;

public class Factorial
{
  private int number;

  public Factorial() {
    number = 0;
  }

  public Factorial(int num) {
    setNum(num);
  }

  public void setNum(int num) {
    number = num;
  }

  public int getNum() {
    return number;
  }

  public long getFactorial() {
    long factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }

    return factorial;
  }

  public String toString() {
    return "factorial of " + getNum() + " is " + getFactorial() + "\n";
  }
}
