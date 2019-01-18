// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/14/18
// Class - 10th
// Lab - Sum

public class SumRunner
{
  public static void main(String[] args) {
    Sum test = new Sum();
    test.setNums(5, 5);
    test.sum();
    test.print();

    test.setNums(90, 100);
    test.sum();
    test.print();

    //add more test cases

    test.setNums(100.5, 85.8);
    test.sum();
    test.print();

    test.setNums(-100, 55);
    test.sum();
    test.print();

    test.setNums(15236, 5642);
    test.sum();
    test.print();

    test.setNums(1000, 555);
    test.sum();
    test.print();
  }
}
