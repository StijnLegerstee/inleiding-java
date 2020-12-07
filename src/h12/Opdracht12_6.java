package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht12_6 extends Applet {

    int waarde[] = { 3, 2, 5, 8, 1, 5, 2, 8, 3, 7, 10, 4, 3, 6, 9, 7, 1, 1, 10, 9, 5, 10, 7 };
    Label tekst = new Label("Voer een getal in tussen 1-10");
    TextField tekstVak = new TextField("",20);
    Button okKnop = new Button("OK");

    int nummer = 0;
    int komtVoor = 0;

    public void init() {

        add(tekst);
        add(tekstVak);
        add(okKnop);

        okKnop.addActionListener(new EnterListener());
    }

    public void paint(Graphics g) {
        g.drawString("Het ingevulde getal komt "+ komtVoor +" keer voor in de array",50,75);
    }

    class EnterListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            komtVoor = 0;
            nummer = Integer.parseInt(tekstVak.getText());
            for (int i = 0; i < waarde.length; i++) {
                if (nummer == waarde[i]) {
                    komtVoor++;
                }
            }
            repaint();
        }
    }

}