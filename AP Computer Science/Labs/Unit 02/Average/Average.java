// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/15/18
// Class - 10th
// Lab - Average

public class Average {
    //instance variables
    private double one, two, average;

    public void setNums(double num1, double num2) {
        one = num1;
        two = num2;
    }

    public void average() {
        double sum = (one + two);
        average = (sum / 2);

    }

    public void print() {
        System.out.printf("%.1f + %.1f has an average of %.2f\n", one, two, average);
    }
}
