// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/18/18
// Class - 10th
// Lab - Fahrenheit to Celsius

public class FahrenheitRunner {
    public static void main(String[] args) {
        //instantiation
        Fahrenheit test = new Fahrenheit();

        //add test cases
        test.setFahrenheit(98.6);
        test.print();

        test.setFahrenheit(52.30);
        test.print();

        test.setFahrenheit(82.45);
        test.print();

        test.setFahrenheit(75.00);
        test.print();

        test.setFahrenheit(100.00);
        test.print();

    }
}
