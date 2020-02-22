package edu.sjsu;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class TrafficComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(25, 25, 150, 300);
        g2.draw(box);
        g2.setColor(Color.DARK_GRAY);
        g2.fill(box);
        g2.draw(box);

        Ellipse2D.Double circle1 = new Ellipse2D.Double(75.5, 45,55, 55);
        g2.draw(circle1);
        g2.setColor(Color.GREEN);
        g2.fill(circle1);
        g2.draw(circle1);

        Ellipse2D.Double circle2 = new Ellipse2D.Double(75.5, 140.5,55, 55);
        g2.draw(circle2);
        g2.setColor(Color.YELLOW);
        g2.fill(circle2);
        g2.draw(circle2);

        Ellipse2D.Double circle3 = new Ellipse2D.Double(75.5, 240,55, 55);
        g2.draw(circle3);
        g2.setColor(Color.RED);
        g2.fill(circle3);
        g2.draw(circle3);

    }
}
