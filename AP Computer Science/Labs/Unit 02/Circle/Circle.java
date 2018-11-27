//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez   
//Date - 09/15/18
//Class - 10th
//Lab  - Area of a Circle 

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
      radius = rad;
	}

	public void calculateArea( )
	{
      area = (Math.PI * Math.pow(radius,2));
	}

	public void print( )
	{  
      System.out.printf("The area is :: %.4f\n", area);
	}
}