package h04;

//Opdracht 4.6

import java.awt.*;
import java.applet.*;

public class Applet05 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        //Vorm stoplicht
        g.setColor(Color.black);
        g.fillRoundRect(20,20,100,200,100,100);
        //Lampen
        g.setColor(Color.red);
        g.fillOval(50,50,40,40);
        g.setColor(Color.YELLOW);
        g.fillOval(50,100,40,40);
        g.setColor(Color.green);
        g.fillOval(50,150,40,40);
    }
}
