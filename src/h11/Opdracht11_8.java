package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_8 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        g.setColor(Color.GRAY);
        int x = 100;
        int y = 100;
        int width = 10;
        int height = 10;

        for (int i = 0; i < 100; i++) {
            g.drawOval(x, y, width,height);
            x -= 10;
            y -= 10;
            width += 10;
            height += 10;
        }
    }
}
