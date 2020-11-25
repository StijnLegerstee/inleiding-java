package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_9 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        setBackground(Color.GRAY);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j)% 2 == 0) {
                    g.setColor(Color.BLACK);
                    g.fillRect(i * 20,j * 20,20,20);
                } else {
                    g.setColor(Color.WHITE);
                    g.fillRect(i * 20,j * 20,20,20);
                }
            }
        }
    }
}
