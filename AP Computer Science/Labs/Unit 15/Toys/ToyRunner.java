// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

public class ToyRunner
{
    public static void main(String[] args) {
        Toy toy = new Toy("sorry");
        toy.setCount(1);

        System.out.println(toy);

        Toy toy1 = new Toy("gi joe");
        toy1.setCount(5);

        System.out.println(toy1);
    }
}
