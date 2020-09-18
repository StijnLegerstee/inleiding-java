package h04;

//Opdracht 4.3

import java.awt.*;
import java.applet.*;

public class Applet02 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        //Vlag
        g.setColor(Color.RED);
        g.fillRect(50,20,220,35);
        g.setColor(Color.white);
        g.fillRect(50,55,220,35);
        g.setColor(Color.blue);
        g.fillRect(50,90,220,35);
        //Paal
        g.setColor(Color.white);
        g.fillRect(270,20,20,260);
        //Grond
        g.setColor(Color.green);
        g.fillRect(0,280,400,20);
    }
}
