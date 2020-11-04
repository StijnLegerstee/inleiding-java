package h08;

//Praktijkopdracht

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht extends Applet {

    TextField TextField;

    public void init() {
        TextField = new TextField("",30);
        add(TextField);

    }

    public void paint(Graphics g) {
        TextField.setLocation(20,20);

    }

    class TextToTerminalListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            repaint();

        }
    }
}
