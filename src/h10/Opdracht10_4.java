package h10;

// Opdracht 10.4

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_4 extends Applet {

    TextField tekstvak;
    String greeting, tekst;
    int jaartal;

    public void init() {
        tekstvak = new TextField("",30);
        add(tekstvak);
        tekstvak.addActionListener(new GroetListener());
        greeting = "...";
        tekst = "...";
    }

    public void paint(Graphics g) {
        g.drawString("Kies een maandnummer.",50,50);
        tekstvak.setLocation(50,100);
        g.drawString(greeting,50,190);
        g.drawString(tekst,50,160);
    }

    class GroetListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String maandUserInput = tekstvak.getText();
            String jaarUserInput = tekstvak.getText();
            jaartal = Integer.parseInt( jaarUserInput);

            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst = "Het jaar is nu "+ jaartal + " en het is een schrikkeljaar";
                greeting = "Febuari is de tweede maand en heeft 28 dagen.";
            }
            else {
                tekst = "Het jaar is nu "+ jaartal + " en het is geen schrikkeljaar";

            }

            if (maandUserInput.equals("1")) {
                greeting = "Januari is de eerste maand en heeft 31 dagen.";
            } else if (maandUserInput.equals("2")) {
                greeting = "Febuari is de tweede maand en heeft 29 dagen.";
            } else if (maandUserInput.equals("3")) {
                greeting = "Maart is de derde maand en heeft 31 dagen.";
            } else if (maandUserInput.equals("4")) {
                greeting = "April is de vierde maand en heeft 30 dagen.";
            } else if (maandUserInput.equals("5")) {
                greeting = "Mei is de vijfde maand en heeft 31 dagen.";
            } else if (maandUserInput.equals("6")) {
                greeting = "Juni is de zesde maand en heeft 30 dagen.";
            } else if (maandUserInput.equals("7")) {
                greeting = "Juli is de zevende maand en heeft 31 dagen.";
            } else if (maandUserInput.equals("8")) {
                greeting = "Augustus is de achtste maand en heeft 31 dagen.";
            } else if (maandUserInput.equals("9")) {
                greeting = "September is de negende maand en heeft 30 dagen.";
            } else if (maandUserInput.equals("10")) {
                greeting = "Oktober is de tiende maand en heeft 31 dagen.";
            } else if (maandUserInput.equals("11")) {
                greeting = "November is de elfde maand en heeft 30 dagen.";
            } else if (maandUserInput.equals("12")) {
                greeting = "December is de twaalfde maand en heeft 31 dagen.";
            } else {
                greeting = "...";
            }
            tekstvak.setText("");
            repaint();
        }
    }

}
