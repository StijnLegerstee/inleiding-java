package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        g.setColor(Color.GRAY);
        int x = 50;
        int y = 50;
        int width = 10;
        int height = 10;

        for (int i = 0; i < 5; i++) {
            g.drawOval(x, y, width,height);
            x -= 10;
            y -= 10;
            width += 20;
            height += 20;
        }
    }
}
