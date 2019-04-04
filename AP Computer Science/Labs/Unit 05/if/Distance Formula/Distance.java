// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/11/18
// Class - 10th
// Lab - Distance Formula

import static java.lang.Math.*;
import static java.lang.System.*;

public class Distance
{
  private int x1, y1, x2, y2;

  public Distance() {
    x1 = 0;
    y1 = 0;
    x2 = 0;
    y2 = 0;
  }

  public Distance(int xOne, int yOne, int xTwo, int yTwo) {
    setCoordinates(xOne, yOne, xTwo, yTwo);
  }

  public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo) {
    x1 = xOne;
    y1 = yOne;
    x2 = xTwo;
    y2 = yTwo;
  }

  public String determineClosest() {
    double distanceA = 0.0, distanceB = 0.0;
    String result = "";

    distanceA = sqrt(pow((x1 - 0), 2) + pow((y1 - 0), 2));
    distanceB = sqrt(pow((x2 - 0), 2) + pow((y2 - 0), 2));

    if (distanceA < distanceB)
      result = "\nA is closer to (0,0)\n\n";
    if (distanceB < distanceA)
      result = "\nB is closer to (0,0)\n\n";

    return result;
  }

  public String toString() {
    return "A: (" + x1 + ", " + y1 + ")\n B: (" + x2 + ", " + y2 + ")\n";
  }
}
