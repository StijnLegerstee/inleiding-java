package h08;

//Opdracht 8.3

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht8_3 extends Applet {
    Button okKnop;
    TextField knopTextField;
    Label uitkomst;
    double btw;

    public void init() {
        okKnop = new Button("OK");
        knopTextField = new TextField("",30);
        uitkomst = new Label("");
        add(okKnop);
        add(knopTextField);
        add(uitkomst);

        okKnop.addActionListener(new TextToTerminalListener());
    }

    public void paint(Graphics g) {
        okKnop.setLocation(20,20);
        okKnop.setSize(50,20);
        knopTextField.setLocation(80,20);
        uitkomst.setSize(300,40);
        g.drawString("Inclusief 21% BTW: " + btw + "€",20,100);
    }

    class TextToTerminalListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String message = knopTextField.getText();
            btw = Double.parseDouble(message) * 1.21;
            repaint();

        }
    }
}
