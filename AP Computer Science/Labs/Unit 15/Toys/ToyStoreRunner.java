//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class ToyStoreRunner
{
  public static void main(String[] args) {
    ToyStore store = new ToyStore();
    System.out.println(store);
    store.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
    System.out.println(store);

    System.out.println("max == " + store.getMostFrequentToy());
  }
}