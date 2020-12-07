package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht12_4 extends Applet {

    int waarde[] = { 9, 23, 69, 89, 103, 127, 150 };
    TextField tekstVak = new TextField("",20);
    Button okKnop = new Button("OK");

    int nummer;
    int index;
    boolean controle = false;


    public void init() {

        add(tekstVak);
        add(okKnop);

        okKnop.addActionListener(new EnterListener());
    }

    public void paint(Graphics g) {
        if (controle == true) {
            g.drawString("De waarde is op de plaats " + index + "." ,50,75);
        } else {
            g.drawString("Er is geen bijbehoorende waarde gevonden van dit getal.",50,75);
        }
    }

    class EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            controle = false;
            nummer = Integer.parseInt(tekstVak.getText());

            for(int i = 0; i < waarde.length; i++) {
                if (nummer == waarde[i]) {
                    index = i;
                    controle = true;
                }
            }
            repaint();
        }
    }
}