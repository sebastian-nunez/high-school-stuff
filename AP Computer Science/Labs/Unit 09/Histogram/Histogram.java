
// © A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 01/03/18
// Class - 10th
// Lab - Histogram

import java.util.Arrays;
import java.util.Scanner;

public class Histogram
{
    //add and int[] array instance variable
    private int numCount[];
    private int inputArray[];

    //constructor
    public Histogram() {
        numCount = new int[10];
    }

    //set method
    public void setArray(int[] array) {
        inputArray = array;
        numCount = new int[10];
    }

    // creates the histogram
    public String createHistogram() {
        String output = "";

        for (int num: inputArray) {
            switch (num) {
                case 0:
                    numCount[0] += 1;
                    break;
                case 1:
                    numCount[1] += 1;
                    break;
                case 2:
                    numCount[2] += 1;
                    break;
                case 3:
                    numCount[3] += 1;
                    break;
                case 4:
                    numCount[4] += 1;
                    break;
                case 5:
                    numCount[5] += 1;
                    break;
                case 6:
                    numCount[6] += 1;
                    break;
                case 7:
                    numCount[7] += 1;
                    break;
                case 8:
                    numCount[8] += 1;
                    break;
                case 9:
                    numCount[9] += 1;
                    break;
                default:
                    output += "ERROR: number must be between 0-9";
            }
        }

        output += "Cool Histogram: \n";

        // cool histogram
        for (int i = 0; i <= 9; i++) {
            output += String.format("%d - ", i);
            if (numCount[i] > 0) {
                for (int j = 1; j <= numCount[i]; j++) {
                    output += "#";
                }
            }
            output += "\n";
        }

        output += "\n\nBoring Histogram: \n";

        // boring histogram
        for (int i = 0; i <= 9; i++) {
            output += String.format("%d - %d\n", i, numCount[i]);
        }

        return output;
    }

    //toString method
    public String toString() {
        return createHistogram();
    }
}
