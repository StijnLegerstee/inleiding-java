package h12;

import javax.swing.*;
import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class Opdracht12_3 extends Applet {

    Button okKnop;
    TextField[] tekstVak;
    int[] getal;

    public void init() {
        tekstVak = new TextField[5];
        okKnop = new Button("Ok");
        add(okKnop);

        getal = new int[5];

        for (int i = 0; i < tekstVak.length; i++) {
            tekstVak[i] = new TextField("", 20);
            add(tekstVak[i]);
        }

        okKnop.addActionListener(new TextToTerminal());


    }

    public void paint(Graphics g) {

    }

    class TextToTerminal implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < tekstVak.length; i++) {
                String userInput = tekstVak[i].getText();
                getal[i] = Integer.parseInt(userInput);
            }
            Arrays.sort(getal);

            for (int i = 0; i < tekstVak.length; i++) {
                tekstVak[i].setText("" + getal[i]);

            }
        }
    }
}
