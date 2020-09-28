package h05;

//Opdracht 5.1

import java.awt.*;
import java.applet.*;

public class opdracht5_1 extends Applet {

    //breedte en hoogte
    int breedte, hoogte;

    //Kleuren
    Color achtergrond;
    Color tekstkleur;
    Color lijnkleur;
    Color gevuldekleur;


    public void init() {
        breedte = 220;
        hoogte = 100;
        achtergrond = Color.white;
        tekstkleur = Color.black;
        lijnkleur = Color.black;
        gevuldekleur = Color.magenta;
    }

    public void paint(Graphics g) {
        setBackground(achtergrond);
        //lijn
        g.setColor(lijnkleur);
        g.drawLine(10,10,230,10);
        g.setColor(tekstkleur);
        g.drawString("Lijn",105,25);
        //Rechthoek
        g.setColor(lijnkleur);
        g.drawRect(10,30, breedte, hoogte);
        g.setColor(tekstkleur);
        g.drawString("Rechthoek",90,145);
        //Afgeronde rechthoek
        g.setColor(lijnkleur);
        g.drawRoundRect(10,165, breedte, hoogte,30,30);
        g.setColor(tekstkleur);
        g.drawString("Afgeronde rechthoek",65,280);
        //Gevulde rechthoek met ovaal
        g.setColor(gevuldekleur);
        g.fillRect(240,30, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(240,30, breedte, hoogte);
        g.setColor(tekstkleur);
        g.drawString("Gevulde rechthoek met ovaal",270,145);
        //Gevulde ovaal
        g.setColor(gevuldekleur);
        g.fillOval(240,165, breedte, hoogte);
        g.setColor(tekstkleur);
        g.drawString("Gevulde ovaal",310,280);
        //Taartpunt met ovaal eromheen
        g.setColor(lijnkleur);
        g.drawOval(470,30, breedte, hoogte);
        g.setColor(tekstkleur);
        g.drawString("Taartpunt met ovaal eromheen",490,145);
        g.setColor(gevuldekleur);
        g.fillArc(470,30, breedte, hoogte,0,45);
        //Cirkel
        g.setColor(lijnkleur);
        g.drawOval(520,150,100,100);
        g.setColor(tekstkleur);
        g.drawString("Cirkel",555,265);
    }
}
