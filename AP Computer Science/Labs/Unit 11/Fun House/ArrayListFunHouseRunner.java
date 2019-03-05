
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 02/12/19
// Class - 10th
// Lab - ArrayList Fun House

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouseRunner
{
    public static void main(String args[]) {
        System.out.println(ArrayListFunHouse.getListOfFactors(9));

        System.out.println(ArrayListFunHouse.getListOfFactors(23));

        System.out.println(ArrayListFunHouse.getListOfFactors(50));

        System.out.println(ArrayListFunHouse.getListOfFactors(100));

        System.out.println(ArrayListFunHouse.getListOfFactors(762));

        Integer[] nums = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(nums));

        System.out.println("Original List");
        System.out.println(list);

        ArrayListFunHouse.keepOnlyCompositeNumbers(list);

        System.out.println("Composite List");
        System.out.println(list);
    }
}
