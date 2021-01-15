package Demo;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    Button okKnop;
    TextField tekstVak;
    double km;
    double miles;

    public void init() {
        okKnop = new Button("ok");
        tekstVak = new TextField("",10);

        km = 0;
        miles = 0;

        add(okKnop);
        add(tekstVak);

        okKnop.addActionListener(new ActieLuisteraar());

    }

    public void paint(Graphics g) {
        g.drawString("" + miles +  "M/h",60,50);
    }

    class ActieLuisteraar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String message = tekstVak.getText();
            miles = Double.parseDouble(message) * 0.63;
            repaint();
        }
    }
}
