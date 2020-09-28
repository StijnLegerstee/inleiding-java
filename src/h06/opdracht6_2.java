package h06;

//Opdracht 6.2

import java.awt.*;
import java.applet.*;


public class opdracht6_2 extends Applet {
    double jaar, jaarinseconden;
    int seconden, uur, dag, uurinseconden, daginseconden;

    public void init() {
        seconden = 60;
        uur = 60;
        dag = 1440;
        jaar = 525948.766;
        uurinseconden = uur * seconden;
        daginseconden = dag * seconden;
        jaarinseconden = jaar * seconden;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        String uurinsecondenString = seconden + " x " + uur + " = " + uurinseconden + " Seconden in één uur";
        g.drawString(uurinsecondenString,50,50);
        String daginsecodenString = seconden + " x " + dag + " = " + daginseconden + " Seconden in één dag";
        g.drawString(daginsecodenString,50,70);
        String jaarinsecodenString = seconden + " x " + jaar + " = " + jaarinseconden + " Seconden in één jaar";
        g.drawString(jaarinsecodenString,50,90);

    }
}
