//� A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 09/14/18
//Class - 10th
//Lab  - Sum

public class Sum {
    //instance variables
    private double one, two, sum;

    public void setNums(double num1, double num2) {
        one = num1;
        two = num2;
    }

    public void sum() {
        sum = one + two;
    }

    public void print() {
        System.out.printf("%.1f + %.1f == %.2f\n", one, two, sum);
    }
}
