package h08;

//Opdracht 8.2

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht8_2 extends Applet {
    Button Mannen;
    Button Vrouwen;
    Button PotentieeleMannen;
    Button PotentieeleVrouwen;

    public void init() {
        Mannen = new Button("Mannen");
        Vrouwen = new Button("Vrouwen");
        PotentieeleMannen = new Button("PotentieeleMannen");
        PotentieeleVrouwen = new Button("PotentieeleVrouwen");
        add(Mannen);
        add(Vrouwen);
        add(PotentieeleMannen);
        add(PotentieeleVrouwen);

        Mannen.addActionListener(new TextToTerminalListener());
        Vrouwen.addActionListener(new TextToTerminalListener());
        PotentieeleMannen.addActionListener(new TextToTerminalListener());
        PotentieeleVrouwen.addActionListener(new TextToTerminalListener());
    }

    public void paint(Graphics g) {
        Mannen.setLocation(20,20);
        Mannen.setSize(50,20);

        Vrouwen.setLocation(20,50);
        Vrouwen.setSize(50,20);

        PotentieeleMannen.setLocation(20,20);
        PotentieeleMannen.setSize(50,20);

        PotentieeleVrouwen.setLocation(20,50);
        PotentieeleVrouwen.setSize(50,20);
    }

    class TextToTerminalListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String message = iets.getText();
            ietsandrs.setText(message);
            repaint();
        }
    }
}
