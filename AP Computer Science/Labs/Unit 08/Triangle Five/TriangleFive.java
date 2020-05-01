// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 12/12/18
// Class - 10th
// Lab - Triangle 5

import static java.lang.System.*;

public class TriangleFive
{
    private char letter;
    private int amount;

    public TriangleFive() {
        letter = 0;
        amount = 0;
    }

    public TriangleFive(char c, int amt) {
        setLetter(c);
        setAmount(amt);
    }

    public void setLetter(char c) {
        letter = c;
    }

    public void setAmount(int amt) {
        amount = amt;
    }

    public String toString() {
        // output variable
        String output = "";

        // serves as the temporary letter which can be mutated throughout the loops
        // *it's reset back to the original letter for each new row iteration
        char subLetter = letter;

        // outer-loop: keeps track of the current row number (runs as many times as the "amount" decides)
        for (int rows = 1; rows <= amount; rows++) {
            // resets the amount of temporary letters within each consecutive subcolumn
            int subAmount = amount;

            // middle-loop: for each consecutive column, the conditional statement decides the number of columns that correspond with the current
            // ex. if you are on the last row, there should only one main column (amount serves as the maximum number of colums, occurs only when the current row is one)
            for (int cols = 1; cols <= amount - (rows - 1); cols++) {

                // implements the number of subcolumns within each main column (for each consecutive column, the number of subcolumns decreases by one)
                for (int subCols = 1; subCols <= subAmount; subCols++) {
                    // decides if the letter is "out of bounds" and loops back to the top of the capital letter alphabet
                    if (subLetter > 'Z') {
                        subLetter = 'A';
                    }
                    // concatenates the temporary letter for each subcolumn within that column
                    output += subLetter;
                }

                // updates the maximum number of letter within each of the subcolumns (decreases by one for every consecutive subcolumn)
                subAmount--;

                // adds a space between each of the columns
                output += " ";

                // changes the temporary letter to the next letter of the capital alphabet for each consecutive column
                subLetter++;
            }

            // resets the temporary letter back to the original
            subLetter = letter;

            // separates each consecutive row with a new line
            output += "\n";
        }

        // returns a string with all the data
        return output;
    }
}
