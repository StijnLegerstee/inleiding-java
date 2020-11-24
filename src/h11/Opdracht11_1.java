package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int x = 10;
        for (int i = 0; i < 10; i++) {
            g.drawLine(x,10,x,200);
            x += 20;
        }
    }
}
