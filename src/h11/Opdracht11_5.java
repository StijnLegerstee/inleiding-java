package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_5 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        g.setColor(Color.GRAY);
        int x = 20;
        int formaat = 15;
        for (int i = 0; i < 10; i++) {
            g.drawRect(x, 20, formaat, formaat);
            x += 20;
        }
    }
}
