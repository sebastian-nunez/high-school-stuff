//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

		//add more code here
      window.setColor(Color.GREEN);
      window.fillOval( 275, 200, 75, 75 );
      window.fillOval( 455, 200, 75, 75 );
      
      window.setColor(Color.BLACK);
      window.fillOval( 385, 295, 35, 35 );
      
      window.setColor(Color.RED);
      window.drawArc(285,315,265,100,0,-180);
   }
}