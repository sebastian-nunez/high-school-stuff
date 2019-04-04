// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/26/18
// Class - 10th
// Lab - Distance

import static java.lang.Math.*;
import static java.lang.System.*;

public class Distance
{
  private int xOne, yOne, xTwo, yTwo;
  private double distance;

  public Distance() {
    xOne = 0;
    xOne = 0;
    xTwo = 0;
    yTwo = 0;
    distance = 0.0;
  }

  public Distance(int x1, int y1, int x2, int y2) {
    setCoordinates(x1, y1, x2, y2);
  }

  public void setCoordinates(int x1, int y1, int x2, int y2) {
    xOne = x1;
    yOne = y1;
    xTwo = x2;
    yTwo = y2;
  }

  public void calcDistance() {
    distance = sqrt(pow(xTwo - xOne, 2) + pow(yTwo - yOne, 2));
  }

  public void print() {
    out.printf("distance == %.3f\n\n", distance);
  }
}
