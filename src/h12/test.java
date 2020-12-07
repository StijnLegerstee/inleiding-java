package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test extends Applet {

    String[] woorden = { "ingevoegd", "hypotheken", "zaanstad", "uitgesloten", "hobby" };


    public void init() {

    }

    public void paint(Graphics g) {

        for (int i = 0; i < woorden.length; i++) {
            g.drawString(woorden[i] + i,20,i * 20 + 20);
        }

    }

    class TextToTerminal implements ActionListener {

        public void actionPerformed(ActionEvent e) {

        }
    }
}
