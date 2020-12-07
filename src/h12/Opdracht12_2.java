package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht12_2 extends Applet {

    Button[] knopper;

    public void init() {
        knopper = new Button[25];

        for (int i = 0; i < knopper.length; i++) {
            knopper[i] = new Button("knop");
            add(knopper[i]);
        }

    }

    public void paint(Graphics g) {
    }
}
