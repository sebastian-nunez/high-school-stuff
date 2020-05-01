// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 12/10/18
// Class - 10th
// Lab - Random Colored Boxes

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandomColoredBoxes extends JPanel
{
    private Timer timer;
    private final static int SLEEP = 110;

    public RandomColoredBoxes() {
        setBackground(Color.BLACK);
        setVisible(true);

        ActionListener paintCaller = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                repaint();
            }
        };
        timer = new Timer(SLEEP, paintCaller);
        timer.start();
    }

    public void paintComponent(Graphics window) {
        super.paintComponent(window);

        window.setColor(Color.RED);
        window.setFont(new Font("TAHOMA", Font.BOLD, 12));
        window.drawString("Graphics Lab Lab11k ", 20, 40);
        window.drawString("Drawing boxes with nested loops ", 20, 80);

        drawBoxes(window);
    }

    public void drawBoxes(Graphics window) {
        //for loop to to across the x - getWidth() might be useful
        //for loop to go down the y - getHeight() might be useful
        //draw random colored boxes
        for (int x = 80; x <= getWidth() - 100; x += 40) {
            for (int y = 120; y <= getHeight() - 40; y += 40) {
                int r = (int)(Math.random() * 256);
                int g = (int)(Math.random() * 256);
                int b = (int)(Math.random() * 256);

                Color randColor = new Color(r, g, b);
                window.setColor(randColor);
                window.fillRect(x, y, 40, 40);
            }
        }

    }
}
