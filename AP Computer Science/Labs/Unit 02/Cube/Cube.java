// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 09/15/18
// Class - 10th
// Lab - Surface Area of a Cube

public class Cube {
    private int side;
    private int surfaceArea;

    public void setSide(int s) {
        side = s;
    }

    public void calculateSurfaceArea() {
        surfaceArea = (6 * (int)Math.pow(side, 2));
    }

    public void print() {
        System.out.println("The suface area is :: " + surfaceArea);
    }
}
