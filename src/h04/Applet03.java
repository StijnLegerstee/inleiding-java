package h04;

//Opdracht 4.4

import java.awt.*;
import java.applet.*;

public class Applet03 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        //Y-as
        g.setColor(Color.black);
        g.drawLine(50,15,50,220);
        //X-as
        g.setColor(Color.black);
        g.drawLine(50,220,250,220);
        //Lijnen
        g.setColor(Color.gray);
        g.drawLine(51,180,250,180);
        g.setColor(Color.gray);
        g.drawLine(51,140,250,140);
        g.setColor(Color.gray);
        g.drawLine(51,100,250,100);
        g.setColor(Color.gray);
        g.drawLine(51,60,250,60);
        g.setColor(Color.gray);
        g.drawLine(51,20,250,20);
        //Y-as nummers
        g.setColor(Color.black);
        g.drawString("0",35,220);
        g.setColor(Color.black);
        g.drawString("20",30,180);
        g.setColor(Color.black);
        g.drawString("40",30,140);
        g.setColor(Color.black);
        g.drawString("60",30,100);
        g.setColor(Color.black);
        g.drawString("80",30,60);
        g.setColor(Color.black);
        g.drawString("100",25,20);
        //X-as namen
        g.setColor(Color.black);
        g.drawString("Valerie",55,235);
        g.setColor(Color.black);
        g.drawString("Jeroen",125,235);
        g.setColor(Color.black);
        g.drawString("Hans",205,235);
        //Balken
        g.setColor(Color.pink);
        g.fillRect(55,140,35,80);
        g.setColor(Color.blue);
        g.fillRect(125,20,35,200);
        g.setColor(Color.green);
        g.fillRect(205,60,35,160);
        //Info
        g.setColor(Color.black);
        g.drawString("Hoogte = gewicht in kilogram",50,280);
        g.setColor(Color.black);
        g.drawString("Valerie",290,100);
        g.setColor(Color.pink);
        g.fillRect(275,90,10,10);
        g.setColor(Color.black);
        g.drawString("Jeroen",290,140);
        g.setColor(Color.blue);
        g.fillRect(275,130,10,10);
        g.setColor(Color.black);
        g.drawString("Hans",290,180);
        g.setColor(Color.green);
        g.fillRect(275,170,10,10);
    }
}
