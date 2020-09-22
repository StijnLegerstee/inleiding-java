package h04;

//Praktijkopdracht

import java.awt.*;
import java.applet.*;

public class Applet07 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        //lijn
        g.setColor(Color.black);
        g.drawLine(10,10,230,10);
        g.setColor(Color.black);
        g.drawString("Lijn",105,25);
        //Rechthoek
        g.setColor(Color.black);
        g.drawRect(10,30,220,100);
        g.drawString("Rechthoek",90,145);
        //Afgeronde rechthoek
        g.setColor(Color.black);
        g.drawRoundRect(10,165,220,100,30,30);
        g.drawString("Afgeronde rechthoek",65,280);
        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(240,30,220,100);
        g.setColor(Color.black);
        g.drawOval(240,30,220,100);
        g.drawString("Gevulde rechthoek met ovaal",270,145);
        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(240,165,220,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",310,280);
        //Taartpunt met ovaal eromheen
        g.setColor(Color.black);
        g.drawOval(470,30,220,100);
        g.drawString("Taartpunt met ovaal eromheen",490,145);
        g.setColor(Color.magenta);
        g.fillArc(470,30,220,100,0,45);
        //Cirkel
        g.setColor(Color.black);
        g.drawOval(520,150,100,100);
        g.drawString("Cirkel",555,265);
    }
}
