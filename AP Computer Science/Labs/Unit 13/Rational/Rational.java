
// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

import static java.lang.System.*;

public class Rational implements Comparable<Rational>
{
  //add two instance variables
  private int numerator;
  private int denominator;

  //write two constructors
  public Rational() {
    numerator = 1;
    denominator = 1;
  }

  public Rational(int num, int denom) {
    setRational(num, denom);
  }

  //write a setRational method
  public void setRational(int num, int denom) {
    numerator = num;
    denominator = denom;
  }

  //write  a set method for numerator and denominator
  public void setNumerator(int num) {
    numerator = num;
  }

  public void setDenominator(int denom) {
    denominator = denom;
  }

  public void add(Rational other) {
    //num1/den1 + num2/den2
    //new numerator = (num1 * den2 + num2 * den1)
    //new denominator = (den1 * den2)
    numerator = (numerator * other.getDenominator() + other.getNumerator() * denominator);
    denominator = denominator * other.getDenominator();

    reduce();
  }

  private void reduce() {
    int gcd = gcd(numerator, denominator);

    numerator /= gcd;
    denominator /= gcd;
  }

  private int gcd(int numOne, int numTwo) {
    int gcd = 1;
    for (int factor = 2; factor <= numOne; factor++) {
      if (numOne % factor == 0 && numTwo % factor == 0) {
        gcd = factor;
      }
    }
    return gcd;
  }

  public Object clone() {
    return new Rational(numerator, denominator);
  }

  //ACCESSORS
  //write get methods for numerator and denominator
  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public boolean equals(Object obj) {
    Rational other = (Rational)obj;
    double thisDec = (double)numerator / denominator;
    double otherDec = (double)other.getNumerator() / other.getDenominator();

    if (thisDec == otherDec) {
      return true;
    }

    return false;
  }

  public int compareTo(Rational other) {
    double thisDec = (double)numerator / denominator;
    double otherDec = (double)other.getNumerator() / other.getDenominator();

    if (thisDec < otherDec)
      return -1;
    else if (thisDec > otherDec)
      return 1;
    else
      return 0;
  }

  //write  toString() method
  public String toString() {
    return numerator + "/" + denominator;
  }

}
