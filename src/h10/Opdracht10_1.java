package h10;

// Opdracht 10.1

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht10_1 extends Applet {
    TextField tekstvak;
    Label info;
    String uitkomst;
    int ingevoerdeGetal;
    int uitgevoerdeGetal;

    public void init() {
        tekstvak = new TextField("", 20);
        info = new Label("Type een nummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        uitkomst = "";
        uitgevoerdeGetal = 0;
        add(info);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(uitkomst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String userInput = tekstvak.getText();
            ingevoerdeGetal = Integer.parseInt(userInput);

            if (ingevoerdeGetal > uitgevoerdeGetal) {
                uitgevoerdeGetal = ingevoerdeGetal;
                uitkomst = "Het hoogste getypte getal is: " +uitgevoerdeGetal;
            }

            repaint();
        }
    }
}