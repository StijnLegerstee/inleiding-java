package h11;

import java.applet.Applet;
import java.awt.*;
import java.util.Scanner;

public class Loopjes extends Applet {

    Scanner scanner = new Scanner(System.in);

    public void init() {

        // 1. FOR-LOOP
        // Gebruik je als je al weet hoeveel herhalingen je wilt
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Hallo ik ben Stijn." + i);
            
        }

        // 2. WHILE-LOOP
        // Gebruik je als het aantal herhalingen ergens van afhangt
        System.out.println("Hoeveel is 4 x 8?");
        boolean klaar = false;
        while (klaar == false) {
            int gokje = scanner.nextInt();
            if (gokje == 32) {
                System.out.println("Goed zo!");
                klaar = true;
            } else {
                System.out.println("Gues again!");
            }
        }
        System.out.println("Klaar.");

    }

    public void paint(Graphics g) {

    }

}
