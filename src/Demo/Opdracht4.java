package Demo;

import java.applet.*;
import java.awt.*;

public class Opdracht4 extends Applet {
    double totaal;
    double gemiddelde;
    int y;

    public void init() {
        double cijfer[] = {10, 5, 3, 8, 9, 1};
        y = 0;

        for (int i = 0; i < cijfer.length; i++) {
            totaal += cijfer[i];
            y += 10;
        }
        gemiddelde = totaal / cijfer.length;
        System.out.println(y);
    }

    public void paint(Graphics g) {
        g.drawString("Totaal: " + totaal,20,y);
        g.drawString("Gemiddelde: " + gemiddelde,20,40);

    }
}
