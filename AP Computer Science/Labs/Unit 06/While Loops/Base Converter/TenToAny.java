
// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Sebastian Nunez

public class TenToAny
{
  private int base10;
  private int newBase;

  //add constructors
  public TenToAny() {
    base10 = newBase = 0;
  }

  public TenToAny(int base10, int newBase) {
    setNums(base10, newBase);
  }

  //add a set method
  public void setNums(int base10Param, int newBaseParam) {
    base10 = base10Param;
    newBase = newBaseParam;
  }

  public String getNewNum() {
    String newNum = "";
    int lastDigit = 0;
    String tempNewNum = "";

    //determines the tempNewNum which is the coverted String (w/ the newBase) but it remains in reverse order of what it should be
    do {
      //determines the rational remainder (aka the last digit of the new base)
      lastDigit = (int)((double)base10 % newBase);

      //when the lastDigit is greater than 9, the digit is converted to hex and added to the tempNewNum (when it is not, the lastDigit is simply added to the tempNewNum)
      if (lastDigit > 9) {
        switch (lastDigit) {
          case 10:
            tempNewNum += "A";
            break;
          case 11:
            tempNewNum += "B";
            break;
          case 12:
            tempNewNum += "C";
            break;
          case 13:
            tempNewNum += "D";
            break;
          case 14:
            tempNewNum += "E";
            break;
          case 15:
            tempNewNum += "F";
            break;
          default:
            return "not supported";
        }

      } else {
        tempNewNum += lastDigit;
      }

      //sets the new value of the base10 which needs to be checked (aka what would the new lastDigit be)
      base10 /= newBase;

    } while (base10 > 0);

    //reverses the digits to the correct order
    for (int i = tempNewNum.length() - 1; i >= 0; i--) {
      newNum += tempNewNum.substring(i, i + 1);
    }

    return newNum;
  }

  //add a toString method
  public String toString() {
    return base10 + " base 10 is " + getNewNum() + " in base " + newBase;
  }

}
