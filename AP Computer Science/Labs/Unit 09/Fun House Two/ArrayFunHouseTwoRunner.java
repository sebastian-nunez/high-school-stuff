
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 12/23/18
// Class - 10th
// Lab - Fun House Two

import java.util.Arrays;

public class ArrayFunHouseTwoRunner
{
    public static void main(String args[]) {
        //add test cases
        int[] one = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] two = {1, 2, 3, 9, 11, 20, 30};
        int[] three = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2};
        int[] four = {3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0};

        System.out.println(Arrays.toString(one));
        System.out.println("Is going up? " + ArrayFunHouseTwo.goingUp(one));
        System.out.println(Arrays.toString(two));
        System.out.println("Is going up? " + ArrayFunHouseTwo.goingUp(two));
        System.out.println(Arrays.toString(three));
        System.out.println("Is going up? " + ArrayFunHouseTwo.goingUp(three));
        System.out.println(Arrays.toString(four));
        System.out.println("Is going up? " + ArrayFunHouseTwo.goingUp(four));

        System.out.println("\n" + Arrays.toString(one));
        System.out.println("Is going down? " + ArrayFunHouseTwo.goingDown(one));
        System.out.println(Arrays.toString(two));
        System.out.println("Is going down? " + ArrayFunHouseTwo.goingDown(two));
        System.out.println(Arrays.toString(three));
        System.out.println("Is going down? " + ArrayFunHouseTwo.goingDown(three));
        System.out.println(Arrays.toString(four));
        System.out.println("Is going down? " + ArrayFunHouseTwo.goingDown(four));

        System.out.println("\n" + Arrays.toString(four));
        System.out.println("first 7 values greater than 9 "
                + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(four, 7, 9)));
        System.out.println("first 5 values greater than 15 "
                + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(four, 5, 15)));

    }
}
