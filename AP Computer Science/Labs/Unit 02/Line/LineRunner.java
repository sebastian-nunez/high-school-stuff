//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 09/15/18
//Class - 10th
//Lab  - Slope of a Line

public class LineRunner
{
	public static void main( String[] args )
   {
      //instantiation 
      Line test = new Line(1,9,14,2);
      test.calculateSlope();
      test.print();
      
		//add test cases		
		test.setCoordinates(1,7,18,3);
      test.calculateSlope();
      test.print();
      
      test.setCoordinates(6,4,2,2);
      test.calculateSlope();
      test.print();
      
      test.setCoordinates(4,4,5,3);
      test.calculateSlope();
      test.print();
      
      test.setCoordinates(1,1,2,9);
      test.calculateSlope();
      test.print();

	}
}