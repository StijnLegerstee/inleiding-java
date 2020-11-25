package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_7 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        g.setColor(Color.GRAY);
        int x = 100;
        int y = 100;
        int width = 10;
        int height = 10;

        for (int i = 0; i < 50; i++) {
            g.drawOval(x, y, width,height);
            x -= 5;
            y -= 5;
            width += 10;
            height += 10;
        }
    }
}
