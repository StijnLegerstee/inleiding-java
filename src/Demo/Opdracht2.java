package Demo;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {

    int ingevoerdeleeftijd;
    String leeftijd;
    TextField tekstVak;
    Label tekstVakLabel;

    public void init() {
        ingevoerdeleeftijd = 0;
        tekstVak = new TextField("",10);
        tekstVakLabel = new Label("Voer een leeftijd in");
        leeftijd = "";

        add(tekstVak);
        add(tekstVakLabel);

        tekstVak.addActionListener(new ActionPerformed());
    }

    public void paint(Graphics g) {
        g.drawString("" + leeftijd,50,60);
    }

    class ActionPerformed implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String message = tekstVak.getText();
            ingevoerdeleeftijd = Integer.parseInt(message);

            switch(ingevoerdeleeftijd){
                case 1:
                    leeftijd = "baby";
                    break;
                case 2:
                case 3:
                    leeftijd = "Peuter";
                    break;
                case 4:
                case 5:
                case 6:
                    leeftijd = "kleuter";
                    break;
                case 7:
                case 8:
                case 9:
                    leeftijd = "Kind";
                    break;
                case 10:
                case 11:
                case 12:
                    leeftijd = "Tiener";
                    break;
                default:
                    leeftijd = "Je hebt geen leeftijd ingevult of het ingevoerde cijfer is incorrect.";
                    break;
            }
            repaint();
        }
    }
}
