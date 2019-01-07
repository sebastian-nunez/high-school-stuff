// © A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 04/01/19
// Class - 10th
// Lab - Group Counter

public class ArrayStatsRunner
{
    public static void main(String[] args) {
        int[] array1 = {3, 3, 3, 3, 3, 9, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array3 = {1, 1, 1, 2, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 4, 4, 4, 6};

        ArrayStats test = new ArrayStats(array1);
        System.out.println(test);
        System.out.println("size 1 count == " + test.getCount(1));
        System.out.println("size 2 count == " + test.getCount(2));
        System.out.println("size 3 count == " + test.getCount(3));
        System.out.println("size 4 count == " + test.getCount(4));
        System.out.println("size 5 count == " + test.getCount(5));
        System.out.println("size 6 count == " + test.getCount(6) + "\n");

        test = new ArrayStats(array2);
        System.out.println(test);
        System.out.println("size 1 count == " + test.getCount(1));
        System.out.println("size 2 count == " + test.getCount(2));
        System.out.println("size 3 count == " + test.getCount(3));
        System.out.println("size 4 count == " + test.getCount(4) + "\n");

        test = new ArrayStats(array3);
        System.out.println(test);
        System.out.println("size 1 count == " + test.getCount(1));
        System.out.println("size 2 count == " + test.getCount(2));
        System.out.println("size 6 count == " + test.getCount(6));
        System.out.println("size 8 count == " + test.getCount(8));
    }
}
