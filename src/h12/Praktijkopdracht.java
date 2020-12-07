package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {

    String namen[] = new String[10];
    int telefoonnummers[] = new int[10];

    Label tekst = new Label("Voer uw naam en telefoonnummer in");
    Button submit = new Button("Submit");

    Label naam = new Label("Naam: ");
    TextField tekstVeldNaam = new TextField("",20);

    Label telefoonnummer = new Label("Telefoonnummer: ");
    TextField tekstveldTelefoon = new TextField("",20);

    int toon = 0;
    int toonScherm = 10;

    public void init() {

        setSize(800,400);

        add(tekst);
        add(naam);
        add(tekstVeldNaam);
        add(telefoonnummer);
        add(tekstveldTelefoon);
        add(submit);

        submit.addActionListener(new SubmitListener());
    }

    public void paint(Graphics g) {
        if (toon == 10) {
            for (int i = 0; i <10; i++) {
                String nummer = String.valueOf(i + 1) + "";
                g.drawString(" naam: " + namen[i] +" telefoonnummer: " + telefoonnummers[i],100,70 + (i + 1) * 15);
            }
        } else {
            g.drawString("nog " + toonScherm + " telefoonnummers en namen te gaan",100,70);
        }
    }

    private class SubmitListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            namen[toon] = tekstVeldNaam.getText();
            telefoonnummers[toon] = Integer.parseInt(tekstveldTelefoon.getText());
            toon++;
            toonScherm--;
            repaint();

            tekstVeldNaam.setText("");
            tekstveldTelefoon.setText("");
        }
    }
}