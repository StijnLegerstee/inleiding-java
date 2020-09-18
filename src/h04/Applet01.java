package h04;

//Opdracht 4.2

import java.awt.*;
import java.applet.*;

public class Applet01 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        //Dak
        g.setColor(Color.yellow);
        g.drawLine(30,80,60,30);
        g.setColor(Color.yellow);
        g.drawLine(60, 30,90, 80);
        //Muren
        g.setColor(Color.YELLOW);
        g.drawRect(30,80,60,80);
        //Deur
        g.setColor(Color.yellow);
        g.drawRect(45,120,30,40);
        //Deur knop
        g.setColor(Color.YELLOW);
        g.drawOval(48,135,5,5);
        //Raam
        g.setColor(Color.yellow);
        g.drawRect(50,90,20,20);
        g.drawLine(50,100,70,100);
        g.drawLine(60,90,60,110);
    }
}
