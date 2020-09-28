package h06;

//Opdracht 6.1

import java.awt.*;
import java.applet.*;


public class opdracht6_1 extends Applet {
    double totaal, verdeeld;

    public void init() {
        totaal = 113;
        verdeeld = totaal / 4;
    }

    public void paint(Graphics g) {
        //geld in totaal
        g.drawString("totaal: €" + totaal, 20, 20);
        //namen
        g.drawString("Jan: €" + verdeeld,20,50);
        g.drawString("Ali: €" + verdeeld,20,70);
        g.drawString("Jeannette: €" + verdeeld,20,90);
        g.drawString("Stijn: €" + verdeeld,20,110);
    }
}
