
// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

import static java.lang.System.*;

public class StringRemoverRunner
{
    public static void main(String args[]) {
        //add test cases
        StringRemover test = new StringRemover("xR-MxR-MHelloxR-M", "R-M");
        out.println(test + "\n");

        test.setRemover("sxsssxssxsxssexssxsesss", "xs");
        out.println(test + "\n");

        test.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
        out.println(test + "\n");

    }
}
