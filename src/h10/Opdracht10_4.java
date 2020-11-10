package h10;

// Opdracht 10.4

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_4 extends Applet {

    TextField tekstvak;
    String greeting;

    public void init() {
        tekstvak = new TextField("",30);
        add(tekstvak);
        tekstvak.addActionListener(new GroetListener());
        greeting = "...";
    }

    public void paint(Graphics g) {
        g.drawString("Kies een maandnummer.",50,50);
        tekstvak.setLocation(50,100);
        g.drawString(greeting,50,160);
    }

    class GroetListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();

            switch (userInput) {
                case "1": greeting = "Januari is de eerste maand en heeft 31 dagen."; break;
                case "2": greeting = "Febuari is de tweede maand en heeft 29 dagen."; break;
                case "3": greeting = "Maart is de derde maand en heeft 31 dagen."; break;
                case "4": greeting = "April is de vierde maand en heeft 30 dagen."; break;
                case "5": greeting = "Mei is de vijfde maand en heeft 31 dagen."; break;
                case "6": greeting = "Juni is de zesde maand en heeft 30 dagen."; break;
                case "7": greeting = "Juli is de zevende maand en heeft 31 dagen."; break;
                case "8": greeting = "Augustus is de achtste maand en heeft 31 dagen."; break;
                case "9": greeting = "September is de negende maand en heeft 30 dagen."; break;
                case "10": greeting = "Oktober is de tiende maand en heeft 31 dagen."; break;
                case "11": greeting = "November is de elfde maand en heeft 30 dagen."; break;
                case "12": greeting = "December is de twaalfde maand en heeft 31 dagen."; break;
                default: greeting = "...";
            }
            tekstvak.setText("");
            repaint();
        }
    }

}
