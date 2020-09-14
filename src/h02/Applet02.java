package h02;

//Opdracht 2.2

import java.awt.*;
import java.applet.*;

public class Applet02 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Stijn", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Legerstee", 50, 80 );
    }
}