package h10;

// Opdracht 10.2

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht10_2 extends Applet {
    TextField tekstvak;
    Label info;
    String uitkomst;
    String laagsteUitkomst;
    int ingevoerdeGetal;
    int uitgevoerdeGetal;

    public void init() {
        tekstvak = new TextField("", 20);
        info = new Label("Type een nummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        uitkomst = "";
        laagsteUitkomst = "";
        uitgevoerdeGetal = 0;
        add(info);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(uitkomst, 50, 60 );
        g.drawString(laagsteUitkomst,50,80);
    }

    class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String userInput = tekstvak.getText();
            ingevoerdeGetal = Integer.parseInt(userInput);
            System.out.println(ingevoerdeGetal);
            System.out.println(uitgevoerdeGetal);
            if (ingevoerdeGetal > uitgevoerdeGetal) {
                uitgevoerdeGetal = ingevoerdeGetal;
                System.out.println(uitgevoerdeGetal);
                uitkomst = "Het hoogste getypte getal is: " +uitgevoerdeGetal;
            }
            if (ingevoerdeGetal < uitgevoerdeGetal) {
                uitgevoerdeGetal = ingevoerdeGetal;
                laagsteUitkomst = "Het laagste getypte getal is: " +uitgevoerdeGetal;
            }

            repaint();
        }
    }
}