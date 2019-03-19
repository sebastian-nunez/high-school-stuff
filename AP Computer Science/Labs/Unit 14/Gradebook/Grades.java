//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sebastian Nunez

public class Grades
{
    private Grade[] grades;

    public Grades(String gradeList) {
        String[] temp = gradeList.split(" ");

        grades = new Grade[Integer.parseInt(temp[0])];

        int spot = 0;
        for (int i = 2; i < temp.length; i++) {
            grades[spot] = new Grade(Double.parseDouble(temp[i]));
            spot++;
        }
    }

    public void addGrade(double grade) {
        Grade[] temp = new Grade[grades.length + 1];

        for (int i = 0; i < grades.length; i++) {
            temp[i] = grades[i];
        }

        temp[temp.length - 1] = new Grade(grade);

        grades = temp;
    }

    public void setGrade(int spot, double grade) {
        grades[spot] = new Grade(grade);
    }

    public double getSum() {
        double sum = 0.0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i].getNumericGrade();
        }

        return sum;
    }

    public double getLowGrade() {
        int lowestGradeIndex = 0;
        for (int gradeIndex = lowestGradeIndex; gradeIndex < grades.length; gradeIndex++) {
            if (grades[gradeIndex].getNumericGrade() < grades[lowestGradeIndex].getNumericGrade()) {
                lowestGradeIndex = gradeIndex;
            }
        }

        return grades[lowestGradeIndex].getNumericGrade();
    }

    public double getHighGrade() {
        int highestGradeIndex = 0;
        for (int gradeIndex = highestGradeIndex; gradeIndex < grades.length; gradeIndex++) {
            if (grades[gradeIndex].getNumericGrade() > grades[highestGradeIndex].getNumericGrade()) {
                highestGradeIndex = gradeIndex;
            }
        }

        return grades[highestGradeIndex].getNumericGrade();
    }

    public int getNumGrades() {
        return grades.length;
    }

    public String toString() {
        String output = "";

        for (int i = 0; i < grades.length; i++) {
            output += grades[i] + " ";
        }
        return output;
    }
}