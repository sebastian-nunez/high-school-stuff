
// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

import static java.lang.System.*;

public class Perfect
{
  private int number;

  //add constructors
  public Perfect() {
    number = 0;
  }

  public Perfect(int num) {
    setNum(num);
  }

  //add a set method
  public void setNum(int num) {
    number = num;
  }

  public boolean isPerfect() {
    int divisorSum = 0;
    int count = 1;

    do {
      if (number % count == 0) {
        divisorSum += count;
      }
      count++;
    } while (count < number);

    if (number == divisorSum)
      return true;
    else
      return false;
  }

  //add a toString
  public String toString() {
    if (isPerfect())
      return number + " is perfect";
    else
      return number + " is not pefect";
  }

}
