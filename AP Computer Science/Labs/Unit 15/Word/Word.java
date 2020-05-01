// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

public class Word
{
    private String word;
    private static String vowels = "AEIOUaeiou";   //only one

    public Word() {
        word = "";
    }

    public Word(String wrd) {
        setWord(wrd);
    }

    public void setWord(String wrd) {
        word = wrd;
    }

    public int getNumVowels() {
        int count = 0;

        for (int wordIndex = 0; wordIndex < word.length(); wordIndex++) {
            for (int vowelIndex = 0; vowelIndex < vowels.length(); vowelIndex++) {
                if (word.charAt(wordIndex) == vowels.charAt(vowelIndex)) {
                    count++;
                }
            }
        }

        return count;
    }

    public int getLength() {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            count++;
        }

        return count;
    }

    public String toString() {
        return "" + word;
    }
}
