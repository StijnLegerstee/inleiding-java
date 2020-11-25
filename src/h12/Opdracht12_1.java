package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht12_1 extends Applet {
    double[] numbers;
    double sum;
    double average;

    public void init() {
        numbers = new double[10];
        sum = 0;
//        numbers[0] = 1;
//        numbers[1] = 2;
        for (int indexNumber  = 0; indexNumber < numbers.length; indexNumber++){
            numbers[indexNumber] = indexNumber;
            sum = sum + numbers[indexNumber];
        }
        System.out.println(sum / numbers.length);

    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + sum / numbers.length, 100, 100);
    }
}
