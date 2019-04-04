// © A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 01/03/18
// Class - 10th
// Lab - Histogram

public class Histogram
{
  //add and int[] array instance variable
  private int numCount[];
  private int inputArray[];

  // constructor
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

    // histogram creator
    for (int num : inputArray) {
      for (int i = 0; i < numCount.length; i++) {
        if (num == i) {
          numCount[i]++;
        }
      }
    }

    output += "Cool Histogram: \n";

    // print cool histogram
    for (int i = 0; i < numCount.length; i++) {
      output += String.format("%d - ", i);
      if (numCount[i] > 0) {
        for (int j = 1; j <= numCount[i]; j++) {
          output += "#";
        }
      }
      output += "\n";
    }

    output += "\n\nBoring Histogram: \n";

    // print boring histogram
    for (int i = 0; i < numCount.length; i++) {
      output += String.format("%d - %d\n", i, numCount[i]);
    }

    return output;
  }

  //toString method
  public String toString() {
    return createHistogram();
  }
}
