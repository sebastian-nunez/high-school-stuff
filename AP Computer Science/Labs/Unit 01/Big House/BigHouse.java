
//� A+ Computer Science  -  www.apluscompsci.com
//Name - Sebastian Nunez
//Date - 09/09/18
//Class - 10th
//Lab  - Big House

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas {
    public BigHouse() //constructor - sets up the class
    {
        setSize(800, 600);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    /*   public void paint( Graphics window )
       {
      //call bigHouse
    
       }
    */

    public void paint(Graphics window) {
        window.setColor(Color.BLUE);
        window.drawString("BIG HOUSE ", 50, 50);

        window.setColor(Color.BLUE);
        window.fillRect(200, 200, 400, 400);

        window.setColor(Color.WHITE);
        window.fillRect(350, 450, 100, 150);

        window.setColor(Color.YELLOW);
        window.fillRect(250, 300, 75, 75);
        window.fillRect(475, 300, 75, 75);

        window.setColor(Color.GREEN);
        window.fillRect(165, 175, 475, 75);

    }
}
