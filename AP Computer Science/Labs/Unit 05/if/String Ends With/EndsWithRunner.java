
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 10/11/18
// Class - 10th
// Lab - String Ends With

import static java.lang.System.*;
import java.util.Scanner;

public class EndsWithRunner
{
    public static void main(String[] args) {
        System.out.println(StringUtilities.endsWith("chicken", "en"));
        System.out.println(StringUtilities.endsWith("chicken", "dog"));
        System.out.println(StringUtilities.endsWith("alligator", "gator"));
        System.out.println(StringUtilities.endsWith("alligator", "all"));
        System.out.println(StringUtilities.endsWith("apluscompsci", "sci"));
        System.out.println(StringUtilities.endsWith("apluscompsci", "comp"));

        //test cases
        /*chicken en
        	chicken dog
        	alligator gator
        	alligator all
        	apluscompsci sci */

        //output
        /*true
        	false
        	true
        	false
        	true
        	false*/

    }
}
