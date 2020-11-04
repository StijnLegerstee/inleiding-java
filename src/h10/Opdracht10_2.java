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
    int highestNumber;
    int lowestNumber;

    public void init() {
        tekstvak = new TextField("", 20);
        info = new Label("Type een nummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        uitkomst = "";
        laagsteUitkomst = "";
        highestNumber = 0;
        lowestNumber = 0;
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

            if (ingevoerdeGetal > highestNumber) {
                highestNumber = ingevoerdeGetal;
                uitkomst = "Het hoogste getypte getal is: " + highestNumber;
            }
            if (ingevoerdeGetal < lowestNumber) {
                lowestNumber = ingevoerdeGetal;
                laagsteUitkomst = "Het laagste getypte getal is: " + lowestNumber;
            }

            repaint();
        }

    }
}