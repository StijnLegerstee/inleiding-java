package h08;

//Opdracht 8.1

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht8_1 extends Applet {
    Button okKnop;
    Button resetKnop;
    TextField okKnopTextField;
    Label uitkomst;

    public void init() {
        okKnop = new Button("OK");
        resetKnop = new Button("Reset");
        okKnopTextField = new TextField("",30);
        uitkomst = new Label("Tekst hier");
        add(okKnop);
        add(resetKnop);
        add(okKnopTextField);
        add(uitkomst);

        okKnop.addActionListener(new TextToTerminalListener());
        resetKnop.addActionListener(new ResetTextOnTerminal());
    }

    public void paint(Graphics g) {
        okKnop.setLocation(20,20);
        okKnop.setSize(50,20);
        resetKnop.setLocation(20,50);
        resetKnop.setSize(50,20);
        okKnopTextField.setLocation(80,20);
        uitkomst.setLocation(20,100);
        uitkomst.setSize(300,40);
    }

    class TextToTerminalListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String message = okKnopTextField.getText();
            uitkomst.setText(message);
            repaint();
        }
    }

    class ResetTextOnTerminal implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            okKnopTextField.setText("");
            repaint();
        }
    }
}
