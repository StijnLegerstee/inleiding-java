package h04;

//Opdracht 4.1

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        //Driehoek
        g.setColor(Color.yellow);
        g.drawLine(30,80,60,30);
        g.setColor(Color.yellow);
        g.drawLine(60, 30,90, 80);
        g.setColor(Color.YELLOW);
        g.drawLine(90,80, 30, 80);
    }
}
