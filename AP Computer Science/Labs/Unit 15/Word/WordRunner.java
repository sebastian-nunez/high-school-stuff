// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

public class WordRunner
{
    public static void main(String[] args) {
        Word word = new Word("chicken");
        System.out.println(word);
        System.out.println("num vowels == " + word.getNumVowels());
        System.out.println("num chars == " + word.getLength());

        System.out.println();

        word = new Word("alligator");
        System.out.println(word);
        System.out.println("num vowels == " + word.getNumVowels());
        System.out.println("num chars == " + word.getLength());

        System.out.println();

        word = new Word("elephant");
        System.out.println(word);
        System.out.println("num vowels == " + word.getNumVowels());
        System.out.println("num chars == " + word.getLength());
    }
}
