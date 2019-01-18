// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/15/18
// Class - 10th
// Lab - Area of a Circle

public class CircleRunner
{
  public static void main(String[] args) {
    //instantiation
    Circle test = new Circle();

    //add test cases
    test.setRadius(7.5);
    test.calculateArea();
    test.print();

    test.setRadius(10);
    test.calculateArea();
    test.print();

    test.setRadius(72.534);
    test.calculateArea();
    test.print();

    test.setRadius(55);
    test.calculateArea();
    test.print();

    test.setRadius(101);
    test.calculateArea();
    test.print();

    test.setRadius(99.952);
    test.calculateArea();
    test.print();

  }
}
