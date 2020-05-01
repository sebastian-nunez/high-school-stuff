// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/22/18
// Class - 10th
// Lab - Decoder

public class Decoder
{
    private char letter;

    public Decoder() {
        letter = '0';
    }

    public Decoder(char let) {
        setLetter(let);
    }

    public void setLetter(char let) {
        letter = let;
    }

    public char deCode() {
        if (letter >= 65 && letter <= 90)
            return Character.toLowerCase(letter);
        else if (letter >= 97 && letter <= 122)
            return Character.toUpperCase(letter);
        else if (letter == 48)
            return 'A';
        else if (letter == 49)
            return 'B';
        else if (letter == 50)
            return 'C';
        else if (letter == 51)
            return 'D';
        else if (letter == 52)
            return 'E';
        else if (letter == 53)
            return 'F';
        else if (letter == 54)
            return 'G';
        else if (letter == 55)
            return 'H';
        else if (letter == 56)
            return 'I';
        else if (letter == 57)
            return 'J';

        return '#';
    }

    public String toString() {
        return letter + " decodes to " + deCode() + "\n";
    }
}
