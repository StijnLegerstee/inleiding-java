package h06;

//Praktijkopdracht

import java.awt.*;
import java.applet.*;


public class praktijkopdracht extends Applet {
    double cijferA, cijferB, cijferC, totaal, gemiddeldecijfer, afgerond;
    int naarint;

    public void init() {
        cijferA = 5.9;
        cijferB = 6.3;
        cijferC = 6.9;
        totaal = cijferA + cijferB + cijferC;
        gemiddeldecijfer = totaal / 3 * 10;
        naarint = (int) gemiddeldecijfer;
        afgerond = (double) naarint / 10;

    }

    public void paint(Graphics g) {
        //geld in totaal
        g.drawString("cijfer gemiddeld: " + afgerond, 20, 20);
    }
}
