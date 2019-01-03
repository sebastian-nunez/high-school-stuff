// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/15/18
// Class - 10th
// Lab - Average

public class AverageRunner {
    public static void main(String[] args) {
        //instantiation
        Average test = new Average();

        //add more test cases
        test.setNums(5, 5);
        test.average();
        test.print();

        test.setNums(90, 100.0);
        test.average();
        test.print();

        test.setNums(100, 85.8);
        test.average();
        test.print();

        test.setNums(-100, 55);
        test.average();
        test.print();

        test.setNums(15236, 5642);
        test.average();
        test.print();

        test.setNums(1000, 555);
        test.average();
        test.print();
    }
}
