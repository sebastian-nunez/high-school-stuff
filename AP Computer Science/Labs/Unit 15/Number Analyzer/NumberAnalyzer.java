// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

import java.util.ArrayList;

public class NumberAnalyzer
{
    private ArrayList<Number> list;

    public NumberAnalyzer() {
        list = new ArrayList<Number>();
    }

    public NumberAnalyzer(String numbers) {
        setList(numbers);
    }

    public void setList(String numbers) {
        list = new ArrayList<Number>();
        String[] temp = numbers.split(" ");

        int count = 0;
        for (String num: temp) {
            list.add(new Number(Integer.parseInt(num)));
            count++;
        }

    }

    public int countOdds() {
        int oddCount = 0;

        for (Number num: list) {
            if (num.isOdd()) {
                oddCount++;
            }
        }

        return oddCount;
    }

    public int countEvens() {
        int evenCount = 0;

        for (Number num: list) {
            if (!num.isOdd()) {
                evenCount++;
            }
        }

        return evenCount;
    }

    public int countPerfects() {
        int perfectCount = 0;

        for (Number num: list) {
            if (num.isPerfect()) {
                perfectCount++;
            }
        }

        return perfectCount;
    }

    public String toString() {
        return "" + list;
    }
}
