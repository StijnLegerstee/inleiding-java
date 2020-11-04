package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tutorial extends Applet {

    TextField tekstvak;
    String greeting;

    public void init() {
        tekstvak = new TextField("",30);
        add(tekstvak);
        tekstvak.addActionListener(new GroetListener());
        greeting = "...";
    }

    public void paint(Graphics g) {
        g.drawString("Kies uit de woorden: ochtend, middag, avond, nacht.",50,50);
        tekstvak.setLocation(50,100);
        g.drawString(greeting,50,160);
    }

    class GroetListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();
//            if (userInput.equals("ochtend")) {
//                greeting = "Goedemorgen Wereld!";
//            } else if (userInput.equals("middag")) {
//                greeting = "Goedemiddag Wereld!";
//            } else if (userInput.equals("avond")) {
//                greeting = "Goedenavond Wereld!";
//            } else if (userInput.equals("nacht")) {
//                greeting = "Goedenacht Wereld!";
//            } else {
//                greeting = "...";
//            }
            switch (userInput) {
                case "ochtend": greeting = "Goedemorgen Wereld!"; break;
                case "middag": greeting = "Goedemiddag Wereld!"; break;
                case "avond": greeting = "Goedenavond Wereld!"; break;
                case "nacht": greeting = "Goedenacht Wereld!"; break;
                default: greeting = "...";
            }
            tekstvak.setText("");
            repaint();
        }
    }

}
