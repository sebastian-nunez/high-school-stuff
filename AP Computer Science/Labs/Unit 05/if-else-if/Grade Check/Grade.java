// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/22/18
// Class - 10th
// Lab - Grade Checker

public class Grade
{
    private int numGrade;

    public Grade() {
        numGrade = 0;
    }

    public Grade(int grade) {
        setGrade(grade);
    }

    public void setGrade(int grade) {
        numGrade = grade;
    }

    public String getLetterGrade() {
        if (numGrade < 70)
            return "F";
        else if (numGrade >= 70 && numGrade < 75)
            return "D";
        else if (numGrade >= 75 && numGrade < 80)
            return "C";
        else if (numGrade >= 80 && numGrade < 90)
            return "B";
        else if (numGrade >= 90)
            return "A";
        return "Try again...";
    }

    public String toString() {
        return numGrade + " is a " + getLetterGrade() + "\n";
    }
}
