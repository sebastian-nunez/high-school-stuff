
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/11/18
// Class - 10th
// Lab - Discount Determiner

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Discount test = new Discount();

        out.print("Enter the original bill amount :: ");
        double amt = keyboard.nextDouble();
        out.printf("The bill after discount :: %.2f \n", test.getDiscountedBill(amt));

        out.print("Enter the original bill amount :: ");
        amt = keyboard.nextDouble();
        out.printf("The bill after discount :: %.2f \n", test.getDiscountedBill(amt));

        out.print("Enter the original bill amount :: ");
        amt = keyboard.nextDouble();
        out.printf("The bill after discount :: %.2f \n", test.getDiscountedBill(amt));

        out.print("Enter the original bill amount :: ");
        amt = keyboard.nextDouble();
        out.printf("The bill after discount :: %.2f \n", test.getDiscountedBill(amt));

        out.print("Enter the original bill amount :: ");
        amt = keyboard.nextDouble();
        out.printf("The bill after discount :: %.2f \n", test.getDiscountedBill(amt));
    }
}
