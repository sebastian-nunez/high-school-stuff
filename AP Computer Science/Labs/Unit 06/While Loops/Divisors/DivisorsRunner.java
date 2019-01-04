
// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

import static java.lang.System.*;

public class DivisorsRunner
{
    public static void main(String args[]) {
        //add test cases
        out.println("10 has the divisors " + Divisors.getDivisors(10) + "\n");

        out.println("45 has the divisors " + Divisors.getDivisors(45) + "\n");

        out.println("14 has the divisors " + Divisors.getDivisors(14) + "\n");

        out.println("1024 has the divisors " + Divisors.getDivisors(1024) + "\n");

        out.println("1245 has the divisors " + Divisors.getDivisors(1245) + "\n");

        out.println("33 has the divisors " + Divisors.getDivisors(33) + "\n");

        out.println("65535 has the divisors " + Divisors.getDivisors(65535) + "\n");
    }
}
