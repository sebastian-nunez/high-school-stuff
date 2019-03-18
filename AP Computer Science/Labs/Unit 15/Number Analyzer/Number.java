//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Number
{
    private Integer number;

    public Number() {
        this(0);
    }

    public Number(int num) {
        setNumber(num);
    }

    public void setNumber(int num) {
        number = num;
    }

    public int getNumber() {
        return number;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isPerfect() {
        int total = 0;

        for (int factor = 1; factor < number; factor++) {
            if (number % factor == 0) {
                total += factor;
            }
        }

        return (number == total);
    }

    public String toString() {
        return "" + number;
    }
}