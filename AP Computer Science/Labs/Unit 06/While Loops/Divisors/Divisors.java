// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

public class Divisors
{
    public static String getDivisors(int number) {
        String divisors = "";
        int count = 1;

        do {
            if (number % count == 0) {
                divisors += " " + count;
            }
            count++;
        } while (count < number);

        return divisors;
    }
}
