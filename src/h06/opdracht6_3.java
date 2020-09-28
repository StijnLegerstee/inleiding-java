package h06;

//Opdracht 6.3

import java.awt.*;
import java.applet.*;


public class opdracht6_3 extends Applet {
    int a, b, ab;

    public void init() {
        a = 2147483647;
        b = 2147483647;
        ab = a + b;
    }

    public void paint(Graphics g) {
        //geld in totaal
        g.drawString("negatief getal: " + ab, 20, 20);
    }
}
