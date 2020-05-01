// © A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 04/01/19
// Class - 10th
// Lab - Fibonacci

public class FibonacciRunner
{
    public static void main(String args[]) {
        //add test cases
        Fibonacci test = new Fibonacci(100);
        System.out.println(test.getFib(1));
        System.out.println(test.getFib(2));
        System.out.println(test.getFib(3));
        System.out.println(test.getFib(4));
        System.out.println(test.getFib(5));
        System.out.println(test.getFib(6));
        System.out.println(test.getFib(11));
        System.out.println(test.getFib(16));
        System.out.println(test.getFib(21));
        System.out.println(test.getFib(31));
        System.out.println(test.getFib(41));
        System.out.println(test.getFib(46));
        test.setSeqSize(1);
        System.out.println(test.getFib(1));
        test.setSeqSize(2);
        System.out.println(test.getFib(1));
        System.out.println(test.getFib(2));
        System.out.println(test.getFib(11));
    }
}
