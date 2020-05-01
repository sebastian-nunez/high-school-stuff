// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

import java.util.Arrays;

import static java.lang.System.*;

public class ArrayOfPrimesRunner
{
    public static void main(String args[]) {
        out.println("The 1st 5 primes starting from 2 are :: \n" + Arrays.toString(ArrayOfPrimes.getPrimeList(5)));
        out.println();

        // add more test cases
        out.println("The 1st 5 primes starting from 10 are :: \n" + Arrays.toString(ArrayOfPrimes.getPrimeList(5, 10)));
        out.println();

        out.println(
                "The 1st 10 primes starting from 100 are :: \n" + Arrays.toString(ArrayOfPrimes.getPrimeList(10, 100)));
        out.println();

    }
}
