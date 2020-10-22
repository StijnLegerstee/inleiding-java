package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kladblok extends Applet {

    //Declareren
    Button voorbeeldKnopje;
    TextField voorbeeldTekstvak;
    Label stickertje;
    double counter;
    Color backgroundColor = Color.orange;
    int xCoordinaatVanDeLijn;

    public void init() {
        //Init
        voorbeeldKnopje = new Button("Klik mij!");
        voorbeeldTekstvak = new TextField("",30);
        stickertje = new Label("Ik ben een label.");
        add(voorbeeldKnopje);
        add(voorbeeldTekstvak);
        add(stickertje);
        counter = 1;
        backgroundColor = Color.orange;
        xCoordinaatVanDeLijn = 20;

        // Aansluiten knopje op ActionListener
        voorbeeldKnopje.addActionListener(new TextToTerminalListener());


    }
    public void paint(Graphics g) {

        voorbeeldKnopje.setLocation(20,20);
        voorbeeldTekstvak.setLocation(20,60);
        stickertje.setLocation(20,100);
        voorbeeldKnopje.setLabel("Verander mij in de tekst hieronder!");
        voorbeeldKnopje.setSize(300,40);
        voorbeeldTekstvak.setSize(300,40);
        stickertje.setSize(300,40);
        g.drawLine(xCoordinaatVanDeLijn,20,xCoordinaatVanDeLijn,380);

    }

    class TextToTerminalListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String message = voorbeeldTekstvak.getText();
            voorbeeldKnopje.setLabel(message);
            stickertje.setText(message);
            xCoordinaatVanDeLijn += 20;
            repaint();

        }

    }



}
