package one;

/**
 * This is a class that tests the Card class.
 */
public class CardTester
{

    /**
     * The main method in this class checks the Card operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        Card card1 = new Card("King", "Spades", 12);
        Card card2 = new Card("Queen", "Spades", 11);
        Card card3 = new Card("Jack", "Hearts", 10);

        System.out.println(card1.pointValue());
        System.out.println(card2.rank());
        System.out.println(card3.suit());

        System.out.println(card1);
    }
}
