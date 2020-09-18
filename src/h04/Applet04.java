package h04;

//Opdracht 4.5

import java.awt.*;
import java.applet.*;

public class Applet04 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillOval(20, 20, 100, 50);
    }
}
