// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/18/18
// Class - 10th
// Lab - Fahrenheit to Celsius

public class Fahrenheit
{
    private double fahrenheit;

    public void setFahrenheit(double fahren) {
        fahrenheit = fahren;

    }

    public double getCelsius() {
        double celsius = 0.0;
        //add code to convert fahrenheit to celsius
        celsius = (((fahrenheit - 32) * 5) / 9);
        return celsius;
    }

    public void print() {
        //this is part of the solution
        System.out.printf("%.2f degrees Fahrenheit == %.2f degrees Celsius\n", fahrenheit, getCelsius());
    }
}
