import java.util.Scanner;

public class Runner{

   public static void main(String[] args) {

      //instantiation
      Scanner keyboard = new Scanner(System.in);
      Main run = new Main();

      //asks for user input & calls the firstWord() method within the Main.java class
      System.out.print("Enter a string :: ");
      run.setString(keyboard.nextLine());
      System.out.print(run.firstWord());

   }

}
