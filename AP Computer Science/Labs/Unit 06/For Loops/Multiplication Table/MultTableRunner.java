// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/02/18
// Class - 10th
// Lab - Multiplication Table

import static java.lang.System.*;

public class MultTableRunner
{
  public static void main(String[] args) {
    //add test cases
    MultTable test = new MultTable(5, 5);
    test.printTable();
    out.println();

    test.setTable(3, 7);
    test.printTable();
    out.println();

    test.setTable(1, 6);
    test.printTable();
    out.println();

    test.setTable(9, 9);
    test.printTable();
    out.println();

    test.setTable(7, 8);
    test.printTable();
    out.println();

  }
}
