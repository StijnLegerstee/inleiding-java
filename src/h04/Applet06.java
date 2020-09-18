package h04;

//Opdracht 4.7

import java.awt.*;
import java.applet.*;

public class Applet06 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        //Dobbelsteen vorm
        g.setColor(Color.black);
        g.drawRoundRect(20,20,200,200,100,100);
        //Dobbelsteen zijde 4
        g.setColor(Color.black);
        g.fillOval(50,50,50,50);
        g.setColor(Color.black);
        g.fillOval(140,50,50,50);
        g.setColor(Color.black);
        g.fillOval(50,140,50,50);
        g.setColor(Color.black);
        g.fillOval(140,140,50,50);
    }
}
