// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

import java.util.ArrayList;

public class Words
{
    private ArrayList<Word> words;

    public Words() {
        setWords("");
    }

    public Words(String wordList) {
        setWords(wordList);
    }

    public void setWords(String wordList) {
        words = new ArrayList<Word>();
        String[] temp = wordList.split(" ");

        int index = 0;
        for (String word: temp) {
            words.add(new Word(word));
            index++;
        }
    }

    public int countWordsWithXChars(int size) {
        int count = 0;

        for (Word word: words) {
            if (word.getLength() == size) {
                count++;
            }
        }

        return count;
    }

    //this method will remove all words with a specified size / length
    //this method will also return the sum of the vowels in all words removed
    public int removeWordsWithXChars(int size) {
        int sum = 0;

        for (int wordIndex = words.size() - 1; wordIndex >= 0; wordIndex--) {
            if (words.get(wordIndex).getLength() == size) {
                sum += words.get(wordIndex).getNumVowels();
                words.remove(wordIndex);
            }
        }

        return sum;
    }

    public int countWordsWithXVowels(int numVowels) {
        int count = 0;

        for (Word word: words) {
            if (word.getNumVowels() == numVowels) {
                count++;
            }
        }

        return count;
    }

    public String toString() {
        return "" + words;
    }
}
