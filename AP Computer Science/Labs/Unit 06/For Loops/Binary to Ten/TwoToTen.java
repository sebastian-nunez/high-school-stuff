// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 11/02/18
// Class - 10th
// Lab - Binary to Ten

public class TwoToTen
{
    private String binary;

    public TwoToTen() {
        binary = "";
    }

    public TwoToTen(String bin) {
        setTwo(bin);
    }

    public void setTwo(String bin) {
        binary = bin;
    }

    public long getBaseTen() {
        long ten = 0;

        for (int i = 0; i <= binary.length() - 1; i++) {
            if (binary.charAt(i) == '1')
                ten += (long)Math.pow(2, (binary.length() - 1) - i);
        }

        return ten;
    }

    public String toString() {
        return binary + " == " + getBaseTen();
    }
}
