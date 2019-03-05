// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/15/18
// Class - 10th
// Lab - Surface Area of a Cube

public class CubeRunner
{
    public static void main(String[] args) {
        Cube test = new Cube();
        test.setSide(112);
        test.calculateSurfaceArea();
        test.print();

        //add more test cases
        test.setSide(4);
        test.calculateSurfaceArea();
        test.print();

        test.setSide(33);
        test.calculateSurfaceArea();
        test.print();

        test.setSide(50);
        test.calculateSurfaceArea();
        test.print();

        test.setSide(5);
        test.calculateSurfaceArea();
        test.print();

        test.setSide(19);
        test.calculateSurfaceArea();
        test.print();

    }
}
