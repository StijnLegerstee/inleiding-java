package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int teller = 0;
        int y = 0;
        int antwoord;

        while(teller <= 10) {

            y += 20;
            g.drawString("3 x " + teller, 30, y );
            teller++;

            antwoord = 3 * teller;
            g.drawString("= " + antwoord,65, y);
        }
    }
}
