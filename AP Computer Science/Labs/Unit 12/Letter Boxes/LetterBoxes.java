// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

public class LetterBoxes
{
    //instance variables and constructors could be present, but are not necessary

    public static void printBox(char letter, int size) {
        for (int i = 0; i < size; i++) {
            String output = "";
            for (int j = 0; j < size; j++) {
                output += letter;
            }
            System.out.println(output);
        }
    }
}
