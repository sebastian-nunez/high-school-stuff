// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

public class LetterRemover
{
    private String sentence;
    private char lookFor;

    public LetterRemover() {
        //call set
        setRemover(sentence, lookFor);
    }

    //add in second constructor
    public LetterRemover(String s, char lf) {
        setRemover(s, lf);
    }

    public void setRemover(String s, char rem) {
        sentence = s;
        lookFor = rem;
    }

    public String removeLetters() {
        String cleaned = sentence;
        int loc = cleaned.indexOf(lookFor);

        while (loc != -1) {
            cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
            loc = cleaned.indexOf(lookFor);
        }

        return cleaned;
    }

    public String toString() {
        return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
    }
}
