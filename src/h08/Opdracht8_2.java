package h08;

//Opdracht 8.2

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht8_2 extends Applet {
    Button Mannen;
    Button Vrouwen;
    Button PotentieleMannen;
    Button PotentieleVrouwen;
    int countertotaal;
    int mannencounter;
    int vrouwencounter;
    int potentielemannencounter;
    int potentielevrouwencounter;

    public void init() {
        Mannen = new Button("Mannen");
        Vrouwen = new Button("Vrouwen");
        PotentieleMannen = new Button("Potentiële Mannen");
        PotentieleVrouwen = new Button("Potentiële Vrouwen");
        add(Mannen);
        add(Vrouwen);
        add(PotentieleMannen);
        add(PotentieleVrouwen);
        countertotaal = 0;
        mannencounter = 0;
        vrouwencounter = 0;
        potentielemannencounter = 0;
        potentielevrouwencounter = 0;

        Mannen.addActionListener(new TotaalAantal());
        Vrouwen.addActionListener(new TotaalAantal());
        PotentieleMannen.addActionListener(new TotaalAantal());
        PotentieleVrouwen.addActionListener(new TotaalAantal());

        Mannen.addActionListener(new MannenCounter());
        Vrouwen.addActionListener(new VrouwenCounter());
        PotentieleMannen.addActionListener(new PotentieleMannenCounter());
        PotentieleVrouwen.addActionListener(new PotentieleVrouwenCounter());
    }

    public void paint(Graphics g) {
        Mannen.setLocation(20,20);
        Mannen.setSize(50,20);
        g.drawString("Aantal mannen: " + mannencounter,80,35);

        Vrouwen.setLocation(20,50);
        Vrouwen.setSize(50,20);
        g.drawString("Aantal vrouwen: " + vrouwencounter,80,65);

        PotentieleMannen.setLocation(20,80);
        PotentieleMannen.setSize(110,20);
        g.drawString("Aantal potentiële mannen: " + potentielemannencounter,140,95);

        PotentieleVrouwen.setLocation(20,110);
        PotentieleVrouwen.setSize(110,20);
        g.drawString("Aantal potentiële vrouwen: " + potentielevrouwencounter,140,125);

        g.drawString("Totaal: " + countertotaal,20,180);
    }

    class TotaalAantal implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            countertotaal++;
            repaint();
        }
    }
    class MannenCounter implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            mannencounter++;
            repaint();
        }
    }
    class VrouwenCounter implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            vrouwencounter++;
            repaint();
        }
    }
    class PotentieleMannenCounter implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            potentielemannencounter++;
            repaint();
        }
    }
    class PotentieleVrouwenCounter implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            potentielevrouwencounter++;
            repaint();
        }
    }
}
