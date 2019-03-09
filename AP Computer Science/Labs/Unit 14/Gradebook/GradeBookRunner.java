//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

import static java.lang.System.out;

public class GradeBookRunner
{
    public static void main(String[] args) {
        out.println("Welcome to the Class Stats program!");
        out.println();

        Scanner keyboard = new Scanner(System.in);

        out.print("What is the name of this class? :: ");
        String className = keyboard.nextLine();

        out.print("How many students are in this class? :: ");
        int numberOfStudents = keyboard.nextInt();

        keyboard.nextLine();
        out.println();

        Class classObject = new Class(className, numberOfStudents);

        int studentNumber = 0;
        while (studentNumber < numberOfStudents) {
            out.print("Enter the name of student " + (studentNumber + 1) + " :: ");
            String studentName = keyboard.nextLine();

            out.println("Enter the grades for " + studentName);
            out.print("Use the format: x - grades (2 - 100 100) :: ");
            String studentGrades = keyboard.nextLine();
            out.println();

            classObject.addStudent(studentNumber, new Student(studentName, studentGrades));

            studentNumber++;
        }

        out.println(classObject);
        out.println();

        out.println("Failure List = " + classObject.getFailureList(70));
        out.println();

        out.println("Highest Average = " + classObject.getStudentWithHighestAverage());
        out.println("Lowest Average = " + classObject.getStudentWithLowestAverage());
        out.println();

        out.println("Class average = " + Math.round(classObject.getClassAverage() * 100.0) / 100.0);
    }
}