package h11;

import java.applet.Applet;
import java.awt.*;
import java.util.Scanner;

public class VSVlag extends Applet {

    public void init() {
        setSize(400,215);
        setBackground(Color.DARK_GRAY);
    }

    public void paint(Graphics g) {

        // Witte vlag als achtegrond
        g.setColor(Color.WHITE);
        g.fillRect(15,10,371,195);
        g.setColor(Color.RED);

        // De rode lijnen
        int y = 10;
        for (int i = 0; i < 7; i++) {
            g.fillRect(15, y, 371, 15);
            y += 30;
        }

        // Blauwe rechthoek voor de sterren
        g.setColor(Color.BLUE);
        g.fillRect(15,10,148,105);

        // Witte bolletjes
        g.setColor(Color.WHITE);
        int x = 20;
        int formaat = 8;
        for (int i = 0; i < 10; i++) {
            g.fillOval(x, 20, formaat, formaat);
            x += 12;
            
        }

    }

}
