package h10;

// Opdracht 10.5

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_5 extends Applet {

    TextField tekstvak;
    String Cijfer;
    Button okKnop;
    double ingevoerdeCijfer;
    double TotaalCijfers;
    int TotaalAantalCijfers;
    double gemiddelde;
    String gemiddeldeCijfer;

    public void init() {
        tekstvak = new TextField("",30);
        Cijfer = "...";
        gemiddeldeCijfer = "Druk op 'OK' om je gemiddelde cijfer te zien.";
        okKnop = new Button("OK");
        TotaalCijfers = 0;
        TotaalAantalCijfers = 0;
        gemiddelde = 0;
        add(tekstvak);
        add(okKnop);

        tekstvak.addActionListener(new CijferListener());
        okKnop.addActionListener(new okKnopListener());
    }

    public void paint(Graphics g) {
        g.drawString("Vul je cijfer in.",50,50);
        g.drawString(gemiddeldeCijfer,50,80);
        tekstvak.setLocation(50,100);
        g.drawString(Cijfer,50,190);
        okKnop.setLocation(10,100);
    }

    class CijferListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();
            ingevoerdeCijfer = Double.parseDouble(userInput);

            if (ingevoerdeCijfer > 5.5) {
                Cijfer = "Met een "+ ingevoerdeCijfer + " Heb je een voldoende";
                TotaalAantalCijfers++;
                TotaalCijfers = TotaalCijfers + ingevoerdeCijfer;
                gemiddelde = TotaalCijfers / TotaalAantalCijfers;
            } if (ingevoerdeCijfer < 5.5) {
                Cijfer = "Met een "+ ingevoerdeCijfer + " Heb je een onvoldoende";
                TotaalAantalCijfers++;
                TotaalCijfers = TotaalCijfers + ingevoerdeCijfer;
                gemiddelde = TotaalCijfers / TotaalAantalCijfers;
            } if (ingevoerdeCijfer == 5.5) {
                Cijfer = "Met een "+ ingevoerdeCijfer + " Heb je een voldoende";
                TotaalAantalCijfers++;
                TotaalCijfers = TotaalCijfers + ingevoerdeCijfer;
                gemiddelde = TotaalCijfers / TotaalAantalCijfers;
            } if (ingevoerdeCijfer > 10) {
                Cijfer = "Dit cijfer is niet mogelijk. Vul opnieuw al je cijfers in.";
                TotaalAantalCijfers = + 0;
                TotaalCijfers = + 0;
                gemiddelde = + 0;
            } if (ingevoerdeCijfer < 1) {
                Cijfer = "Dit cijfer is niet mogelijk. Vul opnieuw al je cijfers in.";
                TotaalAantalCijfers = + 0;
                TotaalCijfers = + 0;
                gemiddelde = + 0;
            }

            tekstvak.setText("");
            repaint();
        }
    }
    class okKnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();
            ingevoerdeCijfer = Double.parseDouble(userInput);

            if (ingevoerdeCijfer > 5.5) {
                gemiddeldeCijfer = "Gemiddelde cijfer is: " + gemiddelde;
            }
            if (ingevoerdeCijfer < 5.5) {

            }
            if (ingevoerdeCijfer == 5.5) {

            }
            if (ingevoerdeCijfer > 10) {
                TotaalAantalCijfers = +0;
                TotaalCijfers = +0;
                gemiddelde = +0;
            }
            if (ingevoerdeCijfer < 1) {
                TotaalAantalCijfers = +0;
                TotaalCijfers = +0;
                gemiddelde = +0;
            }

            tekstvak.setText("");
            repaint();
        }
    }
}
