
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/26/18
// Class - 10th
// Lab - Quadratic

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
  private int a, b, c;
  private double rootOne;
  private double rootTwo;

  public Quadratic() {
    a = 1;
    b = 1;
    c = 1;
    rootOne = 0.0;
    rootTwo = 0.0;
  }

  public Quadratic(int quadA, int quadB, int quadC) {
    setEquation(quadA, quadB, quadC);
  }

  public void setEquation(int quadA, int quadB, int quadC) {
    a = quadA;
    b = quadB;
    c = quadC;
  }

  public void calcRoots() {
    rootOne = ((-1 * b) + sqrt(pow(b, 2) - (4 * a * c))) / (2 * a);
    rootTwo = ((-1 * b) - sqrt(pow(b, 2) - (4 * a * c))) / (2 * a);

  }

  public void print() {

    out.printf("\nrootone :: %.2f\nroottwo :: %.2f\n\n", rootOne, rootTwo);

  }
}
