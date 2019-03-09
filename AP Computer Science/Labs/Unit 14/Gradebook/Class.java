//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sebastian Nunez

public class Class
{
    private String name;
    private Student[] studentList;

    public Class() {
        name = "";
        studentList = new Student[0];
    }

    public Class(String nam, int stuCount) {
        name = nam;
        studentList = new Student[stuCount];
    }

    public void addStudent(int stuNum, Student s) {
        studentList[stuNum] = s;
    }

    public String getClassName() {
        return name;
    }

    public double getClassAverage() {
        double classAverageSum = 0.0;
        for (int studentIndex = 0; studentIndex < studentList.length; studentIndex++) {
            classAverageSum += studentList[studentIndex].getAverage();
        }

        return classAverageSum / studentList.length;
    }

    public double getStudentAverage(int stuNum) {
        return studentList[stuNum].getAverage();
    }

    public double getStudentAverage(String stuName) {
        for (int studentIndex = 0; studentIndex < studentList.length; studentIndex++) {
            if (studentList[studentIndex].getName().equals(stuName)) {
                return studentList[studentIndex].getAverage();
            }
        }

        return -1.0;
    }

    public String getStudentName(int stuNum) {
        return studentList[stuNum].getName();
    }

    public String getStudentWithHighestAverage() {
        int highestAverageIndex = 0;
        for (int studentIndex = 0; studentIndex < studentList.length; studentIndex++) {
            if (studentList[studentIndex].getAverage() > studentList[highestAverageIndex].getAverage()) {
                highestAverageIndex = studentIndex;
            }
        }

        return studentList[highestAverageIndex].getName();
    }

    public String getStudentWithLowestAverage() {
        int lowestAverageIndex = 0;
        for (int studentIndex = 0; studentIndex < studentList.length; studentIndex++) {
            if (studentList[studentIndex].getAverage() < studentList[lowestAverageIndex].getAverage()) {
                lowestAverageIndex = studentIndex;
            }
        }

        return studentList[lowestAverageIndex].getName();
    }

    public String getFailureList(double failingGrade) {
        String output = "";
        for (int studentIndex = 0; studentIndex < studentList.length; studentIndex++) {
            if (studentList[studentIndex].getLowGrade() < failingGrade) {
                output += studentList[studentIndex].getName() + " ";
            }
        }

        return output;
    }

    public String toString() {
        String output = getClassName() + "\n";

        for (int i = 0; i < studentList.length; i++) {
            output += studentList[i] + "\t\t" + Math.round(studentList[i].getAverage() * 100.0) / 100.0 + "\n";
        }

        return output;
    }
}