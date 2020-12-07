package h12;

import java.applet.Applet;
import java.awt.*;

public class DemoArrays extends Applet {

    int[] getallen = { 3, 7, 2, 8, 1, 9, 45, 0, 2, 56, 43, 3, 1, 4897 };
    int aantal;
    int grenswaarde;

    public void init() {
        aantal = 0;
        grenswaarde = 5;
    }

    public void paint(Graphics g) {

        int y = 50;
        for (int i = 0 ; i < getallen.length ; i++ ) {
            g.drawString("Op index " + i + " staat nu het getal " + getallen[i],50,y);
            y += 20;
            if (getallen[i] > grenswaarde) {
                aantal++;
            }
            g.drawString("Hee! Op index " + i + " Staat een getal boven de 5.",50,y);
            y += 20;
        }


        // g.drawString("We hebben " + aantal + " getallen boven de " + grenswaarde + ".",50,50);
    }
}
