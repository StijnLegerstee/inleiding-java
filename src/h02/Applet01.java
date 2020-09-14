package h02;

//Opdracht 2.1

import java.awt.*;
import java.applet.*;

public class Applet01 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Stijn", 50, 60 );
    }
}