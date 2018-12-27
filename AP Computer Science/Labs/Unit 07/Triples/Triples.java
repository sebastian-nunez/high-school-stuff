
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 12/01/18
// Class - 10th
// Lab - Triples

public class Triples {
    private int number;

    public Triples() {
        this(0);
    }

    public Triples(int num) {
        setNum(num);
    }

    private int greatestCommonFactor(int a, int b, int c) {
        int max = number;
        int factorCount = 1;

        for (int i = 2; i <= max; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                factorCount++;
            }
        }

        return factorCount;
    }

    public void setNum(int num) {
        number = num;
    }

    public String toString() {
        String output = "";

        for (int a = 3; a <= number; a++) {
            for (int b = a + 1; b <= number; b++) {
                double c = Math.sqrt(a * a + b * b);
                if (c == Math.floor(c) && greatestCommonFactor(a, b, (int) c) <= 1) {
                    output += a + " " + b + " " + (int) c + "\n";
                }
            }
        }

        return output + "\n";
    }

}
