//� A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 03/08/19
//Class - 10th
//Lab  - Gradebook

public class Grade
{
    private double value;

    //add in two constructors
    public Grade() {
        value = 1;
    }

    public Grade(double val) {
        value = val;
    }

    public double getValue() {
        return value;
    }

    //add in set and get methods
    public void setValue(double val) {
        value = val;
    }

    //String getLetterGrade()
    public String getLetterGrade() {
        if (value < 59.5) {
            return "F";
        } else if (value < 69.5) {
            return "D";
        } else if (value < 79.5) {
            return "C";
        } else if (value < 89.5) {
            return "B";
        } else {
            return "A";
        }
    }

    //double getNumericGrade()
    public double getNumericGrade() {
        return value;
    }

    //toString method
    public String toString() {
        return "" + value;
    }
}
