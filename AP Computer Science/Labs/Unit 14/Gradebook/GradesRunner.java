//? A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 03/08/19
//Class - 10th
//Lab  - Gradebook

import static java.lang.System.out;

public class GradesRunner
{
  public static void main(String[] args) {
    Grades gradeList1 = new Grades("5 - 90 85 95.5 77.5 88");
    out.println(gradeList1);
    out.println("sum = " + gradeList1.getSum());
    out.println("num grades = " + gradeList1.getNumGrades());
    out.println("low grade = " + gradeList1.getLowGrade());
    out.println("high grade = " + gradeList1.getHighGrade());

    out.println();

    Grades gradeList2 = new Grades("9 - 10 70 90 92.5 85 95.5 77.5 88 100.0");
    out.println(gradeList2);
    out.println("sum = " + gradeList2.getSum());
    out.println("num grades = " + gradeList2.getNumGrades());
    out.println("low grade = " + gradeList2.getLowGrade());
    out.println("high grade = " + gradeList2.getHighGrade());
  }
}