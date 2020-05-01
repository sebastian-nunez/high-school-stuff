// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 01/25/19
// Class - 10th
// Lab - Word Sorter

import java.util.Arrays;

public class WordSort
{
    private String[] wordRay;

    public WordSort(String line) {
        setList(line);
    }

    public void setList(String line) {
        wordRay = line.split("\\s");
    }

    public void sort() {
        Arrays.sort(wordRay);
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < wordRay.length; i++) {
            output += String.format("Word %d :: %s\n", i, wordRay[i]);
        }
        return output + "\n\n";
    }
}
