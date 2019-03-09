//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sebastian Nunez

import static java.lang.System.out;

public class GradeTester
{
    public static void main(String[] args) {
        Grade test = new Grade(92.5);
        out.println(test);
        out.println(test.getLetterGrade());

        test.setValue(77.5);
        out.println(test);
        out.println(test.getLetterGrade());

        test.setValue(47.5);
        out.println(test);
        out.println(test.getLetterGrade());

        test.setValue(87.5);
        out.println(test);
        out.println(test.getLetterGrade());

    }
}