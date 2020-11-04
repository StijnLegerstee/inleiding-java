package h10;

// Voorbeeld 10.5

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Voorbeeld10_5 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het dagnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "zondag";
                    break;
                case 2:
                    tekst = "maandag";
                    break;
                case 3:
                    tekst = "dinsdag";
                    break;
                case 4:
                    tekst = "woensdag";
                    break;
                case 5:
                    tekst = "donderdag";
                    break;
                case 6:
                    tekst = "vrijdag";
                    break;
                case 7:
                    tekst = "zaterdag";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}