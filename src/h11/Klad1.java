package h11;

// Klad1

import java.awt.*;
import java.applet.*;


public class Klad1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;

        while(x < 100 || y < 100) {
            y += 10;
            x += 10;
            g.drawOval(x , y, 10, 10 );
        }
    }
}
