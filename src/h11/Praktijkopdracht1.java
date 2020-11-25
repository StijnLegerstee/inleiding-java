package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht1 extends Applet {

    TextField tekstvak;
    Button OkKnop;
    String tafel;

    public void init() {
        tekstvak = new TextField("", 20);
        OkKnop = new Button("OK");
        add(tekstvak);
        tekstvak.addActionListener(new TekstvakListener());

    }

    public void paint(Graphics g) {

    }

    class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            repaint();

        }
    }
}
