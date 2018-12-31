
//� A+ Computer Science  -  www.apluscompsci.com
//Name -  Sebastian Nunez
//Date - 11/27/18
//Class - 10th
//Lab  - Password Protection

import java.util.Scanner;
import static java.lang.System.*;

class PassWordCheck {
    private String password;

    public PassWordCheck() {
        password = "pass123";
    }

    public void check() {
        Scanner keyboard = new Scanner(System.in);
        String guess = "";

        do {
            System.out.print("Enter the password :: ");
            guess = keyboard.next();

            if (guess.equals(password))
                System.out.println("VALID");
            else
                System.out.println("INVALID");

        } while (!guess.equals(password));

        if (keyboard != null) {
            keyboard.close();
        }
    }

}
