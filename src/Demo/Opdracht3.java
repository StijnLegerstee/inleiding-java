package Demo;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {
    TextField tekstVak;
    Label tekstVakLabel;
    int leeftijd;
    String uitkomst;

    public void init() {
        tekstVak = new TextField("",10);
        tekstVakLabel = new Label("Vul je leeftijd in");
        leeftijd = 0;

        add(tekstVak);
        add(tekstVakLabel);

        tekstVak.addActionListener(new ActionPerformed());
    }

    public void paint(Graphics g) {
        g.drawString("" + uitkomst,40,50);
    }

    class ActionPerformed implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String message = tekstVak.getText();
            leeftijd = Integer.parseInt(message);

            if (leeftijd < 18) {
                uitkomst = "Je bent niet oud genoeg";
            }
            else {
                uitkomst = "Je bent oud genoeg";
            }
            repaint();
        }
    }
}
