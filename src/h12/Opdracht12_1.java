package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht12_1 extends Applet {
    int[] getallen = {8, 3, 7, 21, 1, 18, 64, 29, 2, 69};
    double gemiddelde;

    public void init() {
        double totaal = 0;
        for (int i = 0; i < getallen.length; i++) {
            totaal += getallen[i];

        }
        gemiddelde = totaal / getallen.length;
    }

    public void paint(Graphics g) {
        int y = 20;
        for (int i = 0; i < getallen.length; i++) {
            g.drawString("" + getallen[i],20, y);
            y += 20;

        }
        g.drawString("Gemiddelde: " + gemiddelde,20, y);
    }
}
